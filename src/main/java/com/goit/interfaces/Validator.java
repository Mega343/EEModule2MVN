package com.goit.interfaces;

public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}