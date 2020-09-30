package programmers.level1;

import java.util.Arrays;

public class Hash01 {
    public String solution(String[] participant, String[] completion) {
        //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
        // 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
        // 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }

        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }

        return answer;
    }
}
