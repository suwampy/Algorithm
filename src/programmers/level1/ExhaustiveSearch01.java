package programmers.level1;

import java.util.*;

public class ExhaustiveSearch01 {
    public static void main(String[] args) {
        //수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
        //
        //1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
        //2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
        //3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
        //
        //1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
        //
        //제한 조건
        //시험은 최대 10,000 문제로 구성되어있습니다.
        //문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
        //가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
        int[] answers = {1,2,3,4,5,1};

        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};

        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        // 원래 이렇게 적었었음... =>런타임 에러 발생 ㅋㅋ ;;
//        for(int i=0; i<answers.length; i++){
//            if(answers[i] == (supoja1[i]%supoja1.length == 0? supoja1[i] : supoja1[i]%supoja1.length)){
//                answer1+=1;
//            }
//
//            if(answers[i] == (supoja2[i]%supoja2.length == 0? supoja2[i]:supoja2[i]%supoja2.length)){
//                answer2+=1;
//            }
//
//            if(answers[i] == (supoja3[i]%supoja3.length == 0 ? supoja3[i]:supoja3[i]%supoja3.length)){
//                answer3+=1;
//            }
//        }

        // 정말 과몰입 한듯..;;;
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == supoja1[i%supoja1.length]) {
                answer1++;
            }
            if(answers[i] == supoja2[i%supoja2.length]) {
                answer2++;
            }
            if(answers[i] == supoja3[i%supoja3.length]) {
                answer3++;
            }
        }


        int max = Math.max(Math.max(answer1, answer2),answer3);
        List<Integer> maxList = new ArrayList<Integer>();
        if(max==answer1) {
            maxList.add(1);
        }
        if(max==answer2) {
            maxList.add(2);
        }
        if(max==answer3) {
            maxList.add(3);
        }

        int answer[] = new int[maxList.size()];
        for(int i=0; i<maxList.size();i++){
            answer[i] = maxList.get(i);
        }

        for(int i=0; i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }

}
