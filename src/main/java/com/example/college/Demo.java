package com.example.college;

import org.hibernate.validator.internal.engine.constraintvalidation.PredefinedScopeConstraintValidatorManagerImpl;

public class Demo {

    public static int test(int a, int b) {
           a = 50;
             b = 60;
        int c = a + b;
        return c;

    }

    public static void main(String[] args) {
        test(50, 60);
    }
}

