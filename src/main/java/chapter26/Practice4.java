package chapter26;

public class Practice4 {
//code.oa.gg/java8/979
// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요. 필요하다면 다른 클래스도 만들어보세요. 필요하다면 main 메서드도 수정해주세요.
    public static void main(String[] args) {
        저장소2 a저장소 = new 저장소2();

        int i = 10;
        Integer iObj = new Integer(i);
        a저장소.저장(iObj);
        iObj = (Integer) a저장소.주세요();
        i = iObj.intValue();

        System.out.println(i);
        // 출력 1

        사람2 a사람1 = new 사람2();
        a저장소.저장(a사람1);
        a사람1 = (사람2) a저장소.주세요();
        a사람1.걷다();
        // 사람이 걷습니다.
    }
}
class 저장소2 {
    Object data;

    void 저장(Object o) {
        this.data = o;
    }

    Object 주세요() {
        return data;
    }
}

class 사람2 {
    void 걷다() {
        System.out.println("사람이 걷습니다.");
    }
}