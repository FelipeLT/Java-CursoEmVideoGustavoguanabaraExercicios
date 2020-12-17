/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14vetor;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Aula14Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Praticando 1//
        /*int n [] = {3,2,8,7,5,4};
        System.out.println("O total de casas de N " + n.length);
        for ( int c=0; c<=5; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);*/
            // OU // 
           /* int n [] = {3,2,8,7,5,4};
            for ( int c=0; c<=n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }*/
           
        // Praticando 2//
        /*String mes [] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c=0; c<mes.length; c++) {
            System.out.println("O Mês de " +  mes [c]  + " tem "  + tot[c]  +  " dias ao todo.");
        }*/
        
        // Usando o For Int = "para cada" //
        /*double v[] = {3.5, 2.75, 9, -4.5};
        for ( double valor: v ) {
            System.out.print(valor + " ");
        }*/
        
        // Praticando 3 //
        /* double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for ( double valor: v ) {
            System.out.print(valor + " ");
        }*/
        
        // Praticando 4 // 
        /*int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v:vet) { 
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1); // ou no lugar do "1" use outros numeros p/ ver o resultado//
        System.out.println("Encontrei o valor na posição " + p); */
        
        // Praticando 5 // 
        int v[] = new int [20];
        Arrays.fill(v, 0);
        for (int valor: v) {
            System.out.print(valor + " ");
        }
    }
    
}
