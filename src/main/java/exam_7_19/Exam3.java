package exam_7_19;

public class Exam3 {
    public static void main(String[] args) {
        long num = 1600851475143l;
        System.out.println(num);

        계산기 계산기 = new 계산기();

        for (long i = 3l; i < num / 2; i++){
            if (num % i == 0){
                if (i % 3 != 0 || i % 19 != 0){
                    System.out.println(i);
                    계산기.계산(i);
                }
            }
        }
    }
}
class 계산기 {
    long z;
    void 계산(long z) {
        this.z = z;
        System.out.println("==소수인가?==");
        for( long j = 2l; j < z; j++){
            if(z % j == 0){
                System.out.println(j);
            }
        }
        System.out.println("-------------");
    }
}