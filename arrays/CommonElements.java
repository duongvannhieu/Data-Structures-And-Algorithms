package arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElements {

    public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C) {

        ArrayList<Integer> listCommonElements = new ArrayList<>();

        int a = 0, b = 0, c = 0;

        while (a < A.length && b < B.length && c < C.length) {
            if (!listCommonElements.contains(A[a]) && A[a] == B[b] && A[a] == C[c]) {
                listCommonElements.add(A[a]);
                a++;
            }
            if (a < A.length) {
                if (A[a] < B[b]) a++;
                else if (B[b] < C[c]) b++;
                else c++;
            }
        }

        return listCommonElements;
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 2, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 2, 70, 80, 120};
        ArrayList<Integer> arrayList = commonElements(A, B, C);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
