package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;
public class CondicionalesTest4 {

    /*
    * En megaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300 ¿Cual sera
    * la cantidad que pagara una persona por su compra?
    *
    * */

    public static void main(String[] args){

        float compra, descuento, total;

        compra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monton a pagar:"));

        if(compra >= 300){
            descuento = compra * 20 / 100;
            total = compra - descuento;
            JOptionPane.showMessageDialog(null, "La compra es mayor a 300 se realiza un descuento el total es :" + total);
        }else{
            JOptionPane.showMessageDialog(null, "La compra no es mayor a 300 no tiene descuento el total es : " + compra);
        }

    }

}
