package baekjoon;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1,num2;

        for(int i=0;i<n;i++){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1+num2);
        }
    }
}
