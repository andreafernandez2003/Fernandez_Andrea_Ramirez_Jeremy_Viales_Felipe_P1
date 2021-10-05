
package imagenfondo;

import dados.Tirardado;
import loops.game_loop_1_P1;
import loops.game_loop_1_P2;
import sockets.Cliente;
import sockets.Servidor;
import tablero.Ventana_Reto;
import tablero.nodoCasilla;
import tablero.tableroenlazado;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.swing.*;

public class Index extends javax.swing.JFrame {
    private Cliente c;
    private Servidor s;
    private int in;
    private int posicion;
    Ventana_Reto ventanareto;
    boolean respondiendo;

    public Index(int i) {
        FondoPanel1 fondo = new FondoPanel1();
        in = i;
        this.posicion = 0;
        this.setContentPane(fondo);

        tableroenlazado temp = new tableroenlazado(9);
        temp.generatab();
        temp.imprimir();

        if (i == 0) {
            c = new Cliente();
            Thread threadCliente = new Thread(c);
            threadCliente.start();
        } else {
            s = new Servidor();
            Thread threadCliente = new Thread(s);
            threadCliente.start();
        }
        /*if (in == 1) {
            Thread t = new Thread(new Hilo_M1());
            t.start();
        }
        if (in == 0) {
            Thread t = new Thread(new Hilo_M1());
            t.start();
        }*/
        initComponents();
    }


