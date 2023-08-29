package org.example.PruebaOperadores;

import java.util.Scanner;

public class OperadoresTest2 {


    // Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus
    // horas semanales trabajadas y de su salario por hora

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa cuantas horas trabaja a la semana:");

        float horas, dinero,salarioSemanal;
        horas = entrada.nextFloat();

        System.out.println("Ingresa cuanto dinero gana por hora");
        dinero = entrada.nextFloat();

        salarioSemanal = horas * dinero;
        System.out.println(salarioSemanal);




    }

}
