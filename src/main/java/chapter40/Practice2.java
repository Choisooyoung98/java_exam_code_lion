package chapter40;

import java.net.http.WebSocket;

public class Practice2 {
/*
문제 : 사람 객체의 `안녕`이 `button.click();`에 의해 실행되도록 해주세요.
조건 : Button에는 `사람` 이라는 언급이 없어야 합니다.
*/
    public static void main(String[] args) {
        Button button = new Button();
        button.setListener(new 사람());
        // button.?? // 이 1줄을 완성해주세요.(메인 클래스는 여기만 수정 가능)
        button.click();
    }
}

class 사람 implements Listener {
    @Override
    public void listen(String msg) {
        안녕();
    }

    public void 안녕() {
        System.out.println("Main::안녕!");
    }
}
class Button{
    private Listener aListener;
    public void setListener(Listener aListener) {
        this.aListener = aListener;
    }
    public void click() {
        aListener.listen("버튼 클릭 되었네요.");
    }
}
interface Listener {
    public void listen(String msg);
}