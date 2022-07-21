package chapter40;

public class Practice5 {
    public static void main(String[] args) {
        Button2 aButton = new Button2();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}
class 고양이 {
    String name;
    고양이() {
        name = "고양이";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 개 {
    String name;
    개() {
        name = "개";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class 부엉이 {
    String name;
    부엉이() {
        name = "부엉이";
    }
    void listener() {
        System.out.println("나(" + name + ")는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}
class Button2 {
    private Object clickEventListner;
    void setClickEventListener(Object o){
        this.clickEventListner = o;
    }
    void fireClick() {
        if (clickEventListner instanceof 고양이){
            ((고양이) clickEventListner).listener();
        }
        else if (clickEventListner instanceof 개){
            ((개) clickEventListner).listener();
        }
        else if (clickEventListner instanceof 부엉이) {
            ((부엉이)clickEventListner).listener();
        }
    }
}
