package com.kimi.jvm.classloader;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/10
 */
public class TestLoader {

    // prepare i = 0; initialization i = 1;
    private static int i = 1;

    // 编译时分配，prepare阶段初始化 j = 2
    private static final int j = 2;

    public static void main(String[] args) {
        System.out.println("test loader");
        System.out.println("loader test");
    }
}
