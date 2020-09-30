package baekJoon.Day3;
import java.util.*;
public class Day3_1158_Josephus {
    public static void main(String[] args) {
     /*
         * # day3
         * # 1158. 요세푸스 문제
         * # https://www.acmicpc.net/problem/1158
         * # 문제
         * 요세푸스 문제는 다음과 같다.
         * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
         *  이제 순서대로 K번째 사람을 제거한다.
         * 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
         * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
         * 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
         *  예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
         * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

        * # 입력
        * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)

        * #출력
        * 예제와 같이 요세푸스 순열을 출력한다.
        * */
        Scanner sc = new Scanner(System.in);
        Queue <Integer> q = new LinkedList();
        String input = sc.nextLine();

        String[]num = input.split("\\s");

        int a[] = {Integer.parseInt(num[0]),Integer.parseInt(num[1])};
        // 수열 7까지 넣기...

        for(int i=1; i<=a[0]; i++){
            q.add(i);
        }

        // 수열 담을 string
        String jose ="<";
        /*
        - add() : 큐에 삽입
        - peek() : 가장 먼저 큐에 들어간 요소 반환
        - remove() : 가장 먼저 큐에 들어간 요소 삭제하면서 반환
        - isEmpty() : 큐가 비어있는지 반환
        - size() : 큐에 있는 요소의 크기 반환

        * */
        // 스택이 비워질 때까지 돌기

        // 기존 큐    1 2 3 4 5 6 7

        while(!(q.isEmpty())){
            for (int i=0; i <a[1]-1; i++){
                q.add(q.remove());
            }
            jose += (q.remove()+", ");
        }

        System.out.println(jose.substring(0,jose.length()-2)+">");
    }
}
