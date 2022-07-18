package chapter34;

public class Practice1 {
//code.oa.gg/java8/894
// 문제 : 아래가 실행되도록 해주세요.
    public static void main(String[] args) {
        사람 a사람 = new 홍길동();
        변호사 a변호사 = (변호사)a사람;
    }
}

abstract class 사람{}
class 홍길동 extends 사람 implements 변호사{

}
interface 변호사{}