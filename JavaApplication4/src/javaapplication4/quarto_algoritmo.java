/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class quarto_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Para evitar que inicialize com lixo de memória, atribuo 0 a mesma.
        float n = 0;
        
        System.out.print("Digite um número qualquer: ");
        n = sc.nextFloat();
        
        System.out.printf("Antecessor do número digitado: %.2f%n", n-1);
        System.out.printf("Sucessor do número digitado: %.2f%n", n+1);
    }
    
}
