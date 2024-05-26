package com.example.hands_on_functional_programming.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Example {

    private final String name;
    private final int age;

    public static Example ToExample(String name, int age) {
        if (age == 20) {
            System.out.println("インスタンス化成功");
            return new Example(name, age);
        } else {
            System.out.println("インスタンス失敗");
            throw new RuntimeException("年齢が20歳ではありません");
        }
    }
}
