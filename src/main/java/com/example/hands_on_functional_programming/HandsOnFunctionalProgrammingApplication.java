package com.example.hands_on_functional_programming;

import com.example.hands_on_functional_programming.Interface.BiFunction;
import com.example.hands_on_functional_programming.Interface.Function;
import com.example.hands_on_functional_programming.Interface.Supplier;
import com.example.hands_on_functional_programming.Model.Example;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandsOnFunctionalProgrammingApplication {

    public static void main(String[] args) {
        FunctionExample();

        BiFunctionExample();

        Supplier();
    }

    private static void FunctionExample() {
        // 数字を文字列に変換する関数を作成する例
        Function<Integer, String> intToString = (i) -> Integer.toString(i);
        System.out.println(intToString.apply(5));

        // 受け取った数字を倍にして返す例
        Function<Integer, Integer> doubleInt = (i) -> i * 2;
        System.out.println(doubleInt.apply(6));
    }

    private static void BiFunctionExample() {
        // 2つの数字を受け取り、足し算をする関数を作成する例
        BiFunction<Integer, Integer, Integer> addInt = (i, j) -> i + j;
        System.out.println(addInt.apply(3, 4));

        // 2つの数字を受け取り、掛け算をする関数を作成する例
        BiFunction<Integer, Integer, Integer> multiplyInt = (i, j) -> i * j;
        System.out.println(multiplyInt.apply(3, 4));
    }

    private static void Supplier() {
        Supplier<Example> supplier = () -> Example.ToExample("Taro", 20);
        System.out.println(supplier.get());
    }
}
