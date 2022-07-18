package chapter33;

public class Practice1 {
//code.oa.gg/java8/1127
    public static void main(String[] args) {
        HashMap1 aMap = new HashMap1();

        aMap.put(1, "안녕");
        aMap.put("A", false);
    }
}
class HashMap1 {
    Object index;
    Object datas;
    void put(Object index, Object data) {
        this.index = index;
        this.datas = data;
    }
}