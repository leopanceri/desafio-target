/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.desafiotarget;


/**
 *
 * @author Leo
 */
public class Exercicio5 {
    public static void main(String[] args) {
        String meustring ="teste Target"; 
        String stringreverso = "";
        
        System.out.println("Meu string: " + meustring);
        //meustring = scn.next(meustring);
        for(int i = meustring.length()-1; i>=0; i--){
            stringreverso = stringreverso + meustring.charAt(i);
        }
        
        System.out.println("String invertido: " + stringreverso);
     
    }
}
