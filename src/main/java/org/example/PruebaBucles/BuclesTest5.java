package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest5 {

    public static void main(String[]args){

        int numero,elementos = 0,suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while(numero >= 0){

            suma += numero; // Suma iterativa
            elementos++; // Aumentamos uno a elementos

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }

        if(elementos == 0){
            System.out.println("Error! La division entre 0 no existe");
        }else{
            media = (float) suma/elementos;
            System.out.println("La media o el promedio es " + media);
        }

    }

}
