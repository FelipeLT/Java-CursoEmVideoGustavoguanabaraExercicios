/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12estruturarepeticaoexercicio;

import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class Aula12EstruturaRepeticaoExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Praticar 1//
        /* JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE); */
        // Praticar 2//
        /* int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Número: "));
        JOptionPane.showInputDialog(null, "Você digitou o valor  " + n); */
        // Praticar 3//
        /* int n;
        do { n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um Número: <br><em>(valor 0 interrompe) </em></html>"));
                } while (n != 0); */
        // Praticar 4//
        /* int n, s = 0;
        do { n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um Número: <br><em>(valor 0 interrompe) </em></html>"));
                s += n;
                } while (n != 0);
                JOptionPane.showInputDialog(null,"<html>Resultado Final<hr>" + "<br>Somatório Vale  " + s + "</html>");*/
        // Praticar 5//
        // Resultado = Total de Valores + Total de Pares + Total Impar + Acima de 100 + Media dos valores // 
         int media, num, soma = 0;
         int totVal = 0;
         int nPar = 0;
         int nImpar = 0;
         int maiorqCem = 0;
         do { num = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um Número: <br><em>(valor 0 interrompe) </em></html>"));
                soma += num;
                if (num % 2 == 0) { nPar++; }
                else { nImpar++; }
                if (num > 100) { maiorqCem++; }
                if (num != 0) { totVal++; }                
                } 
         while (num != 0);
         media = soma / totVal;
                JOptionPane.showInputDialog(null,"<html>------------"
                        + "<br>Resultado Final<br>--------------" 
                        + "<br>Total dos Valores: " + totVal + "<br>"
                        + "Total Pares: " + nPar + "<br>" 
                        + "Total Impar: " + nImpar + "<br>" 
                        + "Total > 100: " + maiorqCem + "<br>" 
                        + "Média dos Valores: " + media + "<br>" 
                        + "-------------</html>");
    }
}
