/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Para evitar que inicialize com lixo de memória, atribuo 0 a mesma.
        float randomNumber = 0;
        
        System.out.print("Digite um número qualquer: ");
        randomNumber = sc.nextFloat();
        
        if(randomNumber % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }
        
    }
    
}
