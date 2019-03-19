package com.gupaoedu.factory.simplefactory;

public class Bmw implements Car {
    @Override
    public void start() {
        System.out.println("BMW启动运行");
    }

    @Override
    public void stop() {
        System.out.println("BMW停止运行");
    }
}
