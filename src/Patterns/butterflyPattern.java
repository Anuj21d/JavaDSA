package Patterns;

public class butterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //first Symmetry
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= (n - row) * 2; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //second Symmetry
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= (2 * row - 2); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
