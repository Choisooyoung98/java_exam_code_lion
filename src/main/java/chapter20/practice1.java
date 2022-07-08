package chapter20;

public class practice1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.이름 = "홍길동";
        동물 a동물 = a사람;
        a동물.이름 = "홍길순";

        System.out.println(a사람.이름);
        System.out.println(a동물.이름);
    }
}
class 동물 {
    String 이름;
}
class 사람 extends 동물 {
    String 이름;
}