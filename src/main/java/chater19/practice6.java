package chater19;

public class practice6 {
    public static void main(String[] args) {
        new 사람3();
    }
}
    class 동물1 {
        동물1(String 이름) {
            System.out.println("동물(String 이름) 실행됨!");
            System.out.println("이름 : " + 이름);
        }
        동물1(String 이름, int 나이) {
            System.out.println("동물(String 이름, int 나이) 실행됨!");
            System.out.println("이름 : " + 이름);
            System.out.println("나이 : " + 나이);
        }
    }
    class 사람3 extends 동물1 {
        사람3(){
            super("홍길동", 25);
        }
    }
