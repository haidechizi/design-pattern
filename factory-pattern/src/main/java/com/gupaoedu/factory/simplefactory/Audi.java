
package com.gupaoedu.factory.simplefactory;

public class Audi implements  Car {
    @Override
    public void start() {
        System.out.println("Audi开始运行");
    }

    @Override
    public void stop() {
        System.out.println("Audi停止运行");
    }
}
