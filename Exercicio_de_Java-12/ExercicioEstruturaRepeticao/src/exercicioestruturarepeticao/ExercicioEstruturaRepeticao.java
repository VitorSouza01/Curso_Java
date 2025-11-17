/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioestruturarepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Souza
 */
public class ExercicioEstruturaRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0;
        int p = 0;
        int i = 0;
        int c = 0;
        int m = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)<em></html>"));
        // JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
            s += n;
            
            if (n != 0){
                
                m += 1;
                
                if (n % 2 == 0){
                    p += 1;
                }
                
                if (n % 2 == 1){
                    i += 1;
                }
                
                if (n > 100){
                    c += 1;
                }
            }
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>" + 
                "<br>Total de Valores: " + s + 
                "<br>Total de Pares: " + p +
                "<br>Total de Ímpares: " + i +
                "<br>Acima de 100: " + c +
                "<br>Média dos valores: " + (s/m) +
                "</html>");
    }
    
}
