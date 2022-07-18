package chapter32;

import java.util.Scanner;

public class Practice4 {
// 문제 : 사용자에게 숫자를 입력받고, 평균과 총합을 출력해주세요.
// 조건 : 처음에는 정수 5개를 받고, 평균과 총합을 출력해주세요.
// 조건 : 처음에는 실수 5개를 받고, 평균과 총합을 출력해주세요.
// 조건 : ArrayList 클래스를 직접구현해주세요.
// 조건 : ArrayList 클래스에 get, add, size, extendDatasSizeIfNeed(private) 메서드를 구현해주세요.
// 조건 : ArrayList 클래스에 제너릭을 적용해주세요.
// 조건 : Scanner 를 사용해주세요.

 // Scanner 클래스를 불러온다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList4 arrayList = new ArrayList4();
        System.out.print("숫자의 개수 : ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++){
            //arrayList.add(i) = sc.nextInt();
        }
    }
}
class ArrayList4 {
    int[] list;
    int lastIndex;
    ArrayList4() {
        list = new int[3];
        lastIndex = -1;
    }
    void add(int index) {

    }

}