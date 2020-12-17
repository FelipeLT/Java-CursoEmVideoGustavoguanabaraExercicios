/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15metodos;

/**
 *
 * @author User
 */
public class Aula15Metodos {

    /**
     * @param args the command line arguments
     */
    
    //Parte 1 - criando o metodo soma//
    /*static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }*/
    // Parte 2 - outra forma de escrever o metodo //
    static int  soma (int a, int b) {
        int s = a + b;
        return s; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Parte 1 - criando o metodo soma//
        /*System.out.println("Inicio do programa");
        soma (5,2);*/
        
        // Parte 2 - outra forma de escrever o metodo //
        System.out.println("Inicio do programa");
        int sm = soma (5,2);
        System.out.println("A soma é: " + sm);
        
        // Parte 2 - Usando outras classes no mesmo projeto //
        System.out.println("Inicio da contagem");
        System.out.println(Operacoes.contador (1,5));
    }
    
}
