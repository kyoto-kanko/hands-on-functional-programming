package com.example.hands_on_functional_programming.Interface;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
