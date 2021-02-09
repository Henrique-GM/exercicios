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
public class Exercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < numero; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        sc.close();
    }
}
