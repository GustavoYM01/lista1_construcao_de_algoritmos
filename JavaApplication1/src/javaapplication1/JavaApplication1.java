/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Unknown User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 20;
        int n2 = 30;
        int aux = 0;
        
        // Antes da troca de valores
        System.out.println(n1);
        System.out.println(n2);
        
        // Processo de troca de valores
        aux = n1;
        n1 = n2;
        n2 = aux;
        
        System.out.println();
        
        // Resultado final
        System.out.println(n1);
        System.out.println(n2);
        
    }
    
}