    public Index() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mostrador = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        P1C1 = new javax.swing.JLabel();
        P2C1 = new javax.swing.JLabel();
        P1C2 = new javax.swing.JLabel();
        P2C3 = new javax.swing.JLabel();
        P1C3 = new javax.swing.JLabel();
        P2C9 = new javax.swing.JLabel();
        P2C2 = new javax.swing.JLabel();
        P2C7 = new javax.swing.JLabel();
        P2C8 = new javax.swing.JLabel();
        P2C5 = new javax.swing.JLabel();
        P2C6 = new javax.swing.JLabel();
        P2C4 = new javax.swing.JLabel();
        P1C7 = new javax.swing.JLabel();
        P1C4 = new javax.swing.JLabel();
        P1C6 = new javax.swing.JLabel();
        P1C5 = new javax.swing.JLabel();
        P1C9 = new javax.swing.JLabel();
        P1C8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Tirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        mostrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dados/uno.png"))); // NOI18N

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(43, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(mostrador)))
                                .addContainerGap(38, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(122, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(115, 115, 115)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mostrador)
                                .addGap(40, 40, 40))
        );

        P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/personaje_1.png"))); // NOI18N

        P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/personaje_2.png"))); // NOI18N

        P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(249, 249, 249)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(P1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(P1C7))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(P2C6)
                                                                        .addComponent(P2C7))
                                                                .addGap(68, 68, 68))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(P2C1)
                                                                .addGap(72, 72, 72)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(P1C8)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(P2C8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                                .addComponent(P1C9)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(P2C9)
                                                                .addGap(73, 73, 73))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(P1C5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(P2C2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(P2C3)
                                                                                .addGap(91, 91, 91))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(P2C5)
                                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(255, 255, 255)
                                                .addComponent(P1C1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(P1C2)
                                                .addGap(118, 118, 118)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(P1C3)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(P1C4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(P2C4)))
                                                .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(P1C1)
                                                        .addComponent(P1C2)
                                                        .addComponent(P1C3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(P2C3)
                                                        .addComponent(P2C1)
                                                        .addComponent(P2C2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(83, 83, 83)
                                                                                .addComponent(P2C6))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(71, 71, 71)
                                                                                .addComponent(P1C6))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(P2C4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(P1C4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(P1C5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(119, 119, 119)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(P1C8)
                                                                                        .addComponent(P1C9)
                                                                                        .addComponent(P1C7)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(156, 156, 156)
                                                                                .addComponent(P2C7))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(99, 99, 99)
                                                                .addComponent(P2C5)
                                                                .addGap(123, 123, 123)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(P2C9)
                                                                        .addComponent(P2C8))))))
                                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (in == 1) {
            int posicion_otro_a = mensajero.getNumber();
            game_loop_1_P2 loop_otro = new game_loop_1_P2(posicion_otro_a, P2C1, P2C2, P2C3, P2C4, P2C5, P2C6, P2C7, P2C8, P2C9);
        }

        if (in == 0) {
            int posicion_otro_b = mensajero.getNumber();
            game_loop_1_P1 loop_otro = new game_loop_1_P1(posicion_otro_b, P1C1, P1C2, P1C3, P1C4, P1C5, P1C6, P1C7, P1C8, P1C9);

        }
    }
    /////////////////////
    public static boolean posreto(int posjugador){

        nodoCasilla temp = tableroenlazado.primero;
        int[] listaretos = new int[36];
        int i = 0;
        while (temp.getSig()!=null){
            if (temp.gettipo() == "reto"){
                listaretos[i] = temp.getindex();


            }
            temp = temp.getSig();
            i++;

        }
        int k = 0;

        while (k < listaretos.length){

            if (listaretos[k] != 0){
                if (posjugador == listaretos[k]){
                    return true;

                }
            }


            k++;

        }

        return false;
    }


    //GEN-LAST:event_jButton2ActionPerformed

    Mensajero mensajero = Mensajero.getInstance();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Tirardado dado = new Tirardado(mostrador, txtNombre);
        String num_dado_str = txtNombre.getText();
        int num_dado_int = Integer.parseInt(num_dado_str);
        this.posicion += num_dado_int;


        if (in == 1) {
            System.out.println("jugador 1");
            boolean x = posreto(this.posicion);
            System.out.println(x);
            if (x){
                System.out.println("ventana reto");


                this.ventanareto = new Ventana_Reto();
                this.ventanareto.setVisible(true);

                this.respondiendo = true;
            }

            String pos_ = Integer.toString(posicion);
            s.Send(pos_);
            game_loop_1_P1 loop = new game_loop_1_P1(posicion,P1C1,P1C2,P1C3,P1C4,P1C5,P1C6,P1C7,P1C8,P1C9);



        }
        if (in == 0) {
            System.out.println("jugador 2 servidor");

            boolean x = posreto(this.posicion);
            System.out.println(x);

            if (x){
                System.out.println("ventana reto");

                this.ventanareto = new Ventana_Reto();
                this.ventanareto.setVisible(true);

                this.respondiendo = true;
            }
            String pos_ = Integer.toString(posicion);
            c.Send(pos_);
            game_loop_1_P2 loop = new game_loop_1_P2(posicion, P2C1,P2C2,P2C3,P2C4,P2C5,P2C6,P2C7,P2C8,P2C9);
        }
    }

    public static void main() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                niveles nivel = new niveles();
                new Index(nivel.get_i()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1C1;
    private javax.swing.JLabel P1C2;
    private javax.swing.JLabel P1C3;
    private javax.swing.JLabel P1C4;
    private javax.swing.JLabel P1C5;
    private javax.swing.JLabel P1C6;
    private javax.swing.JLabel P1C7;
    private javax.swing.JLabel P1C8;
    private javax.swing.JLabel P1C9;
    private javax.swing.JLabel P2C1;
    private javax.swing.JLabel P2C2;
    private javax.swing.JLabel P2C3;
    private javax.swing.JLabel P2C4;
    private javax.swing.JLabel P2C5;
    private javax.swing.JLabel P2C6;
    private javax.swing.JLabel P2C7;
    private javax.swing.JLabel P2C8;
    private javax.swing.JLabel P2C9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostrador;
    private javax.swing.JTextField txtNombre;}
    // End of variables declaration//GEN-END:variables

    class FondoPanel1 extends JPanel {
        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("3x3.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    /*class Hilo_M1 implements Runnable {
        public void run() {

            if (in == 1) {
                while (true) {
                    int posicion_otro_a = mensajero.getNumber();
                    game_loop_1_P2 loop_otro = new game_loop_1_P2(posicion_otro_a,P2C1,P2C2,P2C3,P2C4,P2C5,P2C6,P2C7,P2C8,P2C9);
                }

            }
            if (in == 0) {
                while (true) {
                    int posicion_otro_b = mensajero.getNumber();
                    game_loop_1_P1 loop_otro = new game_loop_1_P1(posicion_otro_b,P1C1,P1C2,P1C3,P1C4,P1C5,P1C6,P1C7,P1C8,P1C9);

                }
            }
        }
    }*/


