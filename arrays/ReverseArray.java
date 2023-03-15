package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arrInt[] = {1, 2, 3, 4, 5, 6};
        int temp;
        int start = 0;
        int end = arrInt.length - 1;

        while (start < end) {
            temp = arrInt[start];
            arrInt[start] = arrInt[end];
            arrInt[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
