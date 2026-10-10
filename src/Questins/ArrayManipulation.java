package Questins;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayManipulation {

    //Reversed Array
    static int[] getReversed(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[] getModeOfArray(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int ele : arr) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int ele : freq.keySet()) {
            int current = ele;
            int currentFreq = freq.get(ele);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqKey = ele;
            }
        }

        return new int[]{maxFreqKey, maxFreq};
    }

    static int[] shiftByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    //   Brutal solution
//    static int[] shiftByKPosition(int[] arr, int k) {
//        int n = arr.length;
//        for (int i = 1; i <= k; i++) {
//            int temp = arr[n - 1];
//            for (int j = n - 1; j > 0; j--) {
//                arr[j] = arr[j - 1];
//            }
//            arr[0] = temp;
//        }
//
//        return arr;
//    }
    static int[] shiftByKPosition(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy saved elements to the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    static HashSet<Integer> getUnionOfArray(int[] arr, int[] arr2) {

        HashSet<Integer> Union = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Union.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            Union.add(arr2[i]);
        }

        return Union;

    }

    static void main(String[] args) {
        //Reversed Array
//        int[] arr = {2, 4, 5, 8, 9, 10};
//        int[] reversed = getReversed(arr);
//
//        for (int ele : reversed) {
//            System.out.print(ele + " ");
//        }

//        int[] arr = {2, 2, 2, 1, 1, 3, 3, 3, 3};
//        int[] mode = getModeOfArray(arr);
//
//        System.out.println(mode[0] + " : " + mode[1]);

//        int[] shiftedArray = shiftByOne(arr);
//        System.out.println(Arrays.toString(shiftedArray));
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int[] shiftedArray = shiftByKPosition(arr, 3);
//        System.out.println(Arrays.toString(shiftedArray));

        int[] arr2 = {1, 2, 3, 9, 8, 6, 7};
        HashSet<Integer> union = getUnionOfArray(arr2, arr);

        for (int ele : union) {
            System.out.println("ele: " + ele);
        }
    }
}
