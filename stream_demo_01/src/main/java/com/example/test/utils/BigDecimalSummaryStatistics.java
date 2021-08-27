package com.example.test.utils;

import com.example.test.interfaces.BigDecimalConsumer;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author caowq
 * @date 2021-08-26 17:45
 */
public class BigDecimalSummaryStatistics implements BigDecimalConsumer {

    private long count;
    private BigDecimal sum = BigDecimal.ZERO;
    private BigDecimal min = BigDecimal.valueOf(Integer.MAX_VALUE);
    private BigDecimal max = BigDecimal.valueOf(Integer.MIN_VALUE);

    public BigDecimalSummaryStatistics() {
    }

    @Override
    public void accept(BigDecimal value) {
        ++count;
        sum = sum.add(value);
        min = min(min, value);
        max = max(max, value);
    }

    public void combine(BigDecimalSummaryStatistics other) {
        count += other.count;
        sum = sum.add(other.sum);
        min = min(min, other.min);
        max = max(max, other.max);
    }

    private BigDecimal min(BigDecimal min, BigDecimal value) {
        return min.compareTo(value) < 0 ? min : value;
    }

    private BigDecimal max(BigDecimal max, BigDecimal value) {
        return max.compareTo(value) > 0 ? max : value;
    }

    public final long getCount() {
        return count;
    }

    public final BigDecimal getSum() {
        return sum;
    }

    public final BigDecimal getMin() {
        return min;
    }

    public final BigDecimal getMax() {
        return max;
    }

    /**
     * @param scale        精度
     * @param roundingMode 精度的数值运算的舍入行为
     * @return 计算值
     */
    public final BigDecimal getAverage(int scale, RoundingMode roundingMode) {
        return getCount() > 0 ? getSum().divide(BigDecimal.valueOf(getCount()), scale, roundingMode) : BigDecimal.ZERO;
    }
}
