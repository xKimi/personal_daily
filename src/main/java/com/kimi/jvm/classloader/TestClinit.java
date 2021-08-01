package com.kimi.jvm.classloader;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/10
 */
public class TestClinit {

    private static int num = 1;

    static {
        num = 2;
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
