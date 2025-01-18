package com.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1})));

    }
    public static int[] removeDuplicates(int[] nums) {
        int len = nums.length;
        int temp[] = new int[len];
        int j = 0;

        for (int i = 0; i < len-1; i++) {
            if(nums[i] != nums[i+1]) {
                temp[j++] = nums[i];
            }

        }
        if(nums[j] != nums[len-1]) {
            temp[j++] = nums[len-1];
        }
        return temp;
    }
}
