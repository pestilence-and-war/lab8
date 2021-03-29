/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Master
 */
public class Insurance2Test {
    
    public Insurance2Test() {
    }

    @Test
    public void testQuote() throws Exception {
        System.out.println("quote");
        int age = 50;
        double expResult = 550;
        double result = Insurance2.quote(age);
        assertEquals(expResult, result, 0.0);
       
    }
    
     @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Insurance2.quote(2);
        });
    }

    
    
}
