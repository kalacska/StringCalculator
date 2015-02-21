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
    private int m;

    int add(String numbers) throws IOException {
        

    if (numbers.equals("")) {
            osszeg = 0;
    }
        else{
            for (int i = 0; i < numbers.length(); i++) {
               //tomb = numbers.split("\\W");
               tomb = numbers.split("(,)|(\\|)|(\\;)|(\\/)|(\\.)");
        }
            
            int n=tomb.length;
            int [] szamok=new int[n];
            
            for (int i = 0; i < tomb.length; i++) {
                szamok[i]=Integer.parseInt(tomb[i]);
                if (szamok[i]<0) {
                    m=m+1;
                }
                else{
                    osszeg=osszeg+szamok[i]; 
                }
            }
        }
    
        
        if (m>0) {
            vizsgal();
            System.out.println("");
        }
        else{
            System.out.println("A számok összege: "+Integer.toString(osszeg));
            return osszeg;
        }
        
        return 0;
    }

    private void vizsgal() {
        
        int[] negativok=new int[m];
        
        try {
            for (int i = 0; i < m; i++) {
                if (Integer.parseInt(tomb[i])<0) {
                    negativok[i]=Integer.parseInt(tomb[i]);
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Negatives not allowed: ");
            for (int i = 0; i < m; i++) {
                System.out.print(Integer.toString(negativok[i])+", ");
            }
            System.out.println("");
        }
    }
    
}
