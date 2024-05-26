package com.example.hands_on_functional_programming;

import com.example.hands_on_functional_programming.Interface.Function;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandsOnFunctionalProgrammingApplication {

    public static void main(String[] args) {
        FunctionExample();
    }

    private static void FunctionExample() {
        // 数字を文字列に変換する関数を作成する例
        Function<Integer, String> intToString = (i) -> Integer.toString(i);
        System.out.println(intToString.apply(5));

        // 受け取った数字を倍にして返す例
        Function<Integer, Integer> doubleInt = (i) -> i * 2;
        System.out.println(doubleInt.apply(6));
    }
}
