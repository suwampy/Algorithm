package Day3;
import java.util.*;
public class Day3_10845_Queue {
    public static void main(String[] args) {
        /*
         * # day3
         * # 10845. 큐
         * # https://www.acmicpc.net/problem/10845
         * # 문제
         * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
         * 명령은 총 여섯 가지이다.
         * push X: 정수 X를 큐에 넣는 연산이다.
         * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다.
          만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         * size: 큐에 들어있는 정수의 개수를 출력한다.
         * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
         * front: 큐의 가장 앞에 있는 정수를 출력한다.
          만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
          * back: 큐의 가장 뒤에 있는 정수를 출력한다.
            만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        * # 입력
        * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
        * 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
        *  주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
        * 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

        * # 출력
        * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
        * */

        /*
        - add() : 큐에 삽입
        - peek() : 가장 먼저 큐에 들어간 요소 반환
        - remove() : 가장 먼저 큐에 들어간 요소 삭제하면서 반환
        - isEmpty() : 큐가 비어있는지 반환
        - size() : 큐에 있는 요소의 크기 반환

        * */
        Queue <Integer> q = new LinkedList();
        Scanner sc = new Scanner(System.in);


        // 자료구조: 큐와 덱 https://blog.naver.com/skyvvv624/220950557929
        /// 스택 = 후입선출(먼저들어온게먼저빠진다) 큐 = 선입선출(늦게들어온게먼저빠진다)
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<num ;i++){

            String que = sc.nextLine();
            if(que.equals("pop") && (!q.isEmpty())){
                //pop :가장먼저들어간새끼 삭제하면서 반환

                System.out.println(q.remove());
            }else if(que.equals("size")){
                //size
                System.out.println(q.size());
            }else if(que.equals("empty")){
                //empty 비어있는지 확인
                if(que.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(que.equals("front")  && (!q.isEmpty())){
                //front : 가장먼저들어간새끼 반환
                System.out.println(q.peek());
            }else if(que.equals("back")  && (!q.isEmpty())){
                //back: 큐의 가장 뒤에 있는 정수를 출력한다.
                System.out.println(((LinkedList)q).get(q.size()-1));
            }else if(que.length()>=6){
                //push.
                q.add(Integer.parseInt(que.substring(5)));
            }else if(q.isEmpty()){
                System.out.println(-1);
            }



        }
    }

}
