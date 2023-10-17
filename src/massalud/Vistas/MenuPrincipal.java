/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas;

import massalud.Vistas.afiliado.PanelAfiliado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import massalud.Vistas.Orden.panelPrincipalOrden;
import massalud.Vistas.Prestador.panelPrincipalPrestador;
import massalud.Vistas.afiliado.panelPrincipalAfi;

/**
 *
 * @author Michi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse, yMause;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        
        //agreando panel principal
        
        panelPrincipal pp = new panelPrincipal();
        pp.setSize(702,459);
        pp.setLocation(0, 0);
        
        panelcentral.removeAll();
        panelcentral.add(pp,BorderLayout.CENTER);
        panelcentral.revalidate();
        panelcentral.repaint();

       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlBArra = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        jlInicio = new javax.swing.JLabel();
        panelaAfiliado = new javax.swing.JPanel();
        jlAfiliado = new javax.swing.JLabel();
        panelPrestador = new javax.swing.JPanel();
        jlPrestador = new javax.swing.JLabel();
        panelOden = new javax.swing.JPanel();
        jlOrden = new javax.swing.JLabel();
        panelcentral = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jlBArra.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlBArra.setForeground(new java.awt.Color(0, 0, 0));
        jlBArra.setText("Bienvenido");

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/salir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlBArra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBArra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 730, 50));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/mas.png"))); // NOI18N
        jLabel1.setText("Massalud");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        panelInicio.setBackground(new java.awt.Color(0, 153, 255));
        panelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelInicioMouseExited(evt);
            }
        });

        jlInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlInicio.setForeground(new java.awt.Color(255, 255, 255));
        jlInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/casa.png"))); // NOI18N
        jlInicio.setText("INICIO");
        jlInicio.setToolTipText("");
        jlInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jlInicio)
                .addGap(31, 31, 31))
        );

        panelaAfiliado.setBackground(new java.awt.Color(0, 153, 255));
        panelaAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelaAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelaAfiliadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelaAfiliadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelaAfiliadoMouseExited(evt);
            }
        });

        jlAfiliado.setBackground(new java.awt.Color(0, 153, 255));
        jlAfiliado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlAfiliado.setForeground(new java.awt.Color(255, 255, 255));
        jlAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/user_accounts.png"))); // NOI18N
        jlAfiliado.setText("AFILIADO");
        jlAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAfiliadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlAfiliadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlAfiliadoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlAfiliadoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelaAfiliadoLayout = new javax.swing.GroupLayout(panelaAfiliado);
        panelaAfiliado.setLayout(panelaAfiliadoLayout);
        panelaAfiliadoLayout.setHorizontalGroup(
            panelaAfiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaAfiliadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panelaAfiliadoLayout.setVerticalGroup(
            panelaAfiliadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelaAfiliadoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlAfiliado)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelPrestador.setBackground(new java.awt.Color(0, 153, 255));
        panelPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPrestadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPrestadorMouseExited(evt);
            }
        });

        jlPrestador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPrestador.setForeground(new java.awt.Color(255, 255, 255));
        jlPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/head_medical.png"))); // NOI18N
        jlPrestador.setText("PRESTADOR");
        jlPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPrestadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlPrestadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlPrestadorMouseExited(evt);
            }
        });

        panelOden.setBackground(new java.awt.Color(0, 153, 255));
        panelOden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelOden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOdenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOdenMouseExited(evt);
            }
        });

        jlOrden.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlOrden.setForeground(new java.awt.Color(255, 255, 255));
        jlOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/lists_list.png"))); // NOI18N
        jlOrden.setText("ORDEN");
        jlOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlOrdenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlOrdenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlOrdenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelOdenLayout = new javax.swing.GroupLayout(panelOden);
        panelOden.setLayout(panelOdenLayout);
        panelOdenLayout.setHorizontalGroup(
            panelOdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOdenLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlOrden)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOdenLayout.setVerticalGroup(
            panelOdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOdenLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlOrden)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrestadorLayout = new javax.swing.GroupLayout(panelPrestador);
        panelPrestador.setLayout(panelPrestadorLayout);
        panelPrestadorLayout.setHorizontalGroup(
            panelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrestadorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrestadorLayout.setVerticalGroup(
            panelPrestadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrestadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(panelOden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPrestador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelaAfiliado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 460));

        panelcentral.setBackground(new java.awt.Color(255, 255, 255));
        panelcentral.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout panelcentralLayout = new javax.swing.GroupLayout(panelcentral);
        panelcentral.setLayout(panelcentralLayout);
        panelcentralLayout.setHorizontalGroup(
            panelcentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        panelcentralLayout.setVerticalGroup(
            panelcentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(panelcentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 690, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseEntered
        // TODO add your handling code here:
        panelInicio.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_panelInicioMouseEntered

    private void panelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseExited
       panelInicio.setBackground(new Color(0,153,255));
        
    }//GEN-LAST:event_panelInicioMouseExited

    private void panelPrestadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestadorMouseEntered
        // TODO add your handling code here:
        panelPrestador.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_panelPrestadorMouseEntered

    private void panelOdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOdenMouseEntered
        // TODO add your handling code here:
        panelOden.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_panelOdenMouseEntered

    private void panelPrestadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestadorMouseExited
        // TODO add your handling code here:
        panelPrestador.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_panelPrestadorMouseExited

    private void panelOdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOdenMouseExited
        // TODO add your handling code here:
        panelOden.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_panelOdenMouseExited

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void panelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseClicked
        // TODO add your handling code here:
 
        panelPrincipal pp = new panelPrincipal();
        pp.setSize(702,459);
        pp.setLocation(0, 0);
        
        panelcentral.removeAll();
        panelcentral.add(pp,BorderLayout.CENTER);
        panelcentral.revalidate();
        panelcentral.repaint();
        
        
        jlBArra.setText("Hola, de nuevo...");

    }//GEN-LAST:event_panelInicioMouseClicked

    private void panelOdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOdenMouseClicked
        // TODO add your handling code here:
        panelPrincipalOrden pp = new panelPrincipalOrden();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        panelcentral.removeAll();
        panelcentral.add(pp,BorderLayout.CENTER);
        panelcentral.revalidate();
        panelcentral.repaint();

        jlBArra.setText("Hoy, "+new SimpleDateFormat("EEEE dd 'de' MMMM yyyy").format(new Date()));
        
        
        
    }//GEN-LAST:event_panelOdenMouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        yMause = evt.getY();
        xMouse = evt.getX();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        // AL MANDENER PRESIONADO Y ARRASTAR SE MUEVE LA VENTANA
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen(); 
        this.setLocation( x - xMouse, y - yMause);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jlInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInicioMouseClicked
        // TODO add your handling code here:
        panelInicioMouseClicked(evt);
    }//GEN-LAST:event_jlInicioMouseClicked

    private void jlInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInicioMouseEntered
        // TODO add your handling code here:
        panelInicio.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_jlInicioMouseEntered

    private void jlPrestadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPrestadorMouseEntered
        // TODO add your handling code here:
        panelPrestador.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_jlPrestadorMouseEntered

    private void jlOrdenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOrdenMouseEntered
        panelOden.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_jlOrdenMouseEntered

    private void jlInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInicioMouseExited
        // TODO add your handling code here:
        panelInicio.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_jlInicioMouseExited

    private void jlPrestadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPrestadorMouseExited
        // TODO add your handling code here:
        panelPrestadorMouseExited(evt);
    }//GEN-LAST:event_jlPrestadorMouseExited

    private void jlOrdenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOrdenMouseExited
        // TODO add your handling code here:
        panelOdenMouseExited(evt);
    }//GEN-LAST:event_jlOrdenMouseExited

    private void panelaAfiliadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelaAfiliadoMouseExited
        // TODO add your handling code here:
        panelaAfiliado.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_panelaAfiliadoMouseExited

    private void panelaAfiliadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelaAfiliadoMouseEntered
        // TODO add your handling code here:
        panelaAfiliado.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_panelaAfiliadoMouseEntered

    private void panelaAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelaAfiliadoMouseClicked
        // TODO add your handling code here:

        panelPrincipalAfi pp = new panelPrincipalAfi();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        panelcentral.removeAll();
        panelcentral.add(pp,BorderLayout.CENTER);
        panelcentral.revalidate();
        panelcentral.repaint();

        jlBArra.setText("Hoy, "+new SimpleDateFormat("EEEE dd 'de' MMMM yyyy").format(new Date()));
    }//GEN-LAST:event_panelaAfiliadoMouseClicked

    private void jlAfiliadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAfiliadoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jlAfiliadoMouseReleased

    private void jlAfiliadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAfiliadoMouseExited
        // TODO add your handling code here:
        panelaAfiliadoMouseExited(evt);
    }//GEN-LAST:event_jlAfiliadoMouseExited

    private void jlAfiliadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAfiliadoMouseEntered
        // TODO add your handling code here:
        panelaAfiliado.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_jlAfiliadoMouseEntered

    private void jlAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAfiliadoMouseClicked
        // TODO add your handling code here:
        panelaAfiliadoMouseClicked(evt);
        panelaAfiliadoMouseEntered(evt);
        panelOdenMouseExited(evt);
    }//GEN-LAST:event_jlAfiliadoMouseClicked

    private void jlPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPrestadorMouseClicked
        // TODO add your handling code here:
        panelPrincipalPrestador pp = new panelPrincipalPrestador();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        panelcentral.removeAll();
        panelcentral.add(pp,BorderLayout.CENTER);
        panelcentral.revalidate();
        panelcentral.repaint();

        jlBArra.setText("Hoy, "+new SimpleDateFormat("EEEE dd 'de' MMMM yyyy").format(new Date()));
    }//GEN-LAST:event_jlPrestadorMouseClicked

    private void jlOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOrdenMouseClicked
        // TODO add your handling code here:
        panelOdenMouseClicked(evt);
        panelOdenMouseEntered(evt);
        panelOdenMouseExited(evt);
        
        
    }//GEN-LAST:event_jlOrdenMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlAfiliado;
    private javax.swing.JLabel jlBArra;
    private javax.swing.JLabel jlInicio;
    private javax.swing.JLabel jlOrden;
    private javax.swing.JLabel jlPrestador;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelOden;
    private javax.swing.JPanel panelPrestador;
    private javax.swing.JPanel panelaAfiliado;
    private javax.swing.JPanel panelcentral;
    // End of variables declaration//GEN-END:variables

   



}
