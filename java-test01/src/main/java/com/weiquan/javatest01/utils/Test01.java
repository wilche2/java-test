package com.weiquan.javatest01.utils;

/**
 * @author caoweiquan
 * @date 2021/3/14
 */
public class Test01 {

    public static void main(String[] args) {
//        int nums1 = 0b110;
//        int nums2 = 110;
//        int nums3 = 0127;
//        int nums4 = 0x110A;
//
//        System.out.println("nums1 = " + nums1);
//        System.out.println("nums2 = " + nums2);
//        System.out.println("nums3 = " + nums3);
//        System.out.println("nums4 = " + nums4);

        byte b = 1;
        short s = 1;
        char c = '1';
        int i = b + s + c;
        long L = 1L + i;
        float f = L;
        double d = f;

        System.out.println("i = " + i);
        System.out.println("L = " + L);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }

}
