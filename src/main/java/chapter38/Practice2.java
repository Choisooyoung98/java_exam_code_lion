package chapter38;

public class Practice2 {
//code.oa.gg/java8/1075
// 문제 : 아래코드가 실행되도록 해주세요.
    public static void main(String[] args) {
        사람2[] 사람들 = new 사람2[5];
        사람들[0] = 사람2.get사람();
        사람들[1] = 사람2.get사람();
        사람들[2] = 사람2.get사람();
        사람들[3] = 사람2.get사람();
        사람들[4] = 사람2.get사람();

        System.out.println("실행완료");
    }
}
class 사람2 {
    static 사람2 get사람() {

        return new 사람2();
    }
}