package chapter28;

public class Practice {
    public static void main(String[] args) {
        학생 a학생1 = new 학생(1,23,"홍길동");
        학생 a학생2 = new 학생(1,23,"홍길동");
        System.out.println(a학생1.equals(a학생2));
    }
}
class 학생 {
    int number;
    int age;
    String name;
    학생(int number, int age, String name){
        this.number = number;
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof 학생 == false)
            return false;
        학생 a비교대상 = (학생)other;
        if(this.number!=a비교대상.number)
            return false;
        if(this.age!=a비교대상.age)
            return false;
        if (this.name!=a비교대상.name)
            return false;
        return true;
    }
}