package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    public static void main(String[] args) {
        //함수 solution은 정수 x와 자연수 n을 입력 받아,
        // x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
        // 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
        int x = -4;
        int n = 2; // 간격
        long lx = (long)x;
        long l = (long)x;

        long num = 0;
        List<Long> list = new ArrayList<Long>();
        for(int i=0; i<n; i++){
            num+=lx;
            list.add(num);
        }

        long[] answer = new long[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(list);
    }
}
