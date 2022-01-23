package com.greatlearning.designpattern3;

public class GBP implements CurrencyConvertor{
    @Override
    public float convertToINR(float amount) {
        return (float) (amount * 98.67);
    }
}
