package com.goit.implementaions;

import com.goit.interfaces.Validator;

public class NumberValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number result) {
        return (result.intValue() > 0);
    }
}
