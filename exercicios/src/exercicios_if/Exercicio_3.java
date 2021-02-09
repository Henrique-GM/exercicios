
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_if;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_3 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Digite um número: ");
        numero1 = sc.nextInt();
        System.out.println("Digite outo número: ");
        numero2 = sc.nextInt();
        
        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("É multiplo");
        }
        
        else{
            System.out.println("Não é multiplo");
        }
    } 
}
