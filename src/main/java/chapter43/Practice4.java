package chapter43;

public class Practice4 {
    public static void main(String[] args) {
        Activity4 activity = new MainActivity4();
        activity.onCreate();
    }
}

abstract class Activity4 {
    abstract public void onCreate();
}

class MainActivity4 extends Activity4 {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다.");

        // 아래 코드가 실행되도록 해주세요.
        View4.OnClickListener4 a = new 사과4();
        View4 aButton = new Button4(this);
        aButton.setOnClickListener(a);

        aButton.fireClickEvent();
        // 출력 : 사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!
        // 조건 : 위 문구는 사과 클래스 안의 메서드에 의해서 출력되어야 합니다.
    }
}

abstract class View4 {
    public void fireClickEvent() {
    }

    static interface OnClickListener4 {
    }

    void setOnClickListener(OnClickListener4 onClickListener) {

    }
}

class Button4 extends View4 {
    Button4(Activity4 activity) {
    }
    @Override
    public void fireClickEvent() {
        System.out.println("사과는 버튼이 클릭되었다는 사실을 방금 알았습니다.!");
    }
}

class 사과4 implements View4.OnClickListener4 {
}


