package chapter43;

public class Practice1 {
//code.oa.gg/java8/1416
    public static void main(String[] args) {
        Activity activity = new MainActivity();
        activity.onCreate();
        // 출력 => 메인 액티비티가 실행되었습니다.
    }

    private static class Activity {
        public void onCreate() {
            System.out.println("메인 액티비티가 실행되었습니다.");
        }
    }

    private static class MainActivity extends Activity {
    }
}