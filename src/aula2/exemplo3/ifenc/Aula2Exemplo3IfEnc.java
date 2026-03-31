/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.exemplo3.ifenc;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula2Exemplo3IfEnc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

        if ((numero % 10) == 0) {
            JOptionPane.showMessageDialog(null, "É múltiplo de 10!");
        } else {
            if ((numero % 2) == 0) {
                JOptionPane.showMessageDialog(null, "É múltiplo de 2!");
            } else {
                if ((numero % 5) == 0) {
                    JOptionPane.showMessageDialog(null, "É múltiplo de 5!");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é múltiplo destes!");
                }
            }
        }
    }
}