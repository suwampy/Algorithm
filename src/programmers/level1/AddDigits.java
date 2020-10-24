package programmers.level1;

public class AddDigits {
    public static void main(String[] args) {
        //자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는
        // solution 함수를 만들어 주세요.
        //예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
        int n = 123;
        String str = String.valueOf(n);
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            sum += Integer.parseInt(str.substring(i,i+1));
        }

        System.out.println(sum);
    }
}
