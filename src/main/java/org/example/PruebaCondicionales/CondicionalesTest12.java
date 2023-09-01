package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest12 {

    /*
    * Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma insuficiente, Suficiente
    * Bien, Notable y Sobresaliente
    *
    *  */

    public static void main(String[]args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una nota del 0 al 10:"));

        if(nota == 0 || nota == 1 || nota == 2 || nota == 3){
            JOptionPane.showMessageDialog(null, "La nota que usted tiene es Insuficiente,");
        }else if (nota == 4 || nota == 5){
            JOptionPane.showMessageDialog(null, "La nota que usted tiene es suficiente");
        }else if(nota == 6 || nota == 7){
            JOptionPane.showMessageDialog(null, "La nota que usted tiene es BIEN");
        }else if(nota == 8 || nota == 9){
            JOptionPane.showMessageDialog(null, "La nota que usted tiene es NOTABLE");
        }else if(nota == 10){
            JOptionPane.showMessageDialog(null, "La nota que usted tiene es SOBRESALIENTE");
        }else{
            JOptionPane.showMessageDialog(null, "La nota que usted ha digitado sobre pasa lo solicitado");
        }

        System.out.println(nota);

    }

}
