/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Unknown User
 */

import java.util.Locale;
import java.util.Scanner;

public class nono_algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char opcao;
        
        System.out.print("Digite uma das opções para converter uma das unidades de temperatura(C/F): ");
        opcao =  sc.next().charAt(0);
        
        if(opcao == 'C' || opcao == 'c') {
            
            float celsius = 0;
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = sc.nextFloat();
            float result1 = (celsius * (9/5)) + 32;
            System.out.printf("Temperatura convertida para Fahrenheit: %.2f °F%n", result1);
            
        }
        else if(opcao == 'F' || opcao == 'f') {
            
            float fahrenheit = 0;
            System.out.print("Digite a temperatura em Fahrenheit: ");
            fahrenheit = sc.nextFloat();
            float result2 = (fahrenheit - 32) * 5/9;
            System.out.printf("Temperatura convertida para Celsius: %.2f °C%n", result2);
            
        }
        else {
            System.out.println("Favor escolher uma das opções citadas anteriormente!");
        }
        
    }
    
}
