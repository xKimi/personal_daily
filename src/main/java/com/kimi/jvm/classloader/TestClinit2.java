package com.kimi.jvm.classloader;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/10
 */
public class TestClinit2 {

    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
