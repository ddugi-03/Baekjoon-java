package baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 최악의 경우에도 O(N log N)을 보장하는 Collections.sort 사용을 위해 List 활용
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        // 2. 출력을 한 번에 모아서 하기 위해 StringBuilder 사용 (매우 중요!)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(list.get(i)).append('\n');
        }

        // 모아둔 문자열을 한 번에 출력
        System.out.print(sb);
    }
}