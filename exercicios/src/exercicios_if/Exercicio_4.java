/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_if;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio_4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int inicioJogo;
        int fimJogo;
        
        int duracao;
      
        System.out.println("Que horas entrou na partida: ");
        inicioJogo = sc.nextInt();
        System.out.println("Que horas saiu da partida: ");
        fimJogo = sc.nextInt();
      
        if (inicioJogo < fimJogo){
            duracao = fimJogo - inicioJogo;
            
            System.out.println(duracao);
        }
        
        else{
            duracao = 24 - inicioJogo + fimJogo;
            
            System.out.println(duracao);
        }
    }
}
