package baekjoon;
import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N , number;
        int max = -1000000 , min = 1000000;
        int[] arr = new int[5];

        N = sc.nextInt();

        for(int i = 0; i<N; i++){
            number = sc.nextInt();
            if (max <= number){
                max = number;
            }
            if (min >= number){
                min = number;
            }
        }

        System.out.println(min + " " + max);



    }
}
