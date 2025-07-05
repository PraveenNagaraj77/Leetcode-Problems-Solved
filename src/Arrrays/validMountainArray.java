package Arrrays;

public class validMountainArray {



    public static void main(String[] args) {
        int[] test1 = {0, 2, 3, 4, 5, 2, 1, 0}; // true
        int[] test2 = {0, 2, 3, 3, 5, 2, 1, 0}; // false (3 == 3)
        int[] test3 = {3, 2, 1};               // false (no increasing)
        int[] test4 = {0, 1, 2, 3};            // false (no decreasing)

        System.out.println(isValidMountain(test1)); // true
        System.out.println(isValidMountain(test2)); // false
        System.out.println(isValidMountain(test3)); // false
        System.out.println(isValidMountain(test4)); // false
    }

    public static boolean isValidMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Climb up (strictly increasing)
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // If no climb or peak is at the end — invalid
        if (i == 0 || i == n - 1) return false;

        // Climb down (strictly decreasing)
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // If reached the end, it's a mountain
        return i == n - 1;
    }


}
