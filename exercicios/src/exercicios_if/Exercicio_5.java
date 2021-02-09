/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_if;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_5 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        int minGastos;
        double plano = 50.00;
        
        System.out.println("Quantos minutos de telefone você gastou? ");
        minGastos = sc.nextInt();
        
        if (minGastos < 100){
            System.out.println("Valor a pagas: " + plano);
        }
        
        else{
            plano += (minGastos - 100) * 2.0;
            
            System.out.printf("Valor a pagar com acrecimo: %.2f\n " ,plano);
        }
        
        sc.close();
        
    }
    
}
