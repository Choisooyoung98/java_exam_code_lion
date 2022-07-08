package chapter20;

public class exam2 {
        public static void main(String[] args) {
            사람3 a사람 = new 사람3();
            생물 a생물 = a사람;
            동물2 a동물 = a사람;
            a생물.이름 = "생물이름";
            a동물.이름 = "동물이름";
            a사람.이름 = "사람이름";

            a사람.test();
        }
    }
    class 생물 {
        String 이름;
    }
    class 동물2 extends 생물 {
        String 이름;
        String get이름() {
            return super.이름;
        }
    }
    class 사람3 extends 동물2 {
        String 이름;
        void test() {
            System.out.println(get이름());
        }
    }