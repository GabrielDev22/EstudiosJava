package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;
public class CondicionalesTest3 {

    public static void main(String[] args){
        char letra;

        letra = JOptionPane.showInputDialog("Digite un letra: ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }else {
            JOptionPane.showMessageDialog(null, "Es una letra miniscula");
        }

    }

}
