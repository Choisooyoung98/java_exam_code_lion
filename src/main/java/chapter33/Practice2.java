package chapter33;

public class Practice2 {
//code.oa.gg/java8/1129
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);

        System.out.println(aMap.get("A"));
        // 출력 : false
    }
}

