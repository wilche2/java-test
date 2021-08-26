package com.example.test.utils;

import java.math.BigDecimal;

@FunctionalInterface
public interface ToBigDecimalFunction<T> {

    BigDecimal applyAsBigDecimal(T value);

}
