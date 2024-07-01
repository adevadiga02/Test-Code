package basic.arrays;

public class NonDecreasing {
    public static void main(String[] args) {
        // int[] arr = {-2, 7, -1, 0, 1, 2};
        // int[] arr = {-10, 10, 0, 10, 3};
        int[] arr = {3, 4, 2, 8};

        System.out.println(checkPossibility(arr));

    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                count++;
            }
        }

        return count == 1;
    }


}
