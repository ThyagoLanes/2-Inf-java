/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula4 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
 
        int a = 0, b = 0;
        System.out.println("Informe o valor de a:");
        a = entrada.nextInt();
        System.out.println("Informe o valor de b:");
        b= entrada.nextInt();
        System.out.println("Informe o código, 3 , 4 ou 5 ");
        int codigo = entrada.nextInt();
       
        switch (codigo){
            case 3:                      
               System.out.println((a+b)+(20*(a+b))/100);
               break;
               
               case 4:    
                   
               System.err.println((b-a)+(20*(a+b))/100);
               break;
               
               case 5:    
                   
               System.err.println((a+a)+(20*(a+b))/100);
               break;
                                                               
               default:
                   System.out.println("Código Inexistente");                  
       
        }
    
    }
    
} 