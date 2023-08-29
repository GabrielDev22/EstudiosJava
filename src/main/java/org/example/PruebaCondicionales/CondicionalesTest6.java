package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest6 {

    /*
    * Ejercicio 6: Hacer un programa que tome dos numeros y diga si ambos son pares o impares
    *
    * */

    public static void main(String[] args){
        int numero1,numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero"));

        if(esPar(numero1) && esPar(numero2)){
            JOptionPane.showMessageDialog(null, "Estos numeros son pares");
        }else if(!esPar(numero1) && !esPar(numero2)){
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares.");
        }else{
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro es impar");
        }
    }

    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }


}
