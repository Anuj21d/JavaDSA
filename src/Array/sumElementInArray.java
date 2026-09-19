package Array;

public class sumElementInArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
//        int sum  = 0;
//        for(int val : arr){
//            sum = sum +val;
//        }
//        System.out.println("The SUm Array Is : "+sum);
        int mult = 1;
        for (int val : arr) {
            mult *= val;
        }
        System.out.println("the mult Is " + mult);
    }
}
