package chapter37;

public class Practice2 {
//code.oa.gg/java8/1071
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
    public static void main(String[] args) {
        사람2 a사람 = new 사람2();

        // 구현시작
        a사람.setId(20);
        // 구현끝
        // 출력 : 제 번호는 20 입니다.
        System.out.println(a사람.getId());
    }
}

class 사람2 {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}