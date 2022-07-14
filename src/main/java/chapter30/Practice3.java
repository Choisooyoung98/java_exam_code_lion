package chapter30;

import java.lang.reflect.Array;

public class Practice3 {
//code.oa.gg/java8/993

// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요. add 함수에서 배열의 크기가 자동으로 늘어나도록 해주세요.
    public static void main(String[] args) {
        ArrayList2 ar = new ArrayList2();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200 

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300

        value = ar.get(3);
        System.out.println(value);
        // 출력 : 400

        System.out.println(ar.datas.length);
    }
}

class ArrayList2 {
    int[] datas;
    int lastIndex = -1;

    ArrayList2() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(int data) {
        lastIndex++;

        sizeUpIfFull();

        datas[lastIndex] = data;
    }

    int get(int index) {
        return datas[index];
    }
    boolean isFull() {
        if (lastIndex == datas.length) return true;
        return false;
    }
    void sizeUpIfFull() {
        if(isFull()) {
            sizeUp();
        }
    }
    void sizeUp() {
        int[] newDatas = new int[datas.length * 2];

        for (int i = 0; i < datas.length; i++){
            newDatas[i] = datas[i];
        }
        datas = newDatas;
    }
}