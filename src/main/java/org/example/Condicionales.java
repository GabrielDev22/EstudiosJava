package org.example;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args){

        int numero, dato = 5;

        /*
        *  == : igualdad
        * != Diferncia
        * > : Mayor
        * >= : Mayor o igual que
        * < : Menor
        * <= : Menor o igual
        * */

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(numero <= dato){
            JOptionPane.showMessageDialog(null, "El numero es 5 o menor");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es mayor a 5");
        }

    }

}
