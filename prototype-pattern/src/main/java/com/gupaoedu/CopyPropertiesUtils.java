package com.gupaoedu;

import java.lang.reflect.Field;

public class CopyPropertiesUtils {


    /**
     * 对象copy
     * 将from的元素copy到to中
     *
     * @param from
     * @param to
     */
    public static void copyProperties(Object from, Object to) throws Exception {
        if (from == null) {
            throw new Exception("from is null");
        }
        if (from == null) {
            throw new Exception("to is null");
        }
        Class<?> fromClass = from.getClass();
        Class<?> toClass = to.getClass();
        for (Field field : fromClass.getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(from);
            Field toField = toClass.getDeclaredField(field.getName());
            if (toField == null) {
                // 不存在的元素自动忽略
                continue;
            }
            toField.setAccessible(true);
            toField.set(to, value);

        }

    }
}
