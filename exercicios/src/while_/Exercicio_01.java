/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        
       while(x != 0) {
            soma = soma + x;

        x = sc.nextInt();
        }
       
        System.out.println(soma);
        
        sc.close();
    }
}
