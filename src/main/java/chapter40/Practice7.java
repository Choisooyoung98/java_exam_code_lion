package chapter40;

public class Practice7 {
}
// 문제 : 아래가 실행되도록 해주세요.
class Main7 implements OnClickListener7 {
    public static void main(String[] args) {
        Main7 aMain = new Main7();
        View7 aButton = new Button7(aMain);

        aButton.setOnClickListener(aMain);
        aButton.fireClickEvent();
        // 출력 : 버튼이 클릭되었습니다.
        // 참고로 위 출력은 아래 onClick 메서드의 호출로 이뤄져야 합니다.
    }

    @Override
    public void onClick(View7 v) {
        System.out.println("버튼이 클릭되었습니다.");
    }
}

interface OnClickListener7 {
    public void onClick(View7 v);
}

class View7 {
    OnClickListener7 onClickListener7;

    public void setOnClickListener(OnClickListener7 o) {
        this.onClickListener7 = o;
    }

    public void fireClickEvent() {
        onClickListener7.onClick(this);
    }
}
class Button7 extends View7{
    public Button7(OnClickListener7 onClickListener7){
    }
}