package chapter42;

import java.util.ArrayList;
import java.util.List;
// 홍길동 - 내부 익명 클래스 사용
// 홍길순 - + 람다 사용
public class Practice2 {
    public static void main(String[] args) {
        View2 aButton = new Button2();
        aButton.addOnClickListener(new OnClickListener2() {
            @Override
            public void onClick(String msg) {
                System.out.println("홍길동이 받은 메세지 : " + msg);
            }
            public void 숨쉬다() {
                System.out.println("홍길동 : 숨쉬다.");
            }
        });

        aButton.fireClickEvent();

        aButton.addOnClickListener(msg -> {
            System.out.println("홍길순이 받은 메세지 : " + msg);
        });

        aButton.fireClickEvent();
    }
}
class View2 {
    List<OnClickListener2> list;
    View2() {
        list = new ArrayList<>();
    }
    public void addOnClickListener(OnClickListener2 onClickListener2) {
        list.add(onClickListener2);
    }

    public void fireClickEvent() {
        System.out.println("뷰가 클릭되었습니다.");
        for (OnClickListener2 onClickListener2 : list){
            onClickListener2.onClick("뷰가 클릭됨");
        }
    }
    /* 수정가능지역시작 */

    /* 수정가능지역끝 */
}

class Button2 extends View2 {

}

interface OnClickListener2 {
    public void onClick(String msg);
}

