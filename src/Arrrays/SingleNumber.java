package Arrrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr  = {3,2,1,3,4,2,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }

    private static int singleNumber(int[] arr) {
        int result = 0;

        for (int num : arr){
            result = result ^ num;
        }
        return  result;
    }


}
