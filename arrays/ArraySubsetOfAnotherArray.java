package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            map.put(i, arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsValue(arr2[i])) {
                count++;
            }
        }
        return count == arr2.length ? true : false;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4};
        if (isSubset(arr1, arr2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
