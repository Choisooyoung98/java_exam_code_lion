package chapter32;

//code.oa.gg/java8/1350
// 문제 : 제너릭을 사용해서 중복을 제거해주세요.

public class Practice1 {
    public static void main(String[] args) {
        저장소<Integer> a저장소1 = new 저장소<>();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        저장소<Double> a저장소2 = new 저장소<>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        저장소<사과> a저장소3 = new 저장소<>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class 저장소<T> {
    Object data;

    T getData() {
        return (T)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class 사과 {
}
