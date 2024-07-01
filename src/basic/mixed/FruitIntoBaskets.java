package basic.mixed;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        System.out.println(maximumNumberOfFruitsBasket(arr));
    }

    public static int maximumNumberOfFruitsBasket(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int maximumNumberOfFruitsBasket = 0;
        int currentCount = 0;

        while(j <= arr.length - 1) {
            if(map.size() <= 2) {
                if(map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
                j++;
                currentCount++;
                if (currentCount > maximumNumberOfFruitsBasket) {
                    maximumNumberOfFruitsBasket = currentCount;
                }
            } else {
                map.clear();
                i++;
                j = i;
                currentCount= 0;
            }
        }

        return maximumNumberOfFruitsBasket;
    }

    public static int maximumNumberOfFruitsBasketOptimizedWay(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int maximumNumberOfFruitsBasket = 0;
        int currentCount = 0;

        while(j <= arr.length - 1) {

            while (j <= arr.length - 1 && map.size() <= 2) {
                if(map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
                j++;
                currentCount++;
                if (currentCount > maximumNumberOfFruitsBasket) {
                    maximumNumberOfFruitsBasket = currentCount;
                }
            }

            if(map.size() > 2) {
                map.clear();
                i++;
                j = i;
                currentCount= 0;
            }
        }

        return maximumNumberOfFruitsBasket;
    }
}
