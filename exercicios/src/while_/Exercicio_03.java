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
public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            }

            if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            }

            if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            }

            if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
