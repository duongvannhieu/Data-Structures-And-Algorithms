package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindDuplicateNumberAnArray {
    public static void findDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println(arr[i]);
            } else {
                map.put(arr[i], arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,1,4};
        findDuplicate(arr);
    }
}
