package programmers.level1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DividedNumberArray {
    public static void main(String[] args) {
        // 나누어 떨어지는 숫자 배열
        //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        //divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
        //
        //제한사항
        //arr은 자연수를 담은 배열입니다.
        //정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
        //divisor는 자연수입니다.
        //array는 길이 1 이상인 배열입니다.

        int arr[] = {5,9,7,10};
        int divisor = 5;

        List<Integer> list = new ArrayList();

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


    }
}
