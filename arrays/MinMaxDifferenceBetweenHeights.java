package arrays;

import java.util.Arrays;

public class MinMaxDifferenceBetweenHeights {

    public static int getMinMax(int[] arr, int k) {
        Arrays.sort(arr);
        int min;
        int max;
        int ans = arr[arr.length - 1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0) continue;
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[arr.length - 1] - k, arr[i - 1] + k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10};
        System.out.println(getMinMax(arr, 2));
    }
}
