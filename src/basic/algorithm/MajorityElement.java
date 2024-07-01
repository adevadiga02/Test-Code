package basic.algorithm;

// Moore Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int compareResult = arr.length/2;
        System.out.println(majorityElement(arr, compareResult));
    }

    public static int majorityElement(int[] arr, int compareResult) {

        if(arr.length == 0) return -1;
        if(arr.length == 1) return 1;

        int currentResult = arr[0];
        int count = 1;

        for(int i=1; i < arr.length; i++) {

            if(count == 0) {
                currentResult = arr[i];
                count++;
                continue;
            }

            if(currentResult == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return currentResult;
    }
}
