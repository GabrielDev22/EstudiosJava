package org.example;

import java.util.Scanner;

public class BuclesWhile {

    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);
        int i=1, contador;

        System.out.println("Digite cuantos numeros queires en pantalla: ");
        contador = entrada.nextInt();

        while(i<=contador){
            System.out.println(i);
            i += 2;
        }

    }

}
