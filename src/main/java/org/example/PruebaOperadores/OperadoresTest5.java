package org.example.PruebaOperadores;

import java.util.Scanner;

public class OperadoresTest5 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examaneFinal, notaFinal;


        // Pedir los datos necesarios
        System.out.println("Digite la nota de la participacion:");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();

        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();

        System.out.println("Digite la nota del examen Final: ");
        examaneFinal = entrada.nextFloat();

        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examaneFinal *= 0.40f;

        notaFinal = participacion + primerExamen + segundoExamen + examaneFinal;

        System.out.println("\nLa nota final es " + notaFinal);

    }

}
