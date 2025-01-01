package com.mmendoza;

public class Accumulator implements Modification {

    private Integer value;

    public Accumulator() {
    }

    public Accumulator(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    /* implements method*/
    @Override
    public void increment(Integer a) {
        this.value += a; /* increment value */
    }
}
