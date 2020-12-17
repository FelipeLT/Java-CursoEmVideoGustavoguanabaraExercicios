/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author User
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        //r = (x<y && y<z)? true:false; // no operador "E=&&" será verdadeiro se as operações forem vereadeiras Paula && Quesia... neste caso é true.
        //r = (x<y && y==z)? true:false; // no operador "E=&&" será verdadeiro se as operações forem vereadeiras Paula && Quesia... neste caso é false.
        //r = (x<y || y==z)? true:false; // no operador "OU=||" será verdadeiro se uma ou outra operação forem vereadeiras Paula || Quesia... neste caso é true.
        //r = (x<y ^ y==z)? true:false; // no operador "OU exclusivo XOU =^" será verdadeiro se uma ou exclusivamente outra operação forem vereadeiras Paula ^ Quesia... neste caso é true.
        r = (x<y ^ y<z)? true:false; // no operador "OU exclusivo XOU =^" será verdadeiro se uma ou exclusivamente outra operação forem vereadeiras Paula ^ Quesia... neste caso é false pq ambas são verdadeiras.
        System.out.println(r);
    }
    
}
