package basic.mixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {

    // Boyers moore algorithm
    // Since the threshold > n/3, that means there cannot be an answer more than 2
    // For e.g. {1, 2, 1, 2, 1, 2, 3, 4}; i.e. 8/3 = 2 and greater than 2 is 3
    // So if we add 3 + 3 + 3 = 9 but the total is 8, that means only 2 elements with maximum count of 3 will be there
    // Logic is to take the count of element 1 and 2
    // Important Note: While checking the

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 2, 3, 4};
        // int[] arr = {3, 2, 3};
        int compareResult = arr.length / 3;

        System.out.println("Result is %s "+ Arrays.asList(majorityElement(arr, compareResult)));
    }

    public static List<Integer> majorityElement(int[] arr, int compareResult) {

        int firstElement = 0;
        int firstCount = 0;

        int secondElement = 0;
        int secondCount = 0;

        for(int i = 0; i < arr.length; i++) {
            if(firstCount == 0 && arr[i] != secondElement) { // THis condition is to check if the secondElement already have value of the firstElement
                                                                    // Inshort if element1 = 1 should hold count of their own element, here in this case it may duplicate
                firstElement = arr[i];
                firstCount++;
            } else if(secondCount == 0 && arr[i] != firstElement){
                secondElement = arr[i];
                secondCount++;
            } else if(arr[i] == firstElement){ firstCount++; }
              else if(arr[i] == secondElement){ secondCount++; }
              else {
                  firstCount--;
                  secondCount--;
            }
        }

        firstCount = 0;
        secondCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(firstElement == arr[i]) {
                firstCount++;
            }

            if(secondElement == arr[i]) {
                secondCount++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if(firstCount > compareResult) result.add(firstElement);
        if(secondCount > compareResult) result.add(secondElement);

        return result;
    }
}
