package com.gupaoedu.factory.abstractfactory;

public class AudiEngine implements  Engine {
    /**
     * 启动
     */
    @Override
    public void start() {
        System.out.println("Audi引擎启动");
    }
}
