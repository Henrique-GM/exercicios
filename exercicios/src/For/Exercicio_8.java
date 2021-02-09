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
public class Exercicio_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= N; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d\n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}
