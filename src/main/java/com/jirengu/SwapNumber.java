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
        System.out.println("before swap");
        System.out.println("num 1 before swapping: " + num1);
        System.out.println("num 2 before swapping: " + num2);
        // 二进制  & ^    ~ |
        // 进行值的交换，在变更值之前肯定需要进行原值保存
        // 100 --  1100100    左移动七位 在二进制表示即是  右侧 加上 7个0
        int test = 100;
        System.out.println("100的二进制表示" + Integer.toBinaryString(test));
        System.out.println("左移动7位测试：" + Integer.toBinaryString(test<<7));
        System.out.println("127二进制表示" + Integer.toBinaryString(127));
        //交换想法 ：将num1，num2集中表示在一个 num上，再进行拆分取数，达到交换的目的
        num1 = (num1 << 7)  | num2;   //将num1与num2的数值集中再num1上
        num2 = num1 >> 7 ;  //num2方取num1部分数值   引入不变量  二进制 后七位全为1 -- 》 127
        // 1111111  1 2 4 8 16 32 64  = 96  31 = 127
        num1 = num1 & 127 ;
        System.out.println("after swap");
        System.out.println("num 1 after swapping: " + num1);
        System.out.println("num 2 after swapping: " + num2);
    }
}
