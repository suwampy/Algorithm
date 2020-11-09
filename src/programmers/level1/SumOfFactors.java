package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class SumOfFactors {
    public static void main(String[] args) {
        // 약수의 합
        int answer = 0;
        int n = 12;
        List list = new ArrayList();

        for(int i=1; i<=n; i++){
            if(n%i ==0){
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++){
            answer += (int)list.get(i);
        }

        System.out.println(answer);

    }
}
