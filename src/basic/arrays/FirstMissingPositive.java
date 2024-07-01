package basic.arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {

        int[] arr = {3, 2, -6, 1, 0};

        Arrays.sort(arr); // nlogn
        // {-6 0 1 2 3}

        int left = 0;
        int right = 1;

        while (left < right && right < arr.length - 1) {

            if (arr[right] - arr[left] > 0) {
                int smallestValue = arr[left] + 1;
                if(smallestValue < arr[right] && smallestValue > 0) {
                    System.out.println("First missing value -> " + smallestValue);
                    break;
                }
            }

            left++;
            right++;
        }

    }
}
