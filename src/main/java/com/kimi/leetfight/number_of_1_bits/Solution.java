package com.kimi.leetfight.number_of_1_bits;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/20
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
//        return Integer.bitCount(n);
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        for (int i = 0; i < 32; i++) {
//            if (n <= 0) {
//                break;
//            }
            if (n % 2 == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }
}
