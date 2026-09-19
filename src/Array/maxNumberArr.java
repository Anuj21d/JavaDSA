package Array;

public class maxNumberArr {
    public static void main(String[] args) {
        int arr[] = {10, 40, 50, 90};
        int max = arr[0];
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        System.out.println(max);
    }
}
