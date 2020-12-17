/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10estruturascondicionaisprogramapernas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aula10EstruturasCondicionaisProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas Pernas?");
        int perna = tec.nextInt ();
        String tipo;
        System.out.print("Isto é um:  ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
