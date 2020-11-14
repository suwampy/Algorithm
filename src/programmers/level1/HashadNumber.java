package programmers.level1;

public class HashadNumber {
    //양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public static void main(String[] args) {
        boolean answer = true;
        int x = 10;

        String str = String.valueOf(x);

        int num = 0;
        int startNum = 0;
        int endNum =1;
        for(int i=0; i<str.length(); i++){
            num+= Integer.parseInt(str.substring(startNum,endNum));
            startNum++;
            endNum++;
        }

        System.out.println(num);

        if(x%num==0){
            answer=true;
        }else {
            answer=false;
        }


    }

}
