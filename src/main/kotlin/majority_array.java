public class majority_array {

    public static void main(String[] args) {

        int[] a = {1,5,1,1};
        int resPos = getMajorityArrayItemIndex(a);
        if(resPos>0){
            System.out.println("Majority index is "+resPos);
        }else {
            System.out.println("No clear winner found");
        }
    }

    static int getMajorityArrayItemIndex(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int resIndex = 0;
        int count = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[resIndex]){
                count++;
            }else {
                count--;
            }

            if(count==0){
                resIndex = i;
                count = 1;
            }
        }

        int tempCount = 0;

        for (int j : arr) {
            if (j == arr[resIndex]) {
                tempCount++;
            }
        }

        if(tempCount>(arr.length/2)){
            return resIndex;
        }

        return -1;
    }
}
