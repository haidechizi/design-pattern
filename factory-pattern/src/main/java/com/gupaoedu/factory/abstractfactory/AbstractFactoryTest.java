package com.gupaoedu.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = new BenzFactory();
        factory.produceEngine().start();

        factory.produceTyre().roll();
    }
}
