package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array01 {
    public static void main(String[] args) {
        //배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
        // commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록
        // solution 함수를 작성해주세요.

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        ArrayList temp = new ArrayList();
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length;i++){
            for(int j=(commands[i][0]-1); j<=(commands[i][1]-1); j++){
                temp.add(array[j]);
            }
            Collections.sort(temp);
            System.out.println("temp : " + temp);
            answer[i] = (int)temp.get(commands[i][2]-1);
            temp.clear();
        }
    }


    // 다른 풀이ㅣ
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            // copyOfRange : 배열 복사
            // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스)
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
