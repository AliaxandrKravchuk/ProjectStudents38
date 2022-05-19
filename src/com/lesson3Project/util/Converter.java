package com.lesson3Project.util;

@FunctionalInterface
public interface Converter<T, N> {
    N convert(T t);

    static <T> boolean isNotNull(T t) {
        return t != null;
    }

}
