package com.gupaoedu.factory.abstractfactory;

public class AudiFactory implements Factory {
    @Override
    public Engine produceEngine() {
        return new AudiEngine();
    }

    @Override
    public Tyre produceTyre() {
        return new AudiTyre();
    }
}
