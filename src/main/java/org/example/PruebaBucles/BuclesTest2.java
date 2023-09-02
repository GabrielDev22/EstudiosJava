package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest2 {


    /*
    * Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que
    * se introduzca un 0
    * */
    public static void main(String[]args){

        int numero;

        do{

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero depositado es positivo");
            }else if(numero < 0){
                JOptionPane.showMessageDialog(null, "El numero depositado es negativo");
            }else{
                JOptionPane.showMessageDialog(null, "El numero depositado es 0 el programa se detendra");
            }


        }while(numero != 0);

    }

}
