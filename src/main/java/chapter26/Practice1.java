package chapter26;

public class Practice1 {
//code.oa.gg/java8/973
// 문제 : 아래코드의 오류를 수정해보세요.
    public static void main(String[] args) {
        long l = 200L;
        int i = (int)l;
        System.out.println(i);
        동물 a동물 = new 사람();
        a동물 = new 원숭이();

        원숭이 a원숭이 = (원숭이) a동물;
    }
}

class 사람 extends 동물 {
}

class 원숭이 extends 동물 {
}

class 동물 {
}