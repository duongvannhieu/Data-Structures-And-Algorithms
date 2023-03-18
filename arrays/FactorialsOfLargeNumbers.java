package arrays;

import java.util.ArrayList;

public class FactorialsOfLargeNumbers {

    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] factorial = new int[100000];
        factorial[0] = 1;
        int size = 1;

        for (int i = 1; i <= n; i++) {
            int carry = 0;
            for (int j = 0; j < size; j++) {
                int product = factorial[j] * i + carry;
                factorial[j] = product % 10;
                carry = product / 10;
            }
            while (carry != 0) {
                factorial[size] = carry % 10;
                carry /= 10;
                size++;
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            arrayList.add(factorial[i]);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
