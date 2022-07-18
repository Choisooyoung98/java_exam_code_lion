package chapter34;

public class Practice2 {
//code.oa.gg/java8/896
// 문제 : 아래가 실행되도록 해주세요.
    public static void main(String[] args) {
        사람2 a사람 = new 홍길동2();
        변호사2 a변호사 = (변호사2)a사람;
        치과의사2 a치과의사 = (치과의사2)a사람;
        성화봉송자2 a성화봉송자 = (성화봉송자2)a사람;
    }
}
abstract class 사람2 {}
class 홍길동2 extends 사람2 implements 변호사2, 치과의사2, 성화봉송자2{}
interface 변호사2{}
interface 치과의사2{}
interface 성화봉송자2{}