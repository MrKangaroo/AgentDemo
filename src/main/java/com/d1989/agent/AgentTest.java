package com.d1989.agent;

/**
 * @author daisy
 * @desc
 * @create 2019/1/5
 */
public class AgentTest {

    private void fun1() {
        System.out.println("this is fun 1.");
    }

    private void fun2() {
        System.out.println("this is fun 2.");
    }

    public static void main(String[] args) {
        AgentTest test = new AgentTest();
        test.fun1();
        test.fun2();
    }
}
