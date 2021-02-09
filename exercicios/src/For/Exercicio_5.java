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
public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Digite o número: ");
            double numero = sc.nextDouble();
            System.out.println("Digite o divisor");
            double divisor = sc.nextDouble();

            double resultado = numero / divisor;

            if (divisor == 0) {
                System.out.println("Divisão impossível");

            } else {
                System.out.printf("%.2f\n", resultado);
            }
        }

        sc.close();
    }
}
