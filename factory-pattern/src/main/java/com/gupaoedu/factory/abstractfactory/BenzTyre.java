package com.gupaoedu.factory.abstractfactory;

public class BenzTyre implements  Tyre {
    /**
     * 滚动
     */
    @Override
    public void roll() {
        System.out.println("Benz轮胎滚动");
    }
}
