package chapter40;

public class Practice6 {
    public static void main(String[] args) {
        Button6 aButton = new Button6();
        aButton.setClickEventListener(new 고양이6());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개6());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이6());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
class 고양이6 implements 손님6 {
    String name;
    고양이6() {
        name = "고양이";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    @Override
    public void 응답() {
        listener();
    }
}
class 개6 implements 손님6 {
    String name;
    개6() {
        name = "개";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
    @Override
    public void 응답() {
        listener();
    }
}
class 부엉이6 implements 손님6 {
    String name;
    부엉이6() {
        name = "부엉이";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }

    @Override
    public void 응답() {
        listener();
    }
}
class Button6 {
    private 손님6 aListener;
    void setClickEventListener(손님6 listener){
        this.aListener = listener;
    }
    void fireClick() {
        aListener.응답();
    }
}
interface 손님6{
    void 응답();
}