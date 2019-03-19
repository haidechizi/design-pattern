package com.gupaoedu.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new BenzFactory();
        factory.produceCar().start();
    }
}
