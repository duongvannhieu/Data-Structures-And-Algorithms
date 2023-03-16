package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static int doUnion(int[] arrOne, int[] arrTwo) {
        Set<Integer> setInt = new HashSet<>();
        for (int i = 0; i < arrOne.length; i++) {
            setInt.add(arrOne[i]);
        }
        for (int i = 0; i < arrTwo.length; i++) {
            setInt.add(arrTwo[i]);
        }
        return setInt.size();
    }

    public static void main(String[] args) {
        System.out.print("Enter size arrOne: ");
        int sizeArrOne = scanner.nextInt();
        System.out.print("Enter size arrTwo: ");
        int sizeArrTwo = scanner.nextInt();

        int[] arrOne = new int[sizeArrOne];
        int[] arrTwo = new int[sizeArrTwo];

        for (int i = 0; i < arrOne.length; i ++) {
            int el = i + 1;
            System.out.println("Enter element " + el + " of arrOne : ");
            arrOne[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrTwo.length; i ++) {
            int el = i + 1;
            System.out.println("Enter element " + el + " of arrTwo : ");
            arrOne[i] = scanner.nextInt();
        }

        System.out.println(doUnion(arrOne, arrTwo));
    }
}
