package com.gupaoedu.factory.abstractfactory;

public class BenzFactory implements  Factory {
    @Override
    public Engine produceEngine() {
        return new BenzEngine();
    }

    @Override
    public Tyre produceTyre() {
        return new BenzTyre();
    }
}
