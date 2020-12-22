package com.cloud.learn;

/**
 * 多线程模式下 异常处理demo
 *
 * @author sqm
 * @date 2020/12/22
 **/
public class HandlerException {


    public static void main(String[] args) {

        Thread.currentThread().setUncaughtExceptionHandler((t, e) -> System.out.println(e.getMessage()));
        throw new RuntimeException("exception");
    }
}
