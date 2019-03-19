package com.gupaoedu.factory.factorymethod;

public class Bmw implements Car {
    /**
     * 启动
     */
    @Override
    public void start() {
        System.out.println("BWM启动运行");
    }

    /**
     * 停止
     */
    @Override
    public void stop() {
        System.out.println("BWM停止运行");
    }
}
