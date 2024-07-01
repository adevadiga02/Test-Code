package basic.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateMatrixLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        //rotateMatrixApproach1(arr, k);

        //System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(rotateMatrixApproach2WithSpace(arr, k)));
    }

    public static void rotateMatrixApproach1(int[] arr, int k) {
        int i = 0;
        int n = arr.length;

        reverse(arr, 0, k);
        reverse(arr, k + 1 , n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int[] arr, int start, int end) {

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateMatrixApproach2WithSpace(int[] arr, int k) {
        k = arr.length -k; // for left rotate

        int[] resultArray = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            int currentIndex = (i+k)%arr.length;

            resultArray[currentIndex] = arr[i];

        }

        return resultArray;
    }

}
