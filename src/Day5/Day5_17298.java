package Day5;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Day5_17298 {
    public static void main(String[] args) throws IOException {
        /*
         * 오큰수
         * https://www.acmicpc.net/problem/17298
         *
         * # 문제
         * 크기가 N인 수열 A = A1, A2, ..., AN이 있다.
         * 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
         * Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다.
         * 그러한 수가 없는 경우에 오큰수는 -1이다.
         * 예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
         * A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
         *
         * # 입력
         *첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
         * 둘째에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
         * # 출력
         * 총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.
         * */

        /*
         public Element push(Element item); // 데이터 추가
        public Element pop(); // 최근에 추가된(Top) 데이터 삭제
        public Element peek(); // 최근에 추가된(Top) 데이터 조회
        public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
        public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
        *
        *
        * */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];

        String[] temp = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
            // int로 변환
        }


        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i = 1; i < n; i++) {
            if (s.isEmpty()) {
                s.push(i);
            }
            while (!s.isEmpty() && a[s.peek()] < a[i]) {
                ans[s.pop()] = a[i];
            }
            s.push(i);
        }

        while (!s.empty()) {
            ans[s.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }



    }
