package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest4 {

    /*
    * Ejercicio 4: Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros
    * se han introducido
    *  */

    public static void main(String[]args){

        int numero, contador = 0;

        while (true){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(numero < 0){
                break;
            }

            contador++;

            if(contador == 1){
                System.out.println("Has introduccido 1 numero");
            }else{
                System.out.println("Has introduccido " + contador + " numeros.");
            }


        }

    }

}
