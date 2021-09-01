/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class quinto_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Para evitar que inicialize com lixo de memória, atribuo 0 a mesma.
        float n1, n2 = 0;
        
        System.out.print("Digite um número: ");
        n1 = sc.nextFloat();
        
        System.out.print("Digite outro número: ");
        n2 = sc.nextFloat();
        
        System.out.println("");
        
        System.out.printf("SOMA dos números digitado: %.2f%n", n1 + n2);
        System.out.printf("DIFERENÇA dos números digitado: %.2f%n", n1 - n2);
        System.out.printf("PRODUTO dos números digitado: %.2f%n", n1 * n2);
        System.out.printf("QUOCIENTE dos números digitado: %.2f%n", n1 / n2);
        
        
    }
    
}
