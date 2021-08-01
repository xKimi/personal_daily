package com.kimi.multithread;

import java.util.concurrent.*;

/**
 * Copyright (c) 2021. All Rights Reserved
 *
 * @author Kimi
 * @date 2021/7/31
 */
public class MultiThreadTest {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                10,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(50));
        for (int i = 0; i < 50; i++) {
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName()));
        }
        System.out.println(System.currentTimeMillis() - startTime);
        threadPoolExecutor.shutdown();
    }
}
