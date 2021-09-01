/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        float n1, n2;
        
        System.out.print("Digite um número: ");
        n1 = sc.nextFloat();
        
        System.out.print("Digite outro número: ");
        n2 = sc.nextFloat();
        
        if(n1 > n2) {
            System.out.printf("O maior número é: %.2f%n", n1);
        }
        else {
            System.out.printf("O maior número é: %.2f%n", n2);
        }
        
        
    }
    
}
