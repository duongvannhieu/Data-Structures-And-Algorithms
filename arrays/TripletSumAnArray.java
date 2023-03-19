package arrays;

public class TripletSumAnArray {
    public static boolean find3Numbers(int[] arr, int k) {
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[start];
                if (k == sum) return true;
                else if (sum < k) start++;
                else end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6};
        int k = 10;
        if (find3Numbers(arr, k))
            System.out.print("1");
        else
            System.out.print("0");
    }
}
