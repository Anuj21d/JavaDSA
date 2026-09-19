package Patterns;

public class hollowTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if ( i == 1 || i == 2 || i == n){
                for ( int j = 1; j <= i; j++ ){
                    System.out.print("* ");
                }
            }else {
                //1star
                System.out.print("* ");
                //spaces
                for ( int j = 1; j <= i -2; j++ ){
                    System.out.print("  ");
                }
                //last star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
