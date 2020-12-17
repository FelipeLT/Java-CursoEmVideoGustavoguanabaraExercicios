/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11estruturarepeticaoinicioblococontador;

/**
 *
 * @author User
 */
public class Aula11EstruturaRepeticaoInicioBlocoContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*int cc = 0;
        while (cc<4) {
            System.out.println("cambalhota");
            cc++;
        }*/
        // incluindo numeração na cambalhota //
       /*int cc = 0;
        while (cc < 4) {
            System.out.println("cambalhota " + (cc + 1));
            cc++;
        }*/
        // ou // 
       /* int cc = 1;
        while (cc<=4) {
            System.out.println("cambalhota" + cc);
            cc++;
        } */
       // looping incluindo condições// 
       /*int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 5 || cc == 7 || cc == 9) {
                continue;
            }
            System.out.println("cambalhota" + cc);
        }*/
       // looping incluindo condições + break // 
       int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
                   }
                   if (cc == 7) { break; }
            System.out.println("cambalhota" + cc);
        }
    }
    
}
