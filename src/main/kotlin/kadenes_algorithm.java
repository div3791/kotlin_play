/*
Largest sum sub array
 */

public class kadenes_algorithm {

    public static void main(String[] args) {
        int[] a = {5,-4,-2,6,-1};
        int res = maxSumSubArray(a);
        System.out.println("Result: "+res);
    }

    static int maxSumSubArray(int[] arr){
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum+arr[i];
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum = 0;
            }
        }

        return maxSum;
    }

}
