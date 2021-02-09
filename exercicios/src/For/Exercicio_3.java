/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int IN = 0;
        int OUT = 0;

        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
           
            if (i > 10 && i < 20) {
                IN += 1;
                
            } else {
                OUT += 1;
            }
        }
        System.out.println("IN " + IN);
        System.out.println("OUT " + OUT);
        
        sc.close();
    }
}
