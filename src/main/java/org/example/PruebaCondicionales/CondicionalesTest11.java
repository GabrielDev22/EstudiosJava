package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest11 {

    public static void main(String[]args){
        int numero1,numero2,suma,resta,mult,div;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar:").charAt(0);

        switch (operacion){
            case 's':
            case 'S': suma = numero1 + numero2;
                      JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                        break;
            case 'r':
            case 'R': resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;

            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + mult);
                break;

            case 'd':
            case 'D': div = numero1/numero2;
                JOptionPane.showMessageDialog(null, "La division es: " + div);
                break;

            default:JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion");

        }



    }

}
