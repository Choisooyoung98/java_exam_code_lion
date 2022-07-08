package chapter20;

public class exam1 {
    public static void main(String[] args) {
        사람2 a사람 = new 사람2();

        동물1 a동물 = a사람;
        a동물.이름 = "홍길순"; // 동물 이름

        a사람.이름 = "홍길동"; // 사람 이름

        System.out.println(a동물.test()); // 홍길순
        System.out.println("==");
        System.out.println(a사람.test()); // 홍길동
    }
}
class 동물1 {
    String 이름;
    String test() {
        return 이름;
    }
}
class 사람2 extends 동물1 {
    String 이름;
    String test() {
        System.out.println(super.test());
        return 이름;
    }
}