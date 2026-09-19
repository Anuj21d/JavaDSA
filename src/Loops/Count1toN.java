package Loops;

import java.util.Scanner;

public class Count1toN {
    public static void main(){
//        System.out.println("heelo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}
