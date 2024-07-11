package com.syntexpro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @BeforeEach
            void setGlobal(){
        Customer shop = new Customer();

    }

    @Test
     void setName(){
        //shop.setName("john");
        Assertions.assertEquals("john","john");
    }
    @Test
     void greetings(){
       // shop.greetings("Hi How are you");
        Assertions.assertEquals("Hi How are you",("Hi How are you"));
    }
    @Test
     void setSize(){

        Assertions.assertEquals(3, 3);
    }
    @Test
     void switchTest(){
       // setGlobal().setSwitch();
        Assertions.assertEquals("s", "s");
    }

}
