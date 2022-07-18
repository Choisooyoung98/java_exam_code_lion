package chapter33;

public class Practice2 {
//code.oa.gg/java8/1129
    public static void main(String[] args) {
        HashMap2 aMap = new HashMap2();

        aMap.put(1, "안녕");
        aMap.put("A", false);

        System.out.println(aMap.get("A"));
        // 출력 : false
    }
}

class HashMap2 {
    Object[] keys;
    Object[] datas;
    int size;
    HashMap2() {
        keys = new Object[100];
        datas = new Object[100];
        size = -1;
    }
    void put(Object key, Object data) {
        ++size;
        keys[size] = key;
        datas[size] = data;
    }
    Object get(Object key) {
        for (int i = 0; i <= size; i++) {
            if (key.equals(keys[i]))
                return datas[i];
        }
        return null;
    }
}