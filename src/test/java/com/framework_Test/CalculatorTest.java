package com.framework_Test;

import com.framework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public static Calculator c;
    @BeforeEach
    public void setup(){
        c = new Calculator();
    }
    @Test
    public void additionTest(){


        Assertions.assertEquals(30,c.addition(10,20));


    }
    @Test
   public void subtraction() {

        Assertions.assertEquals(-10,c.subtraction(10,20));
    }

    @Test
    public void multiplication() {

        Assertions.assertEquals(50,c.multiplication(10,5));
    }

    @Test
    public void division() {

        Assertions.assertEquals(5,c.division(100,20));
    }
}
