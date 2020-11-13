package programmers.level1;

public class GuessTheColatz {
    public static void main(String[] args) {
        // 콜라츠 추측
        //1-1. 입력된 수가 짝수라면 2로 나눕니다.
        //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

        int num = 626331;

        long n = (long) num;
        boolean flag = true;

        int answer = 0;
        while(flag){
            if(n%2 == 0){
                //짝수일때
                n=n/2;
                answer++;
            }else{
                n=n*3+1;
                answer++;
            }

            if(n==1){
                flag=false;
            }

            if(answer==500){
                answer=-1;
                flag=false;
            }

        }



        System.out.println(answer);




    }
}
