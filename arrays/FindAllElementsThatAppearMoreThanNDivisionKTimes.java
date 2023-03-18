package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindAllElementsThatAppearMoreThanNDivisionKTimes {
    public static HashMap<Integer, Integer> moreThanNdK(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (arr.length == 0) {
            return map;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 9, 2, 9, 7};
        int k = 3;
        int temp = arr.length / k;
        for (Map.Entry map:
             moreThanNdK(arr).entrySet()) {
            Integer integer = (Integer) map.getValue();
            if (integer > temp) {
                System.out.println(map.getKey());
            }
        }
    }
}
