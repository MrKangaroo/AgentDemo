package com.d1989.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author daisy
 * @desc
 * @create 2019/1/5
 */
public class MyAgent {
    /**
     *
     *  Java Agent是从JDK1.5及以后引入的，其作用相当于你的main函数之前的一个拦截器，即在执行main函数前，先执行Agent中的代码。
     *
     *  Agent的代码与你的main方法在同一个JVM中运行，并被同一个类加载器所加载，被同一的安全策略 和上下文所管理。
     *
     *  public static void premain(String agentArgs, Instrumentation inst);  //【1】
     *  public static void premain(String agentArgs);  //【2】
     *
     * 【1】和【2】同时存在时，【1】会优先被执行，而【2】则会被忽略
     *
     *  -javaagent: 文件位置 [=参数]
     *
     *  -javaagent: 文件位置 [=参数] -javaagent: 文件位置 [=参数]，其中的参数就是premain函数中的agentArgs
     *
     * @param agentArgs
     * @param inst
     */

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("this is an agent.");
        System.out.println("args:" + agentArgs + "\n");
    }

    public static void premain(String agentArgs) {
        System.out.println("this is an agent.");
        System.out.println("args:" + agentArgs + "\n");
    }


}
