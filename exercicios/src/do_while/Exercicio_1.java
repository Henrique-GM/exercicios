/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_1 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char resp;
        
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            
            double F = 9.0 * C / 5.0 + 32.0;
            
            System.out.printf("Equivalente em Fahrenheit: %.1f\n: ", F);
            
            System.out.print("Deseja repitir (s/n)? ");
            resp = sc.next().charAt(0);
            
        } while (resp != 'n');
        
        sc.close();
    }
}
