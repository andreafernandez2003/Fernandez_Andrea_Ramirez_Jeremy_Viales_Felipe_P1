/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author febel
 */
public class Tirardado {
    public Tirardado(JLabel mostrador, JTextField txtNombre){
        // generar numero de dados con numero aleatoreos
        int dado1 = (int)(Math.random()*4)+1;
        // se generaron los iconos de los dados apartir de las imagenes
        Icon uno = new javax.swing.ImageIcon(getClass().getResource("/dados/uno.png"));
        Icon dos = new javax.swing.ImageIcon(getClass().getResource("/dados/Dos.png"));
        Icon tres = new javax.swing.ImageIcon(getClass().getResource("/dados/tres.png"));
        Icon cuatro = new javax.swing.ImageIcon(getClass().getResource("/dados/cuatro.png"));

        // muestra los dados al jugador
        switch (dado1){
            case 1: mostrador.setIcon(uno); break;
            case 2: mostrador.setIcon(dos); break;
            case 3: mostrador.setIcon(tres); break;
            case 4: mostrador.setIcon(cuatro); break;
        }

        int resultado = dado1;
        txtNombre.setText("Muevete " + resultado + " espacios");
        //resultado_dado resultado_dado = new resultado_dado(resultado);
        System.out.println("Cambio x");
    }


    
    
}
