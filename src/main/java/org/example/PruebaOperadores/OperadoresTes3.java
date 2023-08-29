package org.example.PruebaOperadores;

import java.util.Scanner;

public class OperadoresTes3 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Digite la cantidad de dinero que tiene Guillermo");
        guillermo = entrada.nextFloat();

        luis = guillermo/2;
        juan = (guillermo + luis)/2;

        total = guillermo + luis + juan;

        System.out.println("\nLa cantidad de dinero que tienen entre los 3 es:" + total);
    }

}
