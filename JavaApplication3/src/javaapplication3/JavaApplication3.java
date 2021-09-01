/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        double base, altura, A;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor da base: ");
        base = sc.nextFloat();
        
        System.out.print("Digite o valor da altura: ");
        altura = sc.nextFloat();
        
        A = base * altura;
        
        System.out.printf("Área do retângulo: %.2f%n", A);
        
    }
    
}
