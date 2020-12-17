/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9programaidade;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aula9ProgramaIdade {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que ano vc nasceu?  ");
        int nasc = teclado.nextInt();
        int idade = 2015-nasc;
        System.out.println("Sua idade é:" + idade);
        if (idade>=18) {System.out.println("Maior de Idade");
    } else {System.out.println("Menor de idade");}} 
}
    
