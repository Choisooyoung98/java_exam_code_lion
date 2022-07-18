package chapter34;

public class Practice3 {
//code.oa.gg/java8/1346
// 문제 : 아래가 실행되도록 해주세요.
    public static void main(String[] args) {
        사람3 a사람 = new 사람3();

        변호사3 a변호사 = a사람;
        a변호사.변호하다();
        // 출력 : 사람이 변호 합니다.

        변호사3 a변호사2 = new 오랑우탄3();
        a변호사2.변호하다();
        // 출력 : 오랑우탄이 변호 합니다.

        의사3 a의사 = new 오랑우탄3();
        a의사.진찰하다();
        // 출력 : 오랑우탄이 진찰 합니다.

        의사3 a의사2 = new 사람3();
        a의사2.진찰하다();
        // 출력 : 사람이 진찰 합니다.
    }
}
class 사람3 implements 변호사3, 의사3 {
    @Override
    public void 변호하다() {
        System.out.println("사람이 변호 합니다.");
    }

    @Override
    public void 진찰하다() {
        System.out.println("사람이 진찰 합니다.");
    }
}
class 오랑우탄3 implements 변호사3, 의사3 {
    @Override
    public void 변호하다() {
        System.out.println("오랑우탄이 변호 합니다.");
    }
    @Override
    public void 진찰하다() {
        System.out.println("오랑우탄이 진찰 합니다.");
    }
}
interface 변호사3 {
    void 변호하다();
}
interface 의사3 {
    void 진찰하다();
}