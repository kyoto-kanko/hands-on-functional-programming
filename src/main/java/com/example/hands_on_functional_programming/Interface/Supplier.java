package com.example.hands_on_functional_programming.Interface;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}