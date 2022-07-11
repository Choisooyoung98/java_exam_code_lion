package chapter26;

public class Practice6 {
//code.oa.gg/java8/985
// 문제 : 아래가 실행되도록 해주세요. 필요하다면 Main 클래스를 수정해도 됩니다.
    public static void main(String[] args) {
        동물2 a동물 = new 사람4();
        a동물.말하다();
        Object o = a동물;
        사람4 a사람 = (사람4)o;
        a사람.말하다();
    }
}
class 동물2 {
    void 말하다(){}
}
class 사람4 extends 동물2 {
}