/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class decimo_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();
        
        delta = b * b - 4 * a * c;
        
        if(a == 0 || delta < 0) {
            System.out.println("Não possui raízes reais.");
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1: %.2f%n", x1);
            System.out.printf("X2: %.2f%n", x2);
        }
    }
    
}
