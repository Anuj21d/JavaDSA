package Patterns;

public class hollowSquare {
    public static void main(String[] args) {
        int n = 10;
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("* ");
                }

            } else {
                for (int col = 1; col <= n; col++) {
                    if (col == 1 || col == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
