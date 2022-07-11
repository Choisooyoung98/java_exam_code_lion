package chapter26;

public class Practice5 {
//code.oa.gg/java8/981
// 문제 : 아래의 진행상활대로 코딩해주세요.
    public static void main(String[] args) {
        // Integer에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
        int i = 10;
        System.out.println(i + 20);
        Integer iObj = new Integer(10); // 수동박싱
        int k = iObj.intValue(); // 수동언박싱
        System.out.println(k + 20);
        Integer iObj2 = 30; // 오토박싱
        int i3 = iObj2 + 20 - iObj2 - iObj2; // 오토언박싱
        System.out.println(i3);

        // Boolean에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
        boolean b = false;
        System.out.println(b);
        Boolean bObj = new Boolean(b);
        boolean b2 = bObj.booleanValue();
        System.out.println(b2);
        Boolean bObj2 = false;
        Boolean b3 = new Boolean(true);
        b2 = bObj2;

        // Character에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
    }
}