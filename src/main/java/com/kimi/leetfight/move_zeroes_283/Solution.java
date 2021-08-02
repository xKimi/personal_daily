package com.kimi.leetfight.move_zeroes_283;

/**
 * Description:
 * Copyright @2021 xKimi.inc
 *
 * @author Kimi
 * @date 2021/8/2
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[j++] = num;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.moveZeroes(new int[]{0,1,0,3,12});
        solution.moveZeroes(new int[]{0, 1});
    }
}
