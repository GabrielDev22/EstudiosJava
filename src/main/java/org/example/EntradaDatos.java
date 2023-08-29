package org.example;

import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[]args){
        //Entrada y salida de datos por consola

        // Guardar numeros en una variable por la consola
        Scanner entrada = new Scanner(System.in);
        float user;

        System.out.println("Digite un numeo");
        user = entrada.nextFloat();

        System.out.println("El numero es" + user);

        // Como guardar cadenas por la consola
        Scanner entrada2 = new Scanner(System.in);
        String cadena;
        char letra;

        System.out.println("Digite una letra:");
        letra = entrada2.next().charAt(0);

        System.out.println("La cadena es " + letra);
    }

}
