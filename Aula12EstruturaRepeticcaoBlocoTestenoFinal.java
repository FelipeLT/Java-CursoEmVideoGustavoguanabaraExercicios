/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12estruturarepeticcaoblocotestenofinal;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aula12EstruturaRepeticcaoBlocoTestenoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int cc = 0;
        do {
            System.out.println(cc);
            cc++;
        } while (cc<4);
    }*/
        // Outra forma de aplicar a estrutura// 
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner (System.in);
        do {
            System.out.print("Digite o número:  ");
            n = teclado.nextInt ();
            s += n; // ou s = s + n//
            System.out.print("Quer Continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
        }
}
