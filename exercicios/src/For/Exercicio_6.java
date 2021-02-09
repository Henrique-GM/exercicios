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
public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //fatorial precisa receber 1
        int fatorial = 1;

        System.out.print("Digite um número: ");
        int N = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
