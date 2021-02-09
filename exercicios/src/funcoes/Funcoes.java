/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Funcoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dois números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        mostreResultado(maior);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        
        int aux;

        if (x > y && x > z) {
            aux = x;
            
        } else if (y > z) {
            aux = y;
            
        } else {
            aux = z;
        }
        
        return aux;
    }   
    
    public static void mostreResultado(int valor) {
        System.out.println("Maior = " + valor);
    }
}
