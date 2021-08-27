package com.wilche.summary.bigdecimalstat.interfaces;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author caowq
 * @date 2021-08-26 17:44
 */
@FunctionalInterface
public interface BigDecimalConsumer {

    void accept(BigDecimal value);

    default BigDecimalConsumer andThen(BigDecimalConsumer after) {
        Objects.requireNonNull(after);
        return (t) -> {
            accept(t);
            after.accept(t);
        };
    }

}
