package chapter38;

public class Practice4 {
//code.oa.gg/java8/1079
// 문제 : 아래코드가 실행되도록 해주세요.
// 조건 : 사람 객체의 수는 3을 넘을 수 없습니다.
    public static void main(String[] args) {
        사람4[] 사람들 = new 사람4[7];
        사람들[0] = 사람4.get사람();
        사람들[1] = 사람4.get사람();
        사람들[2] = 사람4.get사람();
        사람들[3] = 사람4.get사람();
        사람들[4] = 사람4.get사람();
        사람들[5] = 사람4.get사람();
        사람들[6] = 사람4.get사람();

        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }

		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		저는 3번째 사람입니다.
		*/
    }
}
class 사람4 {
    private static int lastId = 0;
    private int id;
    private static 사람4 마지막_사람;
    private 사람4(int id) {
        this.id = id;
    }
    static 사람4 get사람(){
        if (lastId == 3) {
            return 마지막_사람;
        }
        int id = ++lastId;
        사람4 사람 = new 사람4(id);
        마지막_사람 = 사람;
        return 사람;
    }
    void 자기소개() {
        System.out.printf("저는 %d번째 사람입니다.\n", id);
    }
}

