package basic.sortingAndSearching;

import java.util.Arrays;

// Trick
// As the name indicates select minimum and swap it
// 1. Select Minimum and swap it
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        for (int i = 0; i <= arr.length - 2; i++) { // arr.length - 2 because we don't want to check the last value as there will not be any value left
            int currentMinIndex = i;
            for (int j = i; j <= arr.length -1; j++) {
                //System.out.println("I index value "+ arr[i] + " J index value"+ arr[j]);
                if (arr[j] < arr[currentMinIndex]){
                    currentMinIndex = j;
                }
            }
            // System.out.println("currentMin >>>>"+ currentMinIndex);
            if (currentMinIndex != -1) {
                swap(arr, i, currentMinIndex);
            }

            //System.out.println("After swap index"+ arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int firstValueIndex, int currentMinIndex) {
        int temp = arr[firstValueIndex];
        arr[firstValueIndex] = arr[currentMinIndex];
        arr[currentMinIndex] = temp;
    }

}
