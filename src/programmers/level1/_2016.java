package programmers.level1;

public class _2016 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        int num = 0;
        String answer = "";
        a-=1;
        if(a>1 && a<8){
            if(a%2==0){
                num = (((a/2 * 30) + (a / 2 * 31))-1)+b;
            }else{
                num = ((((a-1)/2 * 30) + ((a-(a-1)/2) * 31))-1)+b;
            }
        }else if (a>=8){
            if(a%2==0){
                num = ((((a/2-1) * 30) + ((a / 2 +1) * 31)-1))+b;
            }else{
                num = (((a/2 * 30) + ((a/2+1) * 31)-1)+b);
            }
        }else if(a==1){
            num = 31+b;
        }else if(a==0){
            num = b;
        }

        if(num%7==1){
            answer="FRI";
        }else if(num%7==2){
            answer="SAT";
        }else if(num%7==3){
            answer="SUN";
        }else if(num%7==4){
            answer="MON";
        }else if(num%7==5){
            answer="TUE";
        }else if(num%7==6){
            answer="WEN";
        }else if(num%7==0){
            answer="THU";
        }

        // 철자틀려서  빠꾸먹엇엇음..; ;어 이업당 '''';;;^^ ;;
        System.out.println(answer);


        //이렇게 좋은방법이.. .;;;;
//        String answer = "";
//        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
//        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//        int allDate = 0;
//        for (int i = 0; i < a - 1; i++) {
//            allDate += date[i];
//        }
//        allDate += (b - 1);
//        answer = day[allDate % 7];
    }
}
