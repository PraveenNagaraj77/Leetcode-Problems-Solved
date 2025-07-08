package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target =8;

        int[] result = searchRange(nums,target);
        System.out.println("First and Last Position: " + Arrays.toString(result));

    }

    private static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};
    }

    public static int findFirst(int[]  nums,int target){
        int left =0,right = nums.length-1;
        int index = -1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                index = mid;
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid+1;

            }else {
                right=mid-1;
            }

        }
        return index;


    }

    public static int findLast(int[]  nums,int target){
        int left =0,right = nums.length-1;
        int index = -1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                index = mid;
                left = mid+1;
            } else if (nums[mid] < target) {
                left = mid+1;

            }else {
                right=mid-1;
            }

        }
        return index;

    }

}
