package Arrrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {10,45,30,25,4,8,12};

        //traverse
        System.out.println("Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        //print 
        System.out.println("\nMaximum Element: " + max);
        System.out.println("\nMinimum Element : "+ min);



    }
}
