package BinarySearch;

public class BinarySearchJava {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 11;

        int index = binarysearch(nums,target);
        if(index != -1){
            System.out.println("Element Found at Index : " + index);
        }else {
            System.out.println("Element Not found");
        }
    }

    private static int binarysearch(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;

        while (low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target ){
                return  mid;
            } else if (nums[mid]<target) {
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return -1;
    }


}
