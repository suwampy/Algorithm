package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class TurningOver {
    public static void main(String[] args) {
        //자연수뒤집어배열로만들기
        //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
        // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
        long n =12345;
        String s = String.valueOf(n);

        List<Integer> list = new ArrayList<Integer>();
        int startIndex = s.length()-1;
        int endIndex = s.length();

        for(int i=0; i <s.length(); i++){
            list.add(Integer.parseInt(s.substring(startIndex,endIndex)));
            startIndex--;
            endIndex--;
        }


        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        for(int i=0; i<answer.length;i++){
            System.out.println(answer[i]);
        }

    }
}
