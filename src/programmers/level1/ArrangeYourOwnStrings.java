package programmers.level1;

import java.util.ArrayList;

public class ArrangeYourOwnStrings {
    // 문자열 내 맘대로 정렬하기
    //문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
    // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 [sun, bed, car]이고 n이 1이면
    // 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        ArrayList list = new ArrayList();

    }

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2]=t;
    }
}
