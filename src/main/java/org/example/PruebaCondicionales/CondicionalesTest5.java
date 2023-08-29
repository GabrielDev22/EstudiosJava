package org.example.PruebaCondicionales;

import javax.swing.JOptionPane;

public class CondicionalesTest5 {

    public static void main(String[] args){

        int horasTrabajas;
        float salarioTotal;

        horasTrabajas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas :"));

        if(horasTrabajas <= 40){
            salarioTotal = horasTrabajas * 16;
        }else{
            salarioTotal = (40*16) + ((horasTrabajas-40) * 20);
        }

        JOptionPane.showMessageDialog(null, "El salario total es:" + salarioTotal);

    }

}
