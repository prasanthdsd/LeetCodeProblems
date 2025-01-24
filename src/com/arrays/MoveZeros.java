package com.arrays;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */
public class MoveZeros {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0, 1, 0, 3, 12})));
    }
    public static int[] moveZeroes(int[] nums) {

        int j = 0;
        int k = 0;
        for (int i = 0; i +j < nums.length; i++) {
            if(nums[i] == 0) {
                j++;
            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
