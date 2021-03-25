package com.wilche.multithreadingskills.stack_heap_outifmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单堆溢出demo
 * <p>
 * 参数 -Xss 去调整JVM栈的大小
 *
 * @author caoweiquan
 * @date 2021/3/25
 */
public class HeapOutOfMemory {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        while(true){
            list.add(new String("test"));
            System.out.println(list.size()
                    + "--" + Runtime.getRuntime().totalMemory()/(1024*1024)+"M");
        }
    }

}
