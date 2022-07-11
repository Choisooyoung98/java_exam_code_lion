package chapter26;

public class Practice3 {
//code.oa.gg/java8/977
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요.
    public static void main(String[] args) {
        저장소1 a저장소1 = new 저장소1();

        a저장소1.저장(10);
        int 결과 = a저장소1.주세요();

        System.out.println(결과);
        // 출력 : 10
    }
}
class 저장소1 {
    int a;
    void 저장(int a) {
        this.a = a;
    }
    int 주세요() {
        return a;
    }
}