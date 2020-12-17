/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author User
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Operadores Ternarios //
        /*
        int n1, n2, r, r1;
        n1 = 14;
        n2 = 18;
        r = (n1>n2)? n1:n2; // se n1 for maior que n2 ao executar vai mostrar o resultado maior. 
         System.out.println(r);
        r1 = (n1>n2)? n1+n2:n1-n2; // tbm aceita formulas na expressão se n1 for maior que n2 ao executar vai mostrar o resultado maior. 
         System.out.println(r1);*/       
         
         // Comaparação //
         String nome1 = "Felipe";
         String nome2 = "Felipe";
         String nome3 = new String ("Felipe");
         String res;
         String res1;
         res = (nome1==nome2)?"igual":"diferente";
         System.out.println(res); // se nome1 for igual nome2 vai aparecer igual ou diferente
         
         // para objetos vamos usar uma estrutura diferente... ver abaixo
         res1 = (nome1==nome3)?"igual":"diferente"; // a resposta aqui vai dar "diferente" pq nome3 é um objeto embora o conteudo seja igula mas a estrutura é diferente. 
         System.out.println(res1);
         // para uma comparação de conteúdo temos que seguir outro caminho...
         res = (nome1.equals(nome3))?"igual":"diferente";
         System.out.println(res);        
    }
    
}
