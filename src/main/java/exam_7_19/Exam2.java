package exam_7_19;

public class Exam2 {
    public static void main(String[] args) {
        long sum = 0;
        long i = 2;
        long j;
        long tmp = 1;
        while(i<50000000){
            if (i % 2 == 0){
                sum+=i;
            }
            j = i;
            i = i + tmp;
            tmp = j;
        }
        System.out.println(sum);
    }
}