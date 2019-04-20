package com.gupaoedu.proxy.dynamic.gpproxy;

import com.gupaoedu.proxy.dynamic.jdk.Girl;
import com.gupaoedu.proxy.dynamic.jdk.Person;

public class GpProxyTest {
    public static void main(String[] args) throws Exception {

        Person person = (Person) new MeiPo().getInstance(new Girl());

        person.findLove();
    }
}
