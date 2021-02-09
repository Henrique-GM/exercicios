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
public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int fim = 0;

        int resposta = 0;

        while (resposta != 4) {
            System.out.println("Digite qual o combustível: ");
            resposta = sc.nextInt();

            if (resposta == 1) {
                alcool += 1;
            }

            if (resposta == 2) {
                gasolina += 1;
            }

            if (resposta == 3) {
                diesel += 1;
            }
        }

        System.out.printf("Alcool: %d "
                         + "Gasolina: %d "
                         + "Diesel: %d ", alcool, gasolina, diesel);

        sc.close();
    }
}
