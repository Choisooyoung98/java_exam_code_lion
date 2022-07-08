package chapter24;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(수학.PI);
        System.out.println(수학.더하기(10, 20));
    }
}
class 수학 {
    static double PI = 3.141592;
    static int 더하기(int a, int b) {
        return a + b;
    }
}