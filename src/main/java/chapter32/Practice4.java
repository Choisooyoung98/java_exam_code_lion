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
        ArrayList4<Integer> arrayList;
        System.out.print("숫자의 개수 : ");
        int input = sc.nextInt();
        int j;
        float z;
        arrayList = new ArrayList4(input);
        for (int i = 0; i < input; i++){
            System.out.print("정수 "+ input +"개를 입력해주세요 : ");
            j = sc.nextInt();
            arrayList.add(j);
        }
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++){
            sum += arrayList.get(i);
        }
        System.out.println("정수 총 합은 : " + sum);


        ArrayList4<Float> douvleArrayList;
        System.out.print("숫자의 개수 : ");
        int doubleInput = sc.nextInt();
        douvleArrayList = new ArrayList4(doubleInput);
        float doubleSum = 0;
        for (int i = 0; i < doubleInput; i++){
            System.out.print("실수 "+ doubleInput +"개를 입력해주세요 : ");
            z = sc.nextFloat();
            doubleSum = doubleSum + z;
            //douvleArrayList.add(z);

        }

//        for (int i = 0; i < douvleArrayList.size(); i++){
//            doubleSum += douvleArrayList.get(i);
//        }
        System.out.println("정수 총 합은 : " + doubleSum.floatValue());
    }
}
class ArrayList4<T> {
    Object[] list;
    int lastIndex;
    ArrayList4(int index) {
        list = new Object[index];
        lastIndex = -1;
    }
    int size() {
        return lastIndex + 1;
    }
    void add(T data) {
        lastIndex++;
        sizeUpIfFull();
        list[lastIndex] = data;
    }
    T get(int index) {
        return (T) list[index];
    }
    void sizeUpIfFull() {
        if(ifFull()) {
            sizeUp();
        }
    }
    boolean ifFull() {
        if(lastIndex == list.length) return true;
        return false;
    }
    void sizeUp() {
        Object[] newList = new Object[list.length * 2];
        for (int i = 0; i < list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
    }
    void removeAt(int index) {
        for (int i = index; i < lastIndex; i++){
            list[index] = list[index+1];
        }
        lastIndex--;
    }
    void add(T data, int index){
        ++lastIndex;
        sizeUpIfFull();
        for (int i = lastIndex+1; i >= index; i--){
            list[i] = list[i-1];
        }
        list[index] = data;
    }

}
