package chapter43;

public class Practice2 {
    public static void main(String[] args) {
        Activity2 activity2 = new MainActivity2();
        activity2.onCreate();
    }
}

abstract class Activity2 {
    abstract public void onCreate();
}

class MainActivity2 extends Activity2 {
    @Override
    public void onCreate() {
        System.out.println("메인 액티비티가 실행되었습니다.");

        View2.OnClickListener a; // 이 코드가 실행되도록 해주세요.
    }

}
class View2 {
    public static class OnClickListener {
    }
}

