package Arrrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum =0;

        for (int num : nums){
            actualSum = actualSum+num;
        }
        return  expectedSum-actualSum;

    }
}
