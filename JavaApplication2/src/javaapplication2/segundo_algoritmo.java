/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class segundo_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        float randomNumber;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        randomNumber = sc.nextFloat();
        
        float resultMultiplier2 = randomNumber * 2;
        
        System.out.println();
        
        System.out.printf("Número dobrado: %.2f%n", resultMultiplier2);
        
    }
    
}
