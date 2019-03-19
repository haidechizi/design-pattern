package com.gupaoedu.factory.factorymethod;

public class BenzFactory implements Factory {
    /**
     * 生产汽车
     *
     * @return
     */
    @Override
    public Car produceCar() {
        return new Benz();
    }
}
