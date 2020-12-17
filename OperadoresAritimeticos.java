/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author User
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Operadores Aritiméticos // (+ - * / %)
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a: " + m);*/
        
        // Operadores unitários //
        /* 
        ++numero = 1+numero antes da operação.
        --numero = 1-numero antes da operação.         
        numero++ = numeri+1 depois da operação 
        numero-- = numeri-1 depois da operação */
        //Exemplo 1
        /////
        /* 
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(numero); // Exibe o numero acrecido de 1 5+1=6
        System.out.println(valor); // Exibe o resultado 5+5=10 (+1 depois)*/
        /////
        /*
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(numero); // Exibe o numero acrecido de 1 5+1=6
        System.out.println(valor); // Exibe o resultado 5+6=11 */
        ///// 
        /*
        int numero = 5;
        int valor = 5 + numero--;
        System.out.println(numero); // Exibe o numero decrescido de 1 5-1=4
        System.out.println(valor); // Exibe o resultado 5+5=10 (-1 depois)*/
        /////
        /*
        int numero = 5;
        int valor = 5 + --numero;
        System.out.println(numero); // Exibe o numero decrescido de 1 5-1=4
        System.out.println(valor); // Exibe o resultado 5+4=9  */
        
        // Operadores de Atribuição//
        // x += 2; // x = 4 + 2 = 6
        // x *= 2; // x = 4 * 2 = 8
        // x -= 2; // x = 4 - 2 = 2
        // x /= 2; // x = 4 / 2 = 2
        // x %= 2; resto a atribuir
        //Exemplo
        /*
        int x = 4;
        x += 2;
        System.out.println(x);*/
        
        // Class Math // 
        // ver anotações curso...
        // Exemplo de Raiz quadrada, Cubo, exponencial...
        /*
        int x = 25;
        float res = (float) Math.sqrt(x); // raiz quadrada 25 = 5
        System.out.println(res);*/
        /*
        int x = 27;
        float res = (float) Math.cbrt(x); // raiz cubica de 27 = 3
        System.out.println(res);*/ // res = abreviado de resultado.
        /*
        int a = 5;
        int b = 2;
        float res = (float) Math.pow(a,b); // "a" elevando na potencia "b"
        System.out.println(res);*/
        
        // Arredondamento//
        /* 
        float a = 8.8f;
        int resultado = (int) Math.round(a);  // arredondamento aritimetico math.round
        System.out.println(resultado);*/
        
        // Gerador de numero randomico/aleatório //
        /*
        double aleatorio = Math.random();
        System.out.println(aleatorio); // vai gerar numeros aleatórios entre 0 e 1.*/
        // Exemplo = Número aleatório entre 5 e 10
        double aleatorio = Math.random();
        int num = (int) (5 + aleatorio * (10 - 5));
        System.out.println(num);
    }
    
}
