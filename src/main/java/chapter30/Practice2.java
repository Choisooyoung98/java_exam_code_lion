package chapter30;

public class Practice2 {
//code.oa.gg/java8/991

// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요.
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}

class ArrayList {
    int[] list = new int[3];
    int lastindex = -1;
    void add(int data) {
        ++lastindex;
        list[lastindex] = data;
    }
    int get(int index) {
        return list[index];
    }

}