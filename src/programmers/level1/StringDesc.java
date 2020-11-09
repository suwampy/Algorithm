package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class StringDesc {
    public static void main(String[] args) {
        // 문자열 내림차순으로 배치하기
        //문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수,
        // solution을 완성해주세요.
        //s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
        String s = "abcdefg";
        String answer = "";

        String[] arr = new String[s.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));


    }
}
