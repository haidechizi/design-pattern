package com.gupaoedu.proxy.staticproxy;

public class StaticProxyTest {

    public static void main(String[] args) {
        Person person = new Son();

        Father father = new Father(person);
        father.findLove();
    }
}
