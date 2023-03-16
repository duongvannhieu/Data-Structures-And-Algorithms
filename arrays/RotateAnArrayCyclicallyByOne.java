package arrays;

public class RotateAnArrayCyclicallyByOne {

    public static void rotate(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = lastElement;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int A[] = {9, 8, 7, 6, 4, 2, 1, 3};
        rotate(arr);
        System.out.println("======");
        rotate(A);
    }
}
