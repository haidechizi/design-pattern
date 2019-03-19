package com.gupaoedu.factory.factorymethod;

public class BmwFactory implements Factory {
    /**
     * 生产汽车
     *
     * @return
     */
    @Override
    public Car produceCar() {
        return new Bmw();
    }
}
