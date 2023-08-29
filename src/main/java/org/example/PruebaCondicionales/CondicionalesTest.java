package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest {

    public static void main(String[] args){

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));

        if((numero%10) == 0){
            JOptionPane.showMessageDialog(null, "El numero" + numero + "Es multiplico de 10;") ;
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
        }

    }

}
