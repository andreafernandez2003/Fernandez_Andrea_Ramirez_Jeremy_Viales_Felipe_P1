
package imagenfondo;

import dados.TIradorDados;
import dados.Tirardado;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Index2 extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();

    
    public Index2(int i) {

        this.setContentPane(fondo);
        
        initComponents(); 
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
        P1C2 = new javax.swing.JLabel();
        P2C2 = new javax.swing.JLabel();
        P1C3 = new javax.swing.JLabel();
        P2C5 = new javax.swing.JLabel();
        P1C4 = new javax.swing.JLabel();
        P2C16 = new javax.swing.JLabel();
        P2C3 = new javax.swing.JLabel();
        P2C7 = new javax.swing.JLabel();
        P2C9 = new javax.swing.JLabel();
        P2C8 = new javax.swing.JLabel();
        P2C1 = new javax.swing.JLabel();
        P2C6 = new javax.swing.JLabel();
        P1C7 = new javax.swing.JLabel();
        P1C9 = new javax.swing.JLabel();
        P1C1 = new javax.swing.JLabel();
        P1C8 = new javax.swing.JLabel();
        P1C5 = new javax.swing.JLabel();
        P1C16 = new javax.swing.JLabel();
        P1C6 = new javax.swing.JLabel();
        P1C15 = new javax.swing.JLabel();
        P1C10 = new javax.swing.JLabel();
        P1C11 = new javax.swing.JLabel();
        P1C14 = new javax.swing.JLabel();
        P2C15 = new javax.swing.JLabel();
        P2C14 = new javax.swing.JLabel();
        P2C12 = new javax.swing.JLabel();
        P2C13 = new javax.swing.JLabel();
        P2C10 = new javax.swing.JLabel();
        P2C11 = new javax.swing.JLabel();
        P1C12 = new javax.swing.JLabel();
        P1C13 = new javax.swing.JLabel();
        P2C4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Tirar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrador)
                .addGap(40, 40, 40))
        );

        P1C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P1C13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        P2C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenfondo/label.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2C1)
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P1C1)
                                        .addGap(75, 75, 75))
                                    .addComponent(P2C16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(P2C9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(P1C9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(P1C16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(P2C2))
                                    .addComponent(P1C10)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(P1C15)
                                        .addGap(33, 33, 33))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(P2C10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(P1C2)))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(P1C8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P2C8)
                                .addGap(118, 118, 118)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1C7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P2C7)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(P2C15)
                                .addGap(19, 19, 19)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(P1C3)
                        .addGap(147, 147, 147)
                        .addComponent(P1C4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(P1C6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(P2C11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(P1C11)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2C14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(P1C12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2C12)
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(P2C13)
                                        .addGap(36, 36, 36))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P2C6)
                                .addGap(64, 64, 64)
                                .addComponent(P1C5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P2C5)
                                .addGap(55, 55, 55))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(P2C3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P2C4)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(P1C14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P1C13)
                                .addGap(76, 76, 76))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(P2C8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(P2C12)
                                                .addGap(63, 63, 63))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(P1C12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(P1C13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P2C10)
                                            .addComponent(P2C9)
                                            .addComponent(P2C11))
                                        .addGap(55, 55, 55)
                                        .addComponent(P1C16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1C2)
                                    .addComponent(P1C3)
                                    .addComponent(P1C4)
                                    .addComponent(P1C1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P2C3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(P1C6)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P2C1)
                                            .addComponent(P2C2)
                                            .addComponent(P2C4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(P2C5)
                                                    .addComponent(P2C6)
                                                    .addComponent(P2C7))
                                                .addGap(13, 13, 13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(71, 71, 71)
                                                        .addComponent(P1C7))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(73, 73, 73)
                                                        .addComponent(P1C5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(51, 51, 51)
                                                        .addComponent(P1C8)))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1C11)
                                    .addComponent(P1C10)
                                    .addComponent(P1C9))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1C14)
                                    .addComponent(P1C15))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(P2C14)
                                    .addGap(253, 253, 253))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(P2C13)
                                    .addGap(101, 101, 101)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P2C15)
                                    .addComponent(P2C16))
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Icon Imagenes = new ImageIcon(getClass().getResource("label.jpg"));
        P2C1.setIcon(Imagenes);
        P2C2.setIcon(Imagenes);
        P2C3.setIcon(Imagenes);
        P2C4.setIcon(Imagenes);
        P2C5.setIcon(Imagenes);
        P2C6.setIcon(Imagenes);
        P2C7.setIcon(Imagenes);
        P2C8.setIcon(Imagenes);
        P2C9.setIcon(Imagenes);
        P2C10.setIcon(Imagenes);
        P2C11.setIcon(Imagenes);
        P2C12.setIcon(Imagenes);
        P2C13.setIcon(Imagenes);
        P2C14.setIcon(Imagenes);
        P2C15.setIcon(Imagenes);
        P2C16.setIcon(Imagenes);
        
        P1C1.setIcon(Imagenes);
        P1C2.setIcon(Imagenes);
        P1C3.setIcon(Imagenes);
        P1C4.setIcon(Imagenes);
        P1C5.setIcon(Imagenes);
        P1C6.setIcon(Imagenes);
        P1C7.setIcon(Imagenes);
        P1C8.setIcon(Imagenes);
        P1C9.setIcon(Imagenes);
        P1C10.setIcon(Imagenes);        
        P1C11.setIcon(Imagenes);
        P1C12.setIcon(Imagenes);
        P1C13.setIcon(Imagenes);
        P1C14.setIcon(Imagenes);
        P1C15.setIcon(Imagenes);
        P1C16.setIcon(Imagenes);


    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //txtNombre.setText("\"hola Diego\"");
        Tirardado dado = new Tirardado(mostrador, txtNombre);
        Icon Imagenes1 = new ImageIcon(getClass().getResource("personaje_1.png"));  
        Icon Imagenes2 = new ImageIcon(getClass().getResource("personaje_2.png"));  
        P2C1.setIcon(Imagenes2);
        P2C2.setIcon(Imagenes2);
        P2C3.setIcon(Imagenes2);
        P2C4.setIcon(Imagenes2);
        P2C5.setIcon(Imagenes2);
        P2C6.setIcon(Imagenes2);
        P2C7.setIcon(Imagenes2);
        P2C8.setIcon(Imagenes2);
        P2C9.setIcon(Imagenes2);
        P2C10.setIcon(Imagenes2);
        P2C11.setIcon(Imagenes2);
        P2C12.setIcon(Imagenes2);
        P2C13.setIcon(Imagenes2);
        P2C14.setIcon(Imagenes2);
        P2C15.setIcon(Imagenes2);
        P2C16.setIcon(Imagenes2);
        
        
        
        P1C1.setIcon(Imagenes1);
        P1C2.setIcon(Imagenes1);
        P1C3.setIcon(Imagenes1);
        P1C4.setIcon(Imagenes1);
        P1C5.setIcon(Imagenes1);
        P1C6.setIcon(Imagenes1);
        P1C7.setIcon(Imagenes1);
        P1C8.setIcon(Imagenes1);
        P1C9.setIcon(Imagenes1);
        P1C10.setIcon(Imagenes1);        
        P1C11.setIcon(Imagenes1);
        P1C12.setIcon(Imagenes1);
        P1C13.setIcon(Imagenes1);
        P1C14.setIcon(Imagenes1);
        P1C15.setIcon(Imagenes1);
        P1C16.setIcon(Imagenes1);



    }

    public static void main() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                niveles nivel = new niveles();
                new Index2(nivel.getnivel()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1C1;
    private javax.swing.JLabel P1C10;
    private javax.swing.JLabel P1C11;
    private javax.swing.JLabel P1C12;
    private javax.swing.JLabel P1C13;
    private javax.swing.JLabel P1C14;
    private javax.swing.JLabel P1C15;
    private javax.swing.JLabel P1C16;
    private javax.swing.JLabel P1C2;
    private javax.swing.JLabel P1C3;
    private javax.swing.JLabel P1C4;
    private javax.swing.JLabel P1C5;
    private javax.swing.JLabel P1C6;
    private javax.swing.JLabel P1C7;
    private javax.swing.JLabel P1C8;
    private javax.swing.JLabel P1C9;
    private javax.swing.JLabel P2C1;
    private javax.swing.JLabel P2C10;
    private javax.swing.JLabel P2C11;
    private javax.swing.JLabel P2C12;
    private javax.swing.JLabel P2C13;
    private javax.swing.JLabel P2C14;
    private javax.swing.JLabel P2C15;
    private javax.swing.JLabel P2C16;
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
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables



    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("4x4.png")).getImage();
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
}