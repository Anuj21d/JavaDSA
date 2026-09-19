package BitwiseOperator;

public class BitwiseOperator {
    static void main(String[] args) {


//        int n = 32;
//
//        int count = 0;
//
//        while (n != 0) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >> 1;
//        }
//
//        System.out.println(count);


//        Write a program to count number of set bits
//        int n = 16;
//
//        int count = 0;
//
//        while (n != 0) {
//            n = n & (n - 1);
//            count++;
//        }
//        System.out.println(count);

//        Find missing number in array (using XOR)

//        int arr[] = {1, 2, 4, 5};
//        int miss = 0;
//
//        for (int ele : arr) {
//            miss = miss ^ ele;
//        }
//        int diff = 0;
//        for (int i = 1; i <= arr.length + 1; i++) {
//            diff = diff ^ i;
//        }
//
//        int missNumber = miss ^ diff;
//        System.out.println(missNumber);

        //more better
//
//        int arr[] = {1, 2, 4, 5};
//
//        int miss = 0;
//        int len = arr.length + 1;
//
//        for (int i = 1; i <= len; i++) {
//            miss = miss ^ i;
//        }
//        for (int ele : arr) {
//            miss = miss ^ ele;
//        }
//
//        System.out.println("Missing Number Is : " + miss);

//        Find two unique numbers (others appear twice)

//        int arr[] = {10, 20, 34, 20, 10};
//        int unique = 0;
//
//        for (int ele : arr) {
//            unique ^= ele;
//        }
//        System.out.println("Unique Number IS : " + unique);


//        Check if number is power of 4


//        int n = 16;n & (n - 1)
//
//        int oddHex = 0xAAAAAAAA;
//
//        if ((n & (n - 1)) == 0 && (n & oddHex) == 0) {
//            System.out.println("n is a power of 4");
//        } else {
//            System.out.println("n is a not power of 4");
//        }

//        Convert decimal to binary manually

//        int n = 5;
//        int ans = 0;
//        for (int i = 0; n != 0; i++) {
//            int bit = n & 1;
//
//            ans = (bit * Math.powExact(10, i)) + ans;
//
//            n = n >> 1;
//        }
//        System.out.println(ans);


//        Implement fast exponentiation using bitwise
        int base = 5;
        int expo = 2;
        int result = 1;


        while (expo > 0) {
            if ((expo & 1) == 1) {
                result *= base;
            }
            expo >>= 1;
            base *= base;
        }
        System.out.println(result);
    }
}
