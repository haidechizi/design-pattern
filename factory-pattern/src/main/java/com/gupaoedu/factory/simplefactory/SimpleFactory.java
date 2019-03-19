package com.gupaoedu.factory.simplefactory;

public class SimpleFactory {

    public static Car createCar(String brand) {
        if("BMW".equals(brand)) {
            return new Bmw();
        } else if("Audi".equals(brand)) {
            return new Audi();
        }
        return null;
    }
}
