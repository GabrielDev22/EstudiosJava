package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest6 {

    /*
    * Ejercio 8; Pedir un numero N, y mostrar todos los numeros del 1 al N.
    * */

    public static void main(String[]args){

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            System.out.println(numero);
        }while (numero > 0);

    }

}
