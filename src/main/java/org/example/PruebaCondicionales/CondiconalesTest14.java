package org.example.PruebaCondicionales;

import javax.swing.*;

public class CondiconalesTest14 {

    /*
    * Ejercico 14: Hacer un programa que pase de KG a otra unidad de medida de masa,
    * mostrar en pantalla un menu con las opciones posibles;
    * */

    public static void main(String[] args){
        int t,g,opcion;
        double mg,ug;
        int kg = 1000;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite a la unidad que desea convertir de KG a una de las siguientes opciones\n"
            + "1. Tonelada\n"
            + "2. gramo\n"
            + "3. miligramos\n"
            + "4. microgramo"));

        switch (opcion){
            case 1: t = kg * 1000;
                JOptionPane.showMessageDialog(null, "La conversion es igual a " + t);
                break;
            case 2: g = kg - 999;
                JOptionPane.showMessageDialog(null, "La conversion es igual a " + g);
                break;
            case 3: mg = kg - 1000.001;
                JOptionPane.showMessageDialog(null, "La conversion es igual a " + mg);
                break;


        }



    }

}
