package com.example.hands_on_functional_programming.Interface;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
