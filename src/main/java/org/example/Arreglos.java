package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args){

        //int[] numeros = new int[3];
        int [] numeros = {5,7,9,10};

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for(int i=0; i<4; i++){
            System.out.println(numeros[i]);
        }

        // Segunda seccion de las clases
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        char[] letras = new char[nElementos];

        System.out.println("Digite los elemenos del arreglo: ");

        for(int i = 0; i<nElementos; i++){
            System.out.println((i+1)+"Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del areglos son: ");
        for (int i = 0; i<nElementos;i++){
            System.out.println(letras[i] + " ");
        }



    }

}
