package Questins;

import java.util.Arrays;

public class BasicArrayQue {

    static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    static int[] multipleByTen(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 10;
        }
        return newArr;
    }

    static int findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int[] getIntersection(int[] arr1, int[] arr2) {
        //bruteforce
//        int[] intersection = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    intersection[i] = arr1[i];
//                }
//            }
//        }
//        return intersection;
        //Optimize Two pointer
        int i = 0;
        int j = 0;
        int[] intersection = new int[arr1.length];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection[k] = arr1[i];
                k++;
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return intersection;
    }

    static int[] getSwapedArray(int[] arr) {
//        brute force
        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;

    }

    static int[] getExtremeAlternate(int[] arr) {
        int i = 0, j = arr.length - 1, k = 0;
        int[] extremeAlternate = new int[arr.length];
        while (i < j) {
            extremeAlternate[k] = arr[i];
            extremeAlternate[k + 1] = arr[j];
            k += 2;
            i++;
            j--;
        }
        return extremeAlternate;
    }

    static void main(String[] args) {
        //Calculate Avarage of Array
//        int[] arr = {2, 4, 1, 3};
//        System.out.println("Avarage of Array Is : " + getAvg(arr));


        //Multiply each element of array by 10
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = multipleByTen(arr);
//
//        for(int ele : arr2){
//            System.out.print(ele+" ");
//        }

        //find one element in Array{linear search}
        int[] arr = {2, 4, 5, 8, 9, 10};
//        int target = 10;
//        int value = findTarget(arr, target);
//        if (value == -1) {
//            System.out.println("Element not found");
//        } else {
//            System.out.println("Element found at index: " + value);
//        }


        //Swap alternate elements in Array
//        int[] SwapedArr = getSwapedArray(arr);
//        for (int ele : SwapedArr) {
//            System.out.print(ele + " ");
//        }

        //Print Array intersection element
        int[] arr2 = {2, 4, 5, 10, 13, 12,15,16};
//        int[] intersection = getIntersection(arr, arr2);
//        for (int i = 0; i < intersection.length; i++) {
//            System.out.print(intersection[i] + " ");
//        }

        int[] extremeAlternate = getExtremeAlternate(arr2);
        for (int i = 0; i < arr2.length; i += 2) {
            System.out.print(extremeAlternate[i] + " : " + extremeAlternate[i + 1] + "   ");
        }


    }

}
