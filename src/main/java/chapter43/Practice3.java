package chapter43;

public class Practice3 {
    public static void main(String[] args) {
        Activity3 activity = new MainActivity3();
        activity.onCreate();
    }
}

abstract class Activity3 {
    abstract public void onCreate();
}

class MainActivity3 extends Activity3 {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다.");

        // 아래 코드가 실행되도록 해주세요.
        View3.OnClickListener3 a = new 사과3();
        View3 aButton = new Button3(this);
        aButton.setOnClickListener(a);
    }
}

abstract class View3 {
    public void setOnClickListener(OnClickListener3 a) {
    }

    static interface OnClickListener3 {
    }
}
class 사과3 implements View3.OnClickListener3 {

}
class Button3 extends View3 {
    public Button3(MainActivity3 mainActivity3) {

    }
}

/*
// 정답 v2
class View {
	static class OnClickListener {
	}
}
*/