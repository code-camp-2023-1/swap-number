package com.jirengu;

import java.util.Random;

public class SwapNumber {
    private static final Random RANDOM = new Random();

    public static int number1;

    public static int number2;

    public static int num2 = RANDOM.nextInt(100);

    public static void main(String[] args) {
        // 请利用位运算相关知识，在不引入额外变量的情况下交换num1和num2的值：
        // 提示：利用异或计算
        int num1 = RANDOM.nextInt(100);
        number1 = num1;
        int num2 = RANDOM.nextInt(100);
        number2 = num2;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num 1 after swapping: " + num1);
        System.out.println("num 2 after swapping: " + num2);
    }
}
