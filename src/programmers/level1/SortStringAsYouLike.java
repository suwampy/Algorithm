package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringAsYouLike {
    public static void main(String[] args) {
        //문자열 내 마음대로 정렬하기

        //문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
        // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
        // 예를 들어 strings가 [sun, bed, car]이고 n이 1이면
        // 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
        String[] strings ={"sun", "bed", "car"};
        int n =1;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }else if(o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                }else {
                    return 1;
                }
            }
        });
    }
}
