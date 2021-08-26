package com.example.test.function1;

/**
 * <a href="https://mp.weixin.qq.com/s/9MyxkmLWnHAs9areu9_aqg">人类可读格式：b -> m</a>
 * @author caowq
 * @date 2021-08-23 10:33
 */
public class HumanReadableByteCountTest {

    public static void main(String[] args) {
        System.out.println("humanReadableByteCount(123456789L, false) = " + humanReadableByteCount(123456789L, true));
    }

    //

    /**
     * From: https://programming.guide/worlds-most-copied-so-snippet.html</br>
     *
     * @param bytes
     * @param si
     * @return
     */
    public static strictfp String humanReadableByteCount(long bytes, boolean si) {
        int unit = si ? 1000 : 1024;
        long absBytes = bytes == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(bytes);
        if (absBytes < unit) return bytes + " B";
        int exp = (int) (Math.log(absBytes) / Math.log(unit));
        long th = (long) Math.ceil(Math.pow(unit, exp) * (unit - 0.05));
        if (exp < 6 && absBytes >= th - ((th & 0xFFF) == 0xD00 ? 51 : 0)) exp++;
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
        if (exp > 4) {
            bytes /= unit;
            exp -= 1;
        }
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }

}
