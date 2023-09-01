package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest2 {


    /*
    * Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que
    * se introduzca un 0
    * */
    public static void main(String[]args){

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero < 1 || numero > -1){
            JOptionPane.showMessageDialog(null, "El numero que ha ingresado es positivo");
        }

    }

}
