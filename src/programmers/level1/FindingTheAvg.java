package programmers.level1;

public class FindingTheAvg {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int length = arr.length;
        int num = 0 ;
        for(int i=0; i<length ; i++){
            num+=arr[i];
        }

        double answer = (double)num/length;
        System.out.println(answer);

    }
}
