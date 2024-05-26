# hands-on-functional-programming

## 1. Functional Interface

### 説明

関数型インターフェースは、ちょうど 1 つの抽象メソッドを持つインターフェースです。Java 8 以降、ラムダ式のターゲット型として使用されます。

### 定義方法

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod();
}
```

## 2. Predicate

### 説明

引数を 1 つ取り、boolean を返す関数型インターフェースです。

### 利用例

```java
Predicate<Integer> isEven = num -> num % 2 == 0;
boolean result = isEven.test(4); // true
```

### メリット

- 簡潔に条件を記述できる。
- 複数の条件を組み合わせて使用できる (`and`, `or`, `negate` メソッド)。

### デメリット

- 複雑な条件になると、読みやすさが低下する。

### 定義方法

```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```

## 3. Function

### 説明

引数を 1 つ取り、結果を返す関数型インターフェースです。

### 利用例

```java
Function<String, Integer> lengthFunction = str -> str.length();
int length = lengthFunction.apply("hello"); // 5
```

### メリット

- 変換処理を簡潔に記述できる。
- `compose` や `andThen` を使用して関数の連結が可能。

### デメリット

- 複雑な処理になると、可読性が低下する可能性がある。

### 定義方法

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```

## 4. Consumer

### 説明

引数を 1 つ取り、返り値を持たない関数型インターフェースです。

### 利用例

```java
Consumer<String> printConsumer = str -> System.out.println(str);
printConsumer.accept("Hello World"); // 出力: Hello World
```

### メリット

- 簡潔に副作用を記述できる。
- チェーン処理が可能 (`andThen` メソッド)。

### デメリット

- 関数型プログラミングでは副作用は避けるべきという意見もある。

### 定義方法

```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

## 5. Supplier

### 説明

引数を取らず、結果を返す関数型インターフェースです。

### 利用例

```java
Supplier<String> stringSupplier = () -> "Hello Supplier";
String result = stringSupplier.get(); // "Hello Supplier"
```

### メリット

- 遅延評価やデフォルト値の提供に便利。
- シンプルな生成ロジックを記述できる。

### デメリット

- 関数の中で生成ロジックが増えると、メンテナンスが難しくなる。

### 定義方法

```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```

## 6. BiFunction

### 説明

2 つの引数を取り、結果を返す関数型インターフェースです。

### 利用例

```java
BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
int result = sumFunction.apply(5, 3); // 8
```

### メリット

- 2 つの引数を使った処理を簡潔に記述できる。
- `compose` や `andThen` メソッドで関数の連結が可能。

### デメリット

- 引数の数が増えると、可読性が低下する可能性がある。

### 定義方法

```java
@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
```

## 7. UnaryOperator

### 説明

引数と返り値が同じ型の `Function` です。

### 利用例

```java
UnaryOperator<Integer> square = x -> x * x;
int result = square.apply(5); // 25
```

### メリット

- 同じ型の変換処理を簡潔に記述できる。
- 関数の連結が可能。

### デメリット

- 特殊用途なので利用シーンが限られる。

### 定義方法

```java
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
}
```

## 8. BinaryOperator

### 説明

2 つの引数と返り値が同じ型の `BiFunction` です。

### 利用例

```java
BinaryOperator<Integer> multiply = (a, b) -> a * b;
int result = multiply.apply(3, 4); // 12
```

### メリット

- 同じ型の 2 つの引数を使った処理を簡潔に記述できる。
- 関数の連結が可能。

### デメリット

- 特殊用途なので利用シーンが限られる。

### 定義方法

```java
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
}
```

## まとめ

Java の関数型インターフェースは、コードを簡潔かつ明確にするために強力なツールですが、複雑なロジックを書く場合は注意が必要です。各インターフェースの使い所を理解し、適切に利用することが重要です。
