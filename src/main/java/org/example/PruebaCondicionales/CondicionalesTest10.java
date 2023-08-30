package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest10 {

    /*
    * Ejercicio 10: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta
    * Con meses de 28, 30 y 31 dias. Sin años bisiestos.
    *
    * */

    public static void main(String[] args){

        Integer dia,mes,año;
        Integer cadena[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));


        if(mes.equals(cadena[1]) && (mes > 29)){
            JOptionPane.showMessageDialog(null, "El mes es correcto, el dia es incorrecto");
        }else if(mes.equals(cadena[1]) && (mes <= 28)){
            JOptionPane.showMessageDialog(null, "El  mes y el dia son correctos");
        }else if(mes.equals(cadena[0]) && (mes.equals(cadena[2]) && (mes.equals(cadena[4]) && (mes.equals(cadena[6]) && (mes.equals(cadena[7]) && (mes.equals(cadena[9]) && (mes.equals(cadena[11])))))))){
            JOptionPane.showMessageDialog(null, "El mes es correcto, el dia es incorrecto");
        }else{
            System.out.println("No no son iguales");
        }


    }

}
