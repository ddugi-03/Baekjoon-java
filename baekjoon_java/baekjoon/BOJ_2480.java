package baekjoon;

import java.util.Scanner;

public class BOJ_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        //같은수 3개
        if((num1 == num2)&&(num2 == num3)&&(num3 == num1)){
            System.out.println(10000+(num1*1000));
        }
        //같은수 2개
        if((num1 == num2)&&(num1 != num3)){ //1 2같음 3다름
            System.out.println(1000+(num1*100));
        }
        else if((num1 == num3)&&(num1 != num2)) {//1 3 같음 2다름
            System.out.println(1000 + (num1 * 100));
        }
        else if((num2 == num3)&&(num1 != num2)){//2 3 같음 1다름
            System.out.println(1000+(num2*100));
        }
        //다른수
        if((num1 != num2) && (num2 != num3) && (num3 != num1)){
            if((num1 > num2) && (num1 > num3)){
                System.out.println(num1*100);
            }
            else if((num2 > num1) && (num2 > num3)){
                System.out.println(num2*100);
            }
            else{
                System.out.println(num3*100);
            }
        }
    }
}
