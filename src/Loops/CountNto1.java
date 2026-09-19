package Loops;

import java.util.Scanner;

public class CountNto1 {

    public static void main() {
//        System.out.println("heelo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }


}
