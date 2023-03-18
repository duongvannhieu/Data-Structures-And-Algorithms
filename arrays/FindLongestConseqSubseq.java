package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestConseqSubseq {
    public static int findLongestConseqSubseq(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int prev = arr[0];
        int curr = 1, ans = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == prev + 1) {
                curr++;
            } else if (arr[i] != prev) {
                curr = 1;
            }
            prev = arr[i];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,3,10,4,20,2};
        System.out.println(findLongestConseqSubseq(arr));
    }
}
