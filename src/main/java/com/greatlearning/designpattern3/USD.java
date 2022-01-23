package com.greatlearning.designpattern3;

public class USD implements CurrencyConvertor{
    @Override
    public float convertToINR(float amount) {
        return (float) (amount * 75.45);
    }
}
