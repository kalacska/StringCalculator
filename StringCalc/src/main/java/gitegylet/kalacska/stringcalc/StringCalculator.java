/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitegylet.kalacska.stringcalc;

import java.io.IOException;

/**
 *
 * @author Patrik
 */
public class StringCalculator {
    
    private int osszeg;
    private String[] tomb;

    int add(String numbers) throws IOException {
        

    if (numbers.equals("")) {
            osszeg = 0;
    }
        else{
            for (int i = 0; i < numbers.length(); i++) {
            tomb = numbers.split("\\W");
        }
            
            int n=tomb.length;
            int [] szamok=new int[n];
            
            for (int i = 0; i < tomb.length; i++) {
                szamok[i]=Integer.parseInt(tomb[i]);
                osszeg=osszeg+szamok[i]; 
            }
        }
        
        
        System.out.println("A számok összege: "+Integer.toString(osszeg));
        return osszeg;
    }
    
}
