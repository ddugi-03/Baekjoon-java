package baekjoon;
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0 , cnt=0;

        for(int i = 0; i< 9; i++){
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                cnt = i;
                max = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(cnt+1);
    }
}

