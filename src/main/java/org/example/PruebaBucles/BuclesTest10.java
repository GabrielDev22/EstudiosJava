package org.example.PruebaBucles;

import javax.swing.*;

public class BuclesTest10 {

    /*
    * Ejercicio 12: Pedir un numero y calcular su factorial
    * */

    public static void main(String[] args){

        int numero, suma_pos=0, conteo_pos=0, suma_neg=0,conteo_neg=0,conteo_ceros=0;
        float media_pos,media_neg;

        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

            if(numero == 0){ // Si el numero es cero
                conteo_ceros++;
            } else if(numero >0){
                suma_pos += numero;
                conteo_pos++;
            }else{
                suma_neg += numero;
                conteo_neg++;
            }
        }

        // Tratamos con los positivos

        if(conteo_pos == 0){
            System.out.println("No se puede sacar la media de los positivos");
        }else{
            media_pos = (float) suma_pos/conteo_pos;
            System.out.println("La media de los numeros positivos es:" + media_pos);
        }

        if(conteo_neg == 0){
            System.out.println("No se puede sacar la media de los negativos");
        }else{
            media_neg = (float) suma_neg / conteo_neg;
            System.out.println("La media de los negativos es: " + media_neg);
        }

        System.out.println("La cantidad de ceros es:" + conteo_ceros);


    }

}
