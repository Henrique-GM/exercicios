/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Bitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int mask = 0b100000;
        int n = sc.nextInt();
        
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }
        
        sc.close();
    }
}
