package com.gupaoedu.factory.abstractfactory;

public class BenzEngine implements Engine{
    /**
     * 启动
     */
    @Override
    public void start() {
        System.out.println("Benz引擎启动");
    }
}
