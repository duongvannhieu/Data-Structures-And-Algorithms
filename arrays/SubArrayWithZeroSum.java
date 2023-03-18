package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public static boolean findSum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 0, 6};
        if (findSum(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
