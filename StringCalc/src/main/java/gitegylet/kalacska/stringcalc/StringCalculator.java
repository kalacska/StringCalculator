/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitegylet.kalacska.stringcalc;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Patrik
 */
public class StringCalculator {
    
    private int osszeg;
    private String[] tomb;
    private int m;
    private final String DEFAULT_ELVALASZTO=",";

    int add(String numbers, String elvalaszto) {
        

    if (numbers.equals("")) {
            osszeg = 0;
    }
        else{
            
               //tomb = numbers.split("\\W");
               //tomb = numbers.split("(,)|(\\|)|(\\;)|(\\/)|(\\.)");
               tomb = numbers.split(elvalaszto);
            
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
    
    int add(String numbers){
       return this.add(numbers, DEFAULT_ELVALASZTO);
    }

    private void vizsgal() {
        
        //int[] negativok=new int[m];
        List<Integer> negativok=new ArrayList<>();
        
        try {
            for (int i = 0; i < m+1; i++) {
                if (Integer.parseInt(tomb[i])<0) {
                    negativok.add(Integer.parseInt(tomb[i]));
                }
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Negatives not allowed: ");
            for (int negativ : negativok) {
                System.out.print(negativ+", ");
            }
            System.out.println("");
        }
    }
    
}
