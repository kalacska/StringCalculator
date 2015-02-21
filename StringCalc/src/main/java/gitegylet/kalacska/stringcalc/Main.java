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
public class Main {
    public static void main(String[] args) throws IOException{
        String numbers="5|15|40";
        StringCalculator kalkulator=new StringCalculator();
        kalkulator.add(numbers);
    }
}
