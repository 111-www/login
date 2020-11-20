package com.yueqian.shop;

import org.junit.Test;

public class shop {
    private int a =1;

    public static void main(String[] args) {
        System.out.println("正在购物");
    }

    void fun(){
        System.out.println("购物完成");
    }

    @Test
    public void fun2(){
        int a = 2;
        int b = 3;
        int c=(a+b>5?a++:++b);
        System.out.println(c);
    }
}
