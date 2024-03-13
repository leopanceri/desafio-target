/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.desafiotarget;

/**
 *
 * @author Leo
 */
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =0;
        int b =1;
        int fibo = b;
        int numero;
        
        System.out.println("Digite um número para teste");
        numero = scn.nextInt();
        while(fibo < numero){
            fibo = a+b;
            a=b;
            b=fibo;
        }
        if(fibo == numero)
            System.out.println("O número pertencece a Fibonacci");
        else
            System.out.println("O número NÃO pertencece a Fibonacci");
    }
}
