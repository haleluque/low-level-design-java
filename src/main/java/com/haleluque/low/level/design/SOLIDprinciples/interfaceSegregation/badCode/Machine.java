package com.haleluque.low.level.design.SOLIDprinciples.interfaceSegregation.badCode;


/**
 * Ensure that classes are not burdened with methods they don't need.
 * <p>
 * It promotes better design by breaking large, general-purposed interfaces into smaller, more specific ones
 */
public interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}
