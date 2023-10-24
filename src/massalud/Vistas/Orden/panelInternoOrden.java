/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas.Orden;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;
import massalud.AccesoAdatos.AfiliadoData;
import massalud.AccesoAdatos.OrdenData;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Afiliado;
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;

public class panelInternoOrden extends javax.swing.JPanel {
    
     Orden orden = new Orden();
     OrdenData ordenD = new OrdenData();
     AfiliadoData afiD = new AfiliadoData();
     PrestadorData presD = new PrestadorData();
     

   
    public panelInternoOrden() {
        initComponents();
        LlenarFormaPago();
        jcFPago.setSelectedItem(null);
        orden=null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLcartel = new javax.swing.JLabel();
        jlIdOrden = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jtImporte = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtIdAfiliado = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jtIdPrestador = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jlActivo = new javax.swing.JLabel();
        jtIdOrden = new javax.swing.JTextField();
        jtNombrePrestador = new javax.swing.JTextField();
        jcFPago = new javax.swing.JComboBox<>();
        jtNombreAfiliado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLcartel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLcartel.setText("Registrar una Nueva Orden");
        jPanel1.add(jLcartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 30));

        jlIdOrden.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlIdOrden.setForeground(new java.awt.Color(51, 51, 51));
        jlIdOrden.setText("IdOrden");
        jPanel1.add(jlIdOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, 10));

        jtImporte.setForeground(new java.awt.Color(153, 153, 153));
        jtImporte.setBorder(null);
        jtImporte.setCaretColor(new java.awt.Color(0, 0, 0));
        jtImporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtImporteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtImporteMousePressed(evt);
            }
        });
        jtImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtImporteActionPerformed(evt);
            }
        });
        jPanel1.add(jtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("idAfiliado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jtIdAfiliado.setForeground(new java.awt.Color(0, 0, 0));
        jtIdAfiliado.setBorder(null);
        jtIdAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtIdAfiliadoMousePressed(evt);
            }
        });
        jtIdAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdAfiliadoActionPerformed(evt);
            }
        });
        jtIdAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIdAfiliadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdAfiliadoKeyTyped(evt);
            }
        });
        jPanel1.add(jtIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("idPrestador");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 20));

        jtIdPrestador.setForeground(new java.awt.Color(0, 0, 0));
        jtIdPrestador.setBorder(null);
        jtIdPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtIdPrestadorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtIdPrestadorMousePressed(evt);
            }
        });
        jtIdPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdPrestadorActionPerformed(evt);
            }
        });
        jtIdPrestador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtIdPrestadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdPrestadorKeyTyped(evt);
            }
        });
        jPanel1.add(jtIdPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Forma de pago");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Importe");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Fecha");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jBGuardar.setBackground(new java.awt.Color(0, 153, 255));
        jBGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Registrar");
        jBGuardar.setBorder(null);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 300, 40));

        jBuscar.setBackground(new java.awt.Color(0, 153, 255));
        jBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setText("Buscar");
        jBuscar.setBorder(null);
        jBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 90, 30));

        jlActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(jlActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jtIdOrden.setForeground(new java.awt.Color(0, 0, 0));
        jtIdOrden.setBorder(null);
        jtIdOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtIdOrdenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtIdOrdenMousePressed(evt);
            }
        });
        jtIdOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdOrdenActionPerformed(evt);
            }
        });
        jtIdOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdOrdenKeyTyped(evt);
            }
        });
        jPanel1.add(jtIdOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 40, -1));

        jtNombrePrestador.setEditable(false);
        jtNombrePrestador.setBackground(new java.awt.Color(255, 255, 255));
        jtNombrePrestador.setForeground(new java.awt.Color(153, 153, 153));
        jtNombrePrestador.setText("NombrePrestador");
        jtNombrePrestador.setBorder(null);
        jtNombrePrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombrePrestadorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNombrePrestadorMousePressed(evt);
            }
        });
        jtNombrePrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombrePrestadorActionPerformed(evt);
            }
        });
        jPanel1.add(jtNombrePrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, 20));

        jcFPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jcFPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 180, -1));

        jtNombreAfiliado.setEditable(false);
        jtNombreAfiliado.setBackground(new java.awt.Color(255, 255, 255));
        jtNombreAfiliado.setForeground(new java.awt.Color(153, 153, 153));
        jtNombreAfiliado.setText("NombreAfiliado");
        jtNombreAfiliado.setBorder(null);
        jtNombreAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtNombreAfiliadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNombreAfiliadoMousePressed(evt);
            }
        });
        jtNombreAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreAfiliadoActionPerformed(evt);
            }
        });
        jPanel1.add(jtNombreAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 10));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("$");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 10, -1));
        jPanel1.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtImporteMouseClicked
        // TODO add your handling code here:
        jtImporte.setText("");
        jtImporte.setForeground(Color.black);
    }//GEN-LAST:event_jtImporteMouseClicked

    private void jtImporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtImporteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtImporteMousePressed

    private void jtImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtImporteActionPerformed

    private void jtIdAfiliadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdAfiliadoMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtIdAfiliadoMousePressed

    private void jtIdAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAfiliadoActionPerformed

    private void jtIdPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdPrestadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdPrestadorMouseClicked

    private void jtIdPrestadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdPrestadorMousePressed
  
    }//GEN-LAST:event_jtIdPrestadorMousePressed

    private void jtIdPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdPrestadorActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try{
            if (jtIdAfiliado.getText().isEmpty() || jtIdPrestador.getText().isEmpty() || jtImporte.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
                return;
            }
            try {
                int idAfiliado = Integer.parseInt(jtIdAfiliado.getText());
                Afiliado afi = afiD.buscarAfiliado(idAfiliado);
                if (afi == null) {
                    JOptionPane.showMessageDialog(this, "no se puede guardar, afiliado inexistente");
                    return;
                }
                try {
                    int idPrestador = Integer.parseInt(jtIdPrestador.getText());
                    Prestador pres = presD.buscarPres(idPrestador);
                    if (pres == null) {
                        JOptionPane.showMessageDialog(this, "no se puede guardar, Prestador inexistente");
                        return;
                    }
                    try {
                        String FormaPago = jcFPago.getSelectedItem().toString();
                        
                    //revisar que importe sea un numero;
                    try {
                        int importe=0;
                        
                        if(!jtImporte.getText().isEmpty()){
                            importe = Integer.parseInt(jtImporte.getText());
                        }else{
                            JOptionPane.showMessageDialog(this, "ingrese un importe");
                            return;
                        }
                        

                         LocalDate fecha;
                         
                        if (jdFecha.getDate() != null) {
                            fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                            // Haz algo con 'fecha' aquí
                        } else {
                            JOptionPane.showMessageDialog(this, "Ingrese una fecha");
                           return;
                        }

                        if (orden == null) {
                            orden = new Orden(afi, pres, fecha , FormaPago, importe);
                            ordenD.guardarOrden(orden);
                            Limpiar();
                            orden=null;
                        } else {
                            orden = new Orden(orden.getIdOrden(), afi, pres, fecha , FormaPago, importe);
                            ordenD.modificarOrd(orden);
                            Limpiar();
                            orden=null;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Importe mal ingresado");
                    }

                    ;

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Ingrese una forma de pago");
                        return;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Id Prestador mal Ingresado");
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Id Afiliado mal Ingresado");
                return;
            }    
           

        }catch(NumberFormatException ex ){
            JOptionPane.showMessageDialog(this, "Id mal ingresado");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try{
            if (jtIdOrden.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un Id de la Orden");
                return;
            }

            int idOrden = Integer.parseInt(jtIdOrden.getText());
           
            
            
            orden = ordenD.BuscarOrden(idOrden);
            
            if (orden.getIdOrden()!=idOrden ){
                JOptionPane.showMessageDialog(this, "Orden no encontrada");
                
                return;
            }
            
            
                    
            jtIdPrestador.setText(Integer.toString(orden.getPrestador().getIdPrestador()));
            
            jtNombrePrestador.setText(orden.getPrestador().getNombre());
            jtNombrePrestador.setForeground(Color.black);
            
            
            
            jtIdAfiliado.setText(Integer.toString(orden.getAfiliado().getIdAfiliado()));
            
            jtNombreAfiliado.setText(orden.getAfiliado().getNombre());
            jtNombreAfiliado.setForeground(Color.black);
            
           
            jdFecha.setDate(Date.valueOf(orden.getFecha().toString()));
            
            jcFPago.setSelectedItem(orden.getFormaPago().toString());
            
            jtImporte.setText(Integer.toString(orden.getImporte()));
            jtImporte.setForeground(Color.black);
            

            jLcartel.setText("Modificar Orden");
            jBGuardar.setText("Guardar modificacion");

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un número");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jtIdOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdOrdenMouseClicked

    }//GEN-LAST:event_jtIdOrdenMouseClicked

    private void jtIdOrdenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdOrdenMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdOrdenMousePressed

    private void jtIdOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdOrdenActionPerformed

    private void jtNombrePrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombrePrestadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombrePrestadorMouseClicked

    private void jtNombrePrestadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombrePrestadorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombrePrestadorMousePressed

    private void jtNombrePrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombrePrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombrePrestadorActionPerformed

    private void jtNombreAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreAfiliadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreAfiliadoMouseClicked

    private void jtNombreAfiliadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreAfiliadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreAfiliadoMousePressed

    private void jtNombreAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreAfiliadoActionPerformed

    private void jtIdAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdAfiliadoKeyTyped
        // TODO add your handling code here:
        try {
            String idAfiliadoTexto = jtIdAfiliado.getText().trim(); 

            if (!idAfiliadoTexto.isEmpty()) { 
                int idAfiliado = Integer.parseInt(idAfiliadoTexto);
                Afiliado afi = afiD.buscarAfiliado(idAfiliado);

                if (afi != null) {
                    jtNombreAfiliado.setForeground(Color.black);
                    jtNombreAfiliado.setText(afi.getNombre());
                }else{
                    jtNombreAfiliado.setText("No Encontrado");
                    jtNombreAfiliado.setForeground(Color.gray);
                    return;
                }
            } 
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID de Afiliado mal ingresado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ingrese un idAfiliado");
        }
    
    }//GEN-LAST:event_jtIdAfiliadoKeyTyped

    private void jtIdPrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdPrestadorKeyTyped

        try {
            String idPrestadorTexto = jtIdPrestador.getText().trim();
            if (!idPrestadorTexto.isEmpty()) { 
                int idPrestado = Integer.parseInt(idPrestadorTexto);
                Prestador pres = presD.buscarPres(idPrestado);
                if (pres == null) {
                    jtNombrePrestador.setText("No encontrado");
                    jtNombrePrestador.setForeground(Color.gray);
                    return;
                } else {
                    jtNombrePrestador.setForeground(Color.black);
                    jtNombrePrestador.setText(pres.getNombre());
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Id Afiliado mal Ingresado" + e.getMessage());
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "ingrese unID prestador ");
        }
    }//GEN-LAST:event_jtIdPrestadorKeyTyped
    
    private void jtIdAfiliadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdAfiliadoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtIdAfiliadoKeyReleased

    private void jtIdPrestadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdPrestadorKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtIdPrestadorKeyReleased

    private void jtIdOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdOrdenKeyTyped

        try {
            
            String idOrdenTexto="";
            
            if (!jtIdOrden.getText().isEmpty()) {
                  idOrdenTexto = jtIdOrden.getText().trim();
            }else{
                
                return;
            }
            
            int idOrden = Integer.parseInt(idOrdenTexto);
             
            orden = ordenD.BuscarOrden(idOrden);
            
            if (orden.getIdOrden()!=idOrden ){
                
                return;
            }
           
            orden = ordenD.BuscarOrden(idOrden);

            jtIdPrestador.setText(Integer.toString(orden.getPrestador().getIdPrestador()));
            jtNombrePrestador.setText(orden.getPrestador().getNombre());
            jtNombrePrestador.setForeground(Color.black);

            jtIdAfiliado.setText(Integer.toString(orden.getAfiliado().getIdAfiliado()));
            jtNombreAfiliado.setText(orden.getAfiliado().getNombre());
            jtNombreAfiliado.setForeground(Color.black);

            // Conversión de LocalDate a util.Date para el componente jdFecha
            //Date fechaUtil = Date.from(orden.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant());
            
            //jdFecha.setDate(fechaUtil);
            jdFecha.setDate(Date.valueOf(orden.getFecha().toString()));

            jcFPago.setSelectedItem(orden.getFormaPago().toString());
            jtImporte.setText(Integer.toString(orden.getImporte()));
            jtImporte.setForeground(Color.black);
            
            

            jLcartel.setText("Modificar Orden");
            jBGuardar.setText("Guardar modificación");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID de Orden mal ingresado: " + e.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_jtIdOrdenKeyTyped
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcartel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> jcFPago;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlActivo;
    private javax.swing.JLabel jlIdOrden;
    private javax.swing.JTextField jtIdAfiliado;
    private javax.swing.JTextField jtIdOrden;
    private javax.swing.JTextField jtIdPrestador;
    private javax.swing.JTextField jtImporte;
    private javax.swing.JTextField jtNombreAfiliado;
    private javax.swing.JTextField jtNombrePrestador;
    // End of variables declaration//GEN-END:variables

    public void LlenarFormaPago(){
        jcFPago.removeAllItems();
        jcFPago.addItem("Efectivo");
        jcFPago.addItem("Tarjeta Debito");
        jcFPago.addItem("Tarjeta Credito");
      
    }
   public void Limpiar (){
       jtIdAfiliado.setText("");
       jtIdOrden.setText("");
       jtIdPrestador.setText("");
       jtImporte.setText("");
       jtIdPrestador.setText("");
       jLcartel.setText("Registrar una Nueva Orden");
       jBGuardar.setText("Registrar");
       jcFPago.setSelectedItem(null);
   }
}
