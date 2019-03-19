package com.gupaoedu.proxy.dynamic.jdk;

public class JdkProxyTest {
    public static void main(String[] args) {


        MeiPo meiPo = new MeiPo();
        Person person = (Person) meiPo.getInstance(new Girl());

        person.findLove();
    }
}
