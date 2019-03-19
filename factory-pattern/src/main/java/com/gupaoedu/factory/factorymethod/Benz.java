package com.gupaoedu.factory.factorymethod;

public class Benz implements Car {
    /**
     * 启动
     */
    @Override
    public void start() {
        System.out.println("Benz启动运行");
    }

    /**
     * 停止
     */
    @Override
    public void stop() {
        System.out.println("Benz停止运行");
    }
}
