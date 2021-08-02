package com.kimi.base.number;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/14
 */
public class LongTest {

    public static void main(String[] args) {
        // 如何证明long类型占用8个字节64位
        long l = Long.MAX_VALUE;
        System.out.println(Long.toBinaryString(l));
        long l2 = Long.MIN_VALUE;
        System.out.println(Long.toBinaryString(l2));
    }
}
