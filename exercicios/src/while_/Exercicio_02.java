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
public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 2002) {
            System.out.println("Incira à senha: ");
            senha = sc.nextInt();

            if (senha != 2002) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Senha correta");
            }

            System.out.println("\n");
        }

        sc.close();
    }
}
