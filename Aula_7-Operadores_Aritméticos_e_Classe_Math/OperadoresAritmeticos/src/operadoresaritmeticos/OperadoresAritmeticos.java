/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Souza
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);*/
        
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor);
        System.out.println(numero);
        
        int numero2 = 10;
        int valor2 = 4 + numero2--;
        System.out.println(valor2);
        System.out.println(numero2);
        
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
        
        int x2 = 4;
        x2 *= 2; // x = x + 2
        System.out.println(x2);
        
        float v = 8.3f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        
        float v2 = 8.3f;
        int ar2 = (int) Math.ceil(v2);
        System.out.println(ar2);
        
        float v3 = 8.4f;
        int ar3 = (int) Math.round(v3);
        System.out.println(ar3);
        
        double ale = Math.random();
        int n4 = (int)(5 + ale * (10-5));
        System.out.println(ale);
        System.out.println(n4);
        
        double ale2 = Math.random();
        int n5 = (int) (15 + ale2 * (50-15));
        System.out.println(n5);
    }
    
}
