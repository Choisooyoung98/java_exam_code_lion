package chapter26;

public class Practice2 {
//code.oa.gg/java8/975
// 문제 : 저장소를 만들고 i의 값을 저장한 후 다시 받아보세요.
    public static void main(String[] args) {
        int i = 10;

        // 구현 시작
        저장소 저장소a = new 저장소();
        저장소a.저장(10);
        i = (int)저장소a.주세요();
        // 구현 끝

        System.out.println(i);
        // 출력 : 10
    }
}
class 저장소 {
    Object data;

    void 저장(Object o) {
        data = o;
    }
    Object 주세요() {
        return data;
    }
}
