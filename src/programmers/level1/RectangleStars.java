package programmers.level1;

public class RectangleStars {
    public static void main(String[] args) {

        // 직사각형 별찍기
        int n = 5;
        int m = 3;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
