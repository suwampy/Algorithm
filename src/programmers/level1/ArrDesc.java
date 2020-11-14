package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrDesc {
    public static void main(String[] args) {
        long n = 118372;
        String str = String.valueOf(n);
        String answer = "";

        String[] arr = str.split("");
        int[] arr2 = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr2);
        List list = Arrays.asList(arr2);
        Collections.reverse(list);
        System.out.println(list.get(0));

    }
}