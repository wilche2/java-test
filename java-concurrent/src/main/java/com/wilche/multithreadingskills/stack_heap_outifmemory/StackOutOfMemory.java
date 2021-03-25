package com.wilche.multithreadingskills.stack_heap_outifmemory;

/**
 * 简单栈溢出demo
 * @author caoweiquan
 * @date 2021/3/25
 */
public class StackOutOfMemory {

    public static void test() {
        test();
    }

    public static void main(String[] args) {
        test();
    }

}
