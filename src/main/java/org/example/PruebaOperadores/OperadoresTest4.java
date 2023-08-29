package org.example.PruebaOperadores;

import java.util.Scanner;

public class OperadoresTest4 {

    /*
    * Ejercicio 4:; Una compañia de venta de carros usados, paga a su personal de ventas salarios
    * de $1000 mensuales, mas de una comision de $150 por cada carro vendido, mas el 5% del valor de la
    * venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes
    * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
    * */

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float salario,comisiones,venta,salarioVendedor;

        System.out.println("Cuanto es el valor de la venta de un automovil:");

        salario = 1000;
        comisiones = 150;

        venta = entrada.nextFloat();
        venta = venta * 5 / 100;

        salarioVendedor = salario + comisiones + venta;

        System.out.println("\nEl salario total de un vendedor es de:" + salarioVendedor);

    }

}
