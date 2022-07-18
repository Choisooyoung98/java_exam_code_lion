package chapter33;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Practice4 {
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : ages객체 put 메서드는 인자로 String, Integer 만 입력가능해야 합니다.
// 조건 : ages객체의 get 메서드는 Integer 를 리턴해야 합니다.
// 조건 : everyone객체 put 메서드는 인자로 String, Object 만 입력가능해야 합니다.
// 조건 : everyone객체의 get 메서드는 Object 를 리턴해야 합니다.
    public static void main(String[] args) {
        HashMap4<String, Integer> ages = new HashMap4<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        for ( String name : ages.keySet() ) {
            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
        HashMap4<String, Object> everyone = new HashMap4<>();
        everyone.put("사람", new 사람());
        everyone.put("원숭이", new 원숭이());
        ((사람)everyone.get("사람")).말하다();
        // 출력 => 사람이 말합니다.
        ((원숭이)everyone.get("원숭이")).묘기를_부리다();
        // 출력 => 원숭이가 묘기를 부립니다.
    }
}
class HashMap4<K, V> {
    private Object[] keys;
    private Object[] values;
    private int size;
    HashMap4() {
        keys = new Object[100];
        values = new Object[100];
        size = 0;
    }
    public V get(K key){
        int keyIndex = indexOfKey(key);
        if (keyIndex != -1)
            return (V) values[keyIndex];
        return null;
    }
    public void put(K key, V value) {
        int keyIndex = indexOfKey(key);

        if (keyIndex != -1) {
            values[keyIndex] = value;
        }
        else {
            this.keys[size] = key;
            this.values[size] = value;
            size++;
        }
    }
    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++){
            if(key.equals(keys[i])){
                return i;
            }
        }
        return -1;
    }
    public int size() {
        return this.size;
    }
    public void remove(K key) {
        int keyIndex = indexOfKey(key);
        if (keyIndex != -1){
            for (int i = keyIndex; i < size; i++){
                keys[i] = keys[i+1];
                values[i] = values[i+1];
            }
            size--;
        }
    }
    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();
        for (int i = 0; i < size; i++){
            keySet.add(i,(K)keys[i]);
        }
        return keySet;
    }
}
class 사람 {
    String name;
    사람() {

    }
    사람(String name) {
        this.name = name;
    }
    void 말하다() {
        System.out.println("사람이 말합니다.");
    }

}
class 원숭이 {
    String name;
    원숭이() {

    }
    원숭이(String name) {
        this.name = name;
    }
    void 묘기를_부리다() {
        System.out.println("원숭이가 묘기를 부립니다.");
    }
}