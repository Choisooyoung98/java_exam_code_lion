package chapter41;

public class Practice1 {
    public static void main(String[] args) {
        View.OnClickListener aOnClickListener;

        // 수정가능지역 시작
        aOnClickListener = () -> {
                System.out.println("클릭되었다는 사실을 전달받았습니다.");
            };
        // 수정가능지역 끝
        aOnClickListener.onClick();
        // 출력 => 클릭되었다는 사실을 전달받았습니다.
    }
}

class View {
    static interface OnClickListener {
        public void onClick();
    }
}
