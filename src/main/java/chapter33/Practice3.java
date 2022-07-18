package chapter33;

public class Practice3 {
//code.oa.gg/java8/1131
// 문제 : 아래와 같이 출력되도록 해주세요.
    public static void main(String[] args) {
        HashMap3 aMap = new HashMap3();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);

        System.out.println(aMap.get("A"));
        // 출력 : true
    }
}

class HashMap3 {
    private Object[] keys;
    private Object[] datas;
    int size = 0;

    HashMap3() {
        keys = new Object[100];
        datas = new Object[100];
    }

    void put(Object key, Object data) {

        int sameKey = ifSameKey(key, data);
        if(sameKey >= 0){
            datas[sameKey] = data;
        }
        else {
            keys[size] = key;
            datas[size] = data;
            size++;
        }
    }

    Object get(Object key) {
        Object v = null;
        int index = -1;

        for ( int i = 0; i < size; i++ ) {
            if ( key.equals(keys[i]) ) {
                index = i;
                break;
            }
        }

        if ( index != -1 ) {
            v = datas[index];
        }

        return v;
    }
    int ifSameKey(Object key, Object data) {
        for(int i = 0; i <= size; i++){
            if(key.equals(keys[i])){
                return i;
            }
        }
        return -1;
    }
}
