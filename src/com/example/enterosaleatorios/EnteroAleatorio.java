package com.example.enterosaleatorios;

import javax.swing.*;

/**
 * @author Carlos Colón
 */
public class EnteroAleatorio {
    public static void main(String[] args) {
        int valor;
        StringBuilder salida = new StringBuilder();

        for (int i = 1; i <= 30; i++){
            valor = 1 + (int) (Math.random() * 6);
            salida.append(valor).append(" ");

            if ( i % 5 == 0)
                salida.append("\n");
        }
        JOptionPane.showConfirmDialog( null, salida.toString(),
                "30 números aleatorios del 1 al 6",
                JOptionPane.DEFAULT_OPTION);

        System.exit(0);
    }
}