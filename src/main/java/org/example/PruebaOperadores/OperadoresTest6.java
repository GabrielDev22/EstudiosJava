package org.example.PruebaOperadores;

import java.util.Scanner;

public class OperadoresTest6 {


    /*
    * Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma;
    * (a+b)2 = a2 + b2+ 2ab;
    * */

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double a,b, sumaCuadrado, resultaFinal;

        System.out.println("Ingrese los valores de A y B");

        a = entrada.nextFloat();
        b = entrada.nextFloat();

        sumaCuadrado = Math.pow(a, b);
        System.out.println(sumaCuadrado);

        resultaFinal = sumaCuadrado + a*2 + b*2 + 2;

        System.out.println(resultaFinal);



    }


}
