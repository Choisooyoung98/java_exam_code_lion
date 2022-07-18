package chapter34;

public class Practice4 {
//code.oa.gg/java8/1348
// 문제 : 아래가 실행되도록 해주세요.
// 조건 : Main 클래스는 수정 할 수 없습니다.
// 조건 : 각 클래스의 기존 메서드는 삭제/수정 할 수 없습니다.
// 조건 : 그 외의 모든 것은 전부 수정가능합니다.
// 조건 : 소스코드 중복이 있으면 안됩니다.
    public static void main(String[] args) {
        진찰하다(new 사람4());
        // 출력 : 사람이 진찰합니다.
        진찰하다(new 원숭이4());
        // 출력 : 원숭이가 진찰합니다.
        진찰하다(new 치타4());
        // 출력 : 치타가 진찰합니다.
        진찰하다(new 기린4());
        // 출력 : 기린이 진찰합니다.
        진찰하다(new 로봇4());
        // 출력 : 로봇이 진찰합니다.
        진찰하다(new 삼성4());
        // 출력 : 삼성이 진찰합니다.
        진찰하다(new LG4());
        // 출력 : 삼성이 진찰합니다.
    }

    // 여기에 static 추가
    public static void 진찰하다(의사4 a의사) {
        a의사.진찰();
    }
}

class 사람4 implements 의사4 {
    public void 진료() {
        System.out.println("사람이 진찰합니다.");
    }

    @Override
    public void 진찰() {
        진료();
    }
}

class 원숭이4 implements 의사4 {
    public void 살펴보다() {
        System.out.println("원숭이가 진찰합니다.");
    }
    @Override
    public void 진찰() {
        살펴보다();
    }
}

class 치타4 implements 의사4 {
    public void 진찰() {
        System.out.println("치타가 진찰합니다.");
    }
}

class 기린4 implements 의사4 {
    public void 진찰() {
        System.out.println("기린이 진찰합니다.");
    }
}

class 로봇4 implements 의사4 {
    public void 오류감지() {
        System.out.println("로봇이 진찰합니다.");
    }
    @Override
    public void 진찰() {
        오류감지();
    }
}

class 삼성4 implements 의사4 {
    public void 삼성병원에_진찰하라고_지시() {
        System.out.println("삼성이 진찰합니다.");
    }
    @Override
    public void 진찰() {
        삼성병원에_진찰하라고_지시();
    }
}

class LG4 implements 의사4 {
    public void 삼성병원에_진찰하라고_지시() {
        System.out.println("LG가 진찰합니다.");
    }
    @Override
    public void 진찰() {
        삼성병원에_진찰하라고_지시();
    }
}

interface 의사4 {
    void 진찰();
}