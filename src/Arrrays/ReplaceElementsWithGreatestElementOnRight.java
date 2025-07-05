package Arrrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRight {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 3, 18, 16};

        int[] res = replaceElements(arr);

        System.out.println("Output: " + Arrays.toString(res));
    }

    // Static method to match main method's context
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = -1;

        // Traverse from end to start
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, current);
        }

        return arr;
    }
}
