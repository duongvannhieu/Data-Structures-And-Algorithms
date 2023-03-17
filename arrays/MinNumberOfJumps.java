package arrays;

public class MinNumberOfJumps {
    public static int numberOfJump(int[] arr) {
        int jump = 0, res = 0, temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            temp = Math.max(temp, arr[i] + i);
            if (i == jump) {
                res++;
                jump = temp;
            }
        }

        if (jump < arr.length - 1) return -1;

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        System.out.println(numberOfJump(arr));
    }
}
