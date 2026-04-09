package baekjoon;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b+c >= 60){
            a += (b+c)/60;
            if(a >=24){
                a %= 24;
            }
            b = (b+c)%60;
        }
        else{
            b = (b+c)%60;
        }
        System.out.println(a+" "+b);
    }
}
