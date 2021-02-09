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
public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
