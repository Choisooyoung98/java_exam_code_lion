package exam_7_19;

public class Exam1 {
    public static void main(String[] args) {
        long sum = 0;
        for(long i = 0; i < 100000; i++){
            if(i%3==0 || i%5==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}