package baekjoon;
import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, r=0;

        n = sc.nextInt();
        String s_1 = "";
        String s_2 = "";


        for (int i = 0; i < n; i++) {
            r = sc.nextInt();
            s_1 = sc.next();
            for (int j = 0; j < s_1.length(); j++) {
                for (int k = 0; k < r; k++) {
                    s_2 = s_2 + s_1.charAt(j);
                }
            }
            System.out.println(s_2);
            s_2 = "";
        }
    }
}
