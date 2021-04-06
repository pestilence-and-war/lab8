/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Master
 */
public class Insurance2 {
   
    public static double quote(int age) throws InvalidAgeException{
        if (age<5 || age>110){
            throw new InvalidAgeException("Sorry, but your age prevents "+
                    "us from offering you coverage");
        }
        int policyQuote = (age*5)+300;
        return policyQuote;
    }
    
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = keyboard.nextInt();
    
    double policy;
        try {
            policy = quote(age);
            //System.out.println("your policy will cost $ "+policy+".");
        } catch (InvalidAgeException ex) {
            Logger.getLogger(Insurance2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

    

