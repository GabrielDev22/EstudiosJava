package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondionalesTest2 {

    /*
    * Ejercicio 2: Pedir dos numeros y decir cual es el mayor o si son iguales
    * */

    public static void main(String[] args){
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero"));

        if(numero1 == numero2){
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }else if (numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + "es el mayor");
        }else if (numero2 > numero1){
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + "es el mayor");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro ninguna coincidencia");
        }
    }

}
