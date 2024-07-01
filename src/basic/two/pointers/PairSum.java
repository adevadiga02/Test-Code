package basic.two.pointers;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(pairSum(arr, 7));
    }

    public static int pairSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right) {
            int currentSum = arr[left] + arr[right];

             if(currentSum == target) {
                 count++;
                 right--;
             }
             if(currentSum < target) {
                 left++;
             }

            if(currentSum > target) {
                right--;
            }
        }

        return count > 0 ? count : -1;
    }
}
