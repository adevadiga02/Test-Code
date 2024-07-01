package basic.arrays;

import java.util.Arrays;

// https://www.codingninjas.com/studio/problems/second-largest-element-in-the-array_873375?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {12, 1, 35, 10, 34, 1};

        //approach1(arr);
        approach2(arr);
    }

    public static void approach1(int[] arr) {
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 2]);
    }

    public static void approach2(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int i = 0;

        while(i < arr.length){

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }

            i++;
        }

        System.out.println(secondLargest);
    }
}
