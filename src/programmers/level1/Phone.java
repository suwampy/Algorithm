package programmers.level1;

public class Phone {
    public static void main(String[] args) {

        String phone_number ="01033334444";
        String answer = "";

        answer = phone_number.substring(phone_number.length()-4,phone_number.length());

        int phoneNumber = phone_number.substring(0,phone_number.length()-4).length();

        String pn = "";
        for(int i=0; i<phoneNumber; i++){
            pn += "*";
        }

        answer = pn + answer;

        System.out.println(answer);

        //     char[] ch = phone_number.toCharArray();
        // for(int i = 0; i < ch.length - 4; i ++){
        //         ch[i] = '*';
        //     }
        //     return String.valueOf(ch);
        //  }

    }
}
