package org.example;

public class operadoresAsig {

    public static void main(String[] args){

        //Operadores con apreviaciones
        int numero = 10;

        numero += 5; // numero = numero + 5;
        numero -= 5;
        numero *= 5;
        numero /=5;
        numero %=5;

        // Operadores de incremento y decremento

        int x = 5, y;

        //x++; // esto es igual a (x = x + 1 || x += 1;

        y = --x;

        System.out.println(y);


        // Operadores con clases Math p

        // Sacar la raiz cuadrada
        double raiz = Math.sqrt(36.67);

        System.out.println(raiz);

        // Elevacion de potencia
        double base = 4, exponente = 3;
        double resultado = Math.pow(base, exponente);

        System.out.println(resultado);

        // Redondeando un numero con la clase Math

         float numeroTwo = 7.86f;
         int resultadoTwo = Math.round(numeroTwo);

        System.out.println(resultadoTwo);

        // Metodo random de un numero aleatorio con Math
        double numeroThree = Math.random();

        System.out.println(numeroThree);

    }

}
