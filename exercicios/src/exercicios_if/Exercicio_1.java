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
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero > 0){
            System.out.println("É positivo");
        }
        
        else if (numero < 0){
            System.out.println("É negativo");
        }
        
        else{
            System.out.println("É um número nulo");
        }
    }
    
}
