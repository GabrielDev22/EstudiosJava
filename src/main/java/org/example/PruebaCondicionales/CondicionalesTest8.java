package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest8 {

    /*
    * Ejercicio 8: Pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene.
    *
    * */

    public static void main(String[] args){
        int numero1;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 0 al 99.999"));

        if(numero1 <= 9){
            JOptionPane.showMessageDialog(null, numero1 + "Tiene una cifra");
        }else if(numero1 <= 99){
            JOptionPane.showMessageDialog(null, numero1 + "Tiene dos cifras");
        }else if(numero1 <= 999){
            JOptionPane.showMessageDialog(null, numero1 + "Tiene tres cifras");
        }else if(numero1 <= 9999){
            JOptionPane.showMessageDialog(null, numero1 + "Tiene cuatro cifras");
        }else if(numero1 <= 99999){
            JOptionPane.showMessageDialog(null, numero1 + "Tiene 5 cifras");
        }else {
            JOptionPane.showMessageDialog(null, numero1 + "Tiene 6 o mas cifras");
        }

    }

}
