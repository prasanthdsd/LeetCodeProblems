package com.arrays;

public class SearchInsertPosition {

    public  static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1,2,4,5,6}, 7));
    }

    public static int searchInsertPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return start;
    }
}
