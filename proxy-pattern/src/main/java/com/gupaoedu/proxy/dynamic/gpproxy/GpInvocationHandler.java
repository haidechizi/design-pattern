package com.gupaoedu.proxy.dynamic.gpproxy;

import java.lang.reflect.Method;

public interface GpInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
