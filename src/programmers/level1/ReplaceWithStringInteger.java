package programmers.level1;

public class ReplaceWithStringInteger {
    //문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
    //
    //제한 조건
    //s의 길이는 1 이상 5이하입니다.
    //s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    //s는 부호와 숫자로만 이루어져있습니다.
    //s는 0으로 시작하지 않습니다.
    //입출력 예
    //예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
    //str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

    public static void main(String[] args) {
        String s = "1234";
        int answer = Integer.parseInt(s);
    }

//    public int getStrToInt(String str) {
//        boolean Sign = true;
//        int result = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == '-')
//                Sign = false;
//            else if(ch !='+')
//                result = result * 10 + (ch - '0');
//        }
//        return Sign?1:-1 * result;
//    }
//    //아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String args[]) {
//        StrToInt strToInt = new StrToInt();
//        System.out.println(strToInt.getStrToInt("-1234"));
//    }

}
