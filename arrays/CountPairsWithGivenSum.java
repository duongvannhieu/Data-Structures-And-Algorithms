package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static int countPairsWithGivenSum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                count+=map.get(k - arr[i]);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        System.out.println(countPairsWithGivenSum(arr, 2));
    }
}
