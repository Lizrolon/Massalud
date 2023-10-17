/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas.Orden;

import java.awt.BorderLayout;

/**
 *
 * @author daniel
 */
public class panelPrincipalOrden extends javax.swing.JPanel {

    /**
     * Creates new form panelPrincipalOrden
     */
    public panelPrincipalOrden() {
        initComponents();
        panelInternoOrden pp = new panelInternoOrden();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        jpanelOrdenCentral.removeAll();
        jpanelOrdenCentral.add(pp,BorderLayout.CENTER);
        jpanelOrdenCentral.revalidate();
        jpanelOrdenCentral.repaint();

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
        jPanel2 = new javax.swing.JPanel();
        jlFechaHoy = new javax.swing.JLabel();
        jlicontodosAfiliado = new javax.swing.JLabel();
        jlIconMAsAfiliado = new javax.swing.JLabel();
        jpanelOrdenCentral = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jlFechaHoy.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jlFechaHoy.setForeground(new java.awt.Color(255, 255, 255));
        jlFechaHoy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/OrdenPA.png"))); // NOI18N
        jlFechaHoy.setText("Orden");
        jlFechaHoy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlFechaHoy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlFechaHoyMouseClicked(evt);
            }
        });

        jlicontodosAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/todos.png"))); // NOI18N
        jlicontodosAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlicontodosAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlicontodosAfiliadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlicontodosAfiliadoMouseEntered(evt);
            }
        });

        jlIconMAsAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/aggremas.png"))); // NOI18N
        jlIconMAsAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlIconMAsAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlIconMAsAfiliadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jlIconMAsAfiliado)
                .addGap(64, 64, 64)
                .addComponent(jlicontodosAfiliado)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlIconMAsAfiliado)
                            .addComponent(jlicontodosAfiliado))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlFechaHoy)
                        .addContainerGap())))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jpanelOrdenCentral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanelOrdenCentralLayout = new javax.swing.GroupLayout(jpanelOrdenCentral);
        jpanelOrdenCentral.setLayout(jpanelOrdenCentralLayout);
        jpanelOrdenCentralLayout.setHorizontalGroup(
            jpanelOrdenCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jpanelOrdenCentralLayout.setVerticalGroup(
            jpanelOrdenCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jpanelOrdenCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jlFechaHoyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlFechaHoyMouseClicked
        // TODO add your handling code her
    }//GEN-LAST:event_jlFechaHoyMouseClicked

    private void jlicontodosAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlicontodosAfiliadoMouseClicked
        // TODO add your handling code here:
        PanelLIstOrdenes pp = new PanelLIstOrdenes();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        jpanelOrdenCentral.removeAll();
        jpanelOrdenCentral.add(pp,BorderLayout.CENTER);
        jpanelOrdenCentral.revalidate();
        jpanelOrdenCentral.repaint();
    }//GEN-LAST:event_jlicontodosAfiliadoMouseClicked

    private void jlicontodosAfiliadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlicontodosAfiliadoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlicontodosAfiliadoMouseEntered

    private void jlIconMAsAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlIconMAsAfiliadoMouseClicked
        // TODO add your handling code here:
        panelInternoOrden pp = new panelInternoOrden();
        pp.setSize(702,459);
        pp.setLocation(0, 0);

        jpanelOrdenCentral.removeAll();
        jpanelOrdenCentral.add(pp,BorderLayout.CENTER);
        jpanelOrdenCentral.revalidate();
        jpanelOrdenCentral.repaint();
    }//GEN-LAST:event_jlIconMAsAfiliadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlFechaHoy;
    private javax.swing.JLabel jlIconMAsAfiliado;
    private javax.swing.JLabel jlicontodosAfiliado;
    private javax.swing.JPanel jpanelOrdenCentral;
    // End of variables declaration//GEN-END:variables
}
