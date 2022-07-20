package chapter38;

public class Practice3 {
//code.oa.gg/java8/1077
// 문제 : 아래코드가 실행되도록 해주세요.
    public static void main(String[] args) {
        사람3[] 사람들 = new 사람3[5];
        사람들[0] = 사람3.get사람();
        사람들[1] = 사람3.get사람();
        사람들[2] = 사람3.get사람();
        사람들[3] = 사람3.get사람();
        사람들[4] = 사람3.get사람();

        for ( int i = 0; i < 사람들.length; i++ ) {
            사람들[i].자기소개();
        }

		/*
		// 출력
		저는 1번째 사람입니다.
		저는 2번째 사람입니다.
		저는 3번째 사람입니다.
		저는 4번째 사람입니다.
		저는 5번째 사람입니다.
		*/
    }
}

class 사람3 {
    private int id;
    static int lastId = 0;
    private 사람3(int id){
        this.id = id;
    }
    static 사람3 get사람() {
        int i = ++lastId;
        return new 사람3(i);
    }
    void 자기소개() {
        System.out.println("저는 " + this.id + "번째 사람 입니다.");
    }
}
