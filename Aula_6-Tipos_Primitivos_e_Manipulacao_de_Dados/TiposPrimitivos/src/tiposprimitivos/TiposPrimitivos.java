/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Souza
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1 = 8.5f;
        float nota2 = (float)9.6;
        
        System.out.print("A nota é " + nota1);
        System.out.println("A nota é " + nota2);
        
        System.out.printf("A nota é %f \n", nota1);
        System.out.printf("A nota é %.2f \n", nota1);
        System.out.printf("A nota é %.4f \n", nota1);
        
        String nome = "Gustavo";
        System.out.printf("A nota de %s é %.4f \n", nome, nota1);
        
        float nota3 = 2.5f;
        System.out.format("A nota de %s é %.1f \n", nome, nota3);
        
        Scanner teclado0 = new Scanner(System.in);
        String nome0 = teclado0.nextLine();
        float nota0 = teclado0.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome0, nota0);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota4 = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome2, nota4);
        
        
        
    }
    
}
