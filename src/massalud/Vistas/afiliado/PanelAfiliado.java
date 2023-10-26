
package massalud.Vistas.afiliado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import massalud.AccesoAdatos.AfiliadoData;
import massalud.AccesoAdatos.Conexion;
import massalud.Entidades.Afiliado;


public class PanelAfiliado extends javax.swing.JPanel {
    private Connection con=null;
    Afiliado afi = new Afiliado();
    AfiliadoData afiD = new AfiliadoData();
    
    
    public PanelAfiliado() {
        con = Conexion.getConexion();
        initComponents();
        afi = null;
        Activo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanelAtras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jLcartel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jlActivo = new javax.swing.JLabel();
        jBuscarPrestador = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jtIdAfiliado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(702, 459));

        jPanelAtras.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAtras.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre: ");
        jPanelAtras.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTnombre.setBackground(new java.awt.Color(255, 255, 255));
        jTnombre.setForeground(new java.awt.Color(0, 0, 0));
        jTnombre.setBorder(null);
        jTnombre.setCaretColor(new java.awt.Color(0, 0, 0));
        jTnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTnombreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTnombreMousePressed(evt);
            }
        });
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jPanelAtras.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido:");
        jPanelAtras.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTapellido.setBackground(new java.awt.Color(255, 255, 255));
        jTapellido.setForeground(new java.awt.Color(0, 0, 0));
        jTapellido.setBorder(null);
        jTapellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTapellidoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTapellidoMousePressed(evt);
            }
        });
        jTapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTapellidoActionPerformed(evt);
            }
        });
        jPanelAtras.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DNI:");
        jPanelAtras.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jTDni.setBackground(new java.awt.Color(255, 255, 255));
        jTDni.setForeground(new java.awt.Color(0, 0, 0));
        jTDni.setBorder(null);
        jTDni.setCaretColor(new java.awt.Color(0, 0, 0));
        jTDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDniMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTDniMousePressed(evt);
            }
        });
        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });
        jPanelAtras.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono:");
        jPanelAtras.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 20));

        jTtelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTtelefono.setForeground(new java.awt.Color(0, 0, 0));
        jTtelefono.setBorder(null);
        jTtelefono.setCaretColor(new java.awt.Color(0, 0, 0));
        jTtelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtelefonoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTtelefonoMousePressed(evt);
            }
        });
        jTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoActionPerformed(evt);
            }
        });
        jPanelAtras.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Domicilio:");
        jPanelAtras.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jTDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        jTDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        jTDomicilio.setBorder(null);
        jTDomicilio.setCaretColor(new java.awt.Color(0, 0, 0));
        jTDomicilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDomicilioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTDomicilioMousePressed(evt);
            }
        });
        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });
        jPanelAtras.add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 190, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Activo:");
        jPanelAtras.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jRactivo.setBackground(new java.awt.Color(0, 153, 255));
        jRactivo.setForeground(new java.awt.Color(255, 255, 255));
        jRactivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRactivoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRactivoMousePressed(evt);
            }
        });
        jPanelAtras.add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

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
        jPanelAtras.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 300, 40));

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
        jPanelAtras.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 30));

        jLcartel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLcartel.setForeground(new java.awt.Color(0, 0, 0));
        jLcartel.setText("Registrar un nuevo Afiliado");
        jPanelAtras.add(jLcartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanelAtras.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanelAtras.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jPanelAtras.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 102, 204));
        jPanelAtras.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 190, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 102, 204));
        jPanelAtras.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 190, 20));

        jlActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlActivo.setForeground(new java.awt.Color(0, 0, 0));
        jPanelAtras.add(jlActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 196, 120, 30));

        jBuscarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jBuscarPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscarPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarPrestadorMouseClicked(evt);
            }
        });
        jPanelAtras.add(jBuscarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 30, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 102, 255));
        jPanelAtras.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, 10));

        jtIdAfiliado.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanelAtras.add(jtIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ID:");
        jPanelAtras.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
      
        try {
           /*if(jTDni.getText().length() < 8||jTDni.getText().length() > 8 ){
               
               JOptionPane.showMessageDialog(this, "El Dni debe tener 8 digítos");
               return;
           }*/
           if(jTDni.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Ingrese DNI");
           return;
           }    
               
            int docu = Integer.parseInt(jTDni.getText()); 
            afi = afiD.buscarAfiliadoporDni(docu);
            
            if (afi==null) {
                
                return;
            } 
            
            jRactivo.setSelected(afi.isActivo());

            Activo();
           jtIdAfiliado.setText(Integer.toString(afi.getIdAfiliado()));
            jTnombre.setText(afi.getNombre());
            jTnombre.setForeground(Color.black);
            jTapellido.setText(afi.getApellido());
            jTapellido.setForeground(Color.black);
            jTtelefono.setText(Integer.toString(afi.getTelefono()));
            jTtelefono.setForeground(Color.black);
            jTDomicilio.setText(afi.getDomicilio());
            jTDomicilio.setForeground(Color.black);

            jLcartel.setText("Modificar Afiliado");
            jBGuardar.setText("Guardar modificacion");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un id para buscar");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            if (jTDni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un Dni");
                return;
            }

            int docu = 0;

            if (jTDni.getText().length() > 8) {
                JOptionPane.showMessageDialog(this, "DNI, maximo de caracteres 8");
                return;
            } else if (jTDni.getText().length() < 8) {

                StringBuilder dniRellenado = new StringBuilder(jTDni.getText());

                while (dniRellenado.length() < 8) {
                    dniRellenado.append('0'); // Añade '0' al final
                }
                // Actualiza el campo de texto con el DNI rellenado
                docu = Integer.parseInt(dniRellenado.toString());
            } else if (jTDni.getText().length() == 8) {
                docu = Integer.parseInt(jTDni.getText());
            }

            
            try {
                if (jTnombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingrese un nombre de Afiliado");
                    return;
                }
                String nombre = jTnombre.getText();
                if (nombre.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(this, "Nombre no pueden contener números");
                    return;
                }
                if (jTapellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingrese un apellido de Afiliado");
                    return;
                }
                String apellido = jTapellido.getText();
                if (apellido.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(this, "Apellido no pueden contener números");
                    return;
                }
                if (jTDomicilio.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingrese un Domicilio");
                    return;
                }
                String domicilio = jTDomicilio.getText();
                try {
                    if (jTtelefono.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Ingrese el telefono");
                        return;
                    }
                   
                    
                   int telefono = Integer.parseInt(jTtelefono.getText());

                    boolean activo = jRactivo.isSelected();

                    if (afi == null) {
                        afi = new Afiliado(nombre, apellido, docu, telefono, domicilio, activo);
                        afiD.guardarAfiliado(afi);
                        afi = null;
                        limpiar();
                        return;
                    } else {
                        int aux=0;
                        if(afi == null){
                          aux=Integer.parseInt(jtIdAfiliado.getText());
                        }else {
                        aux=afi.getIdAfiliado(); }
                        afi = new Afiliado(aux, nombre, apellido, docu, telefono, domicilio, activo);
                        afiD.modificarAfi2(afi);
                        afi = null;
                        limpiar();
                        return;
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Telefono mal ingresado");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrio un Error");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DNI mal ingresado");
        }
        
        
        /*try{  
            
            if(jTDni.getText().isEmpty()||jTtelefono.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
            }
        
        int telefono = Integer.parseInt(jTtelefono.getText());
        String nombre = jTnombre.getText();
        String apellido= jTapellido.getText(); 
        String domicilio= jTDomicilio.getText();
        boolean activo = jRactivo.isSelected();
      if(nombre.isEmpty()||apellido.isEmpty()||domicilio.isEmpty()){
          JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
          return;
      }else if(nombre.matches(".*\\d.*")||apellido.matches(".*\\d.*")){
      
      JOptionPane.showMessageDialog(this, "Nombre y apellido no pueden contener números");
      return;
      }
      if(afi==null){ 
      afi = new Afiliado(nombre, apellido, docu, telefono, domicilio, activo);
      afiD.guardarAfiliado(afi);
      afi=null;
      
      limpiar();
      return;
      }else{
      afi = new Afiliado(nombre, apellido, docu, telefono, domicilio, activo);
      afiD.modificarAfi(afi);
      afi=null;
           limpiar();
           return;
      }
 
     }catch(NumberFormatException ex ){
      JOptionPane.showMessageDialog(this, "Ingrese un número");
     } */
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTapellidoActionPerformed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jTDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTDniMouseClicked

    private void jTnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnombreMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTnombreMouseClicked

    private void jTapellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTapellidoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTapellidoMouseClicked

    private void jTtelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtelefonoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTtelefonoMouseClicked

    private void jTDomicilioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilioMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTDomicilioMouseClicked

    private void jTDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTDniMousePressed

    private void jTnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnombreMousePressed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTnombreMousePressed

    private void jTapellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTapellidoMousePressed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTapellidoMousePressed

    private void jTtelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtelefonoMousePressed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_jTtelefonoMousePressed

    private void jTDomicilioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilioMousePressed
        // TODO add your handling code here:
   
 
    }//GEN-LAST:event_jTDomicilioMousePressed

    private void jRactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRactivoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRactivoMouseClicked

    private void jRactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRactivoMousePressed
        // TODO add your handling code here:
        if(jRactivo.isSelected()==false){
        jlActivo.setText("activo");
        jlActivo.setForeground(Color.green);
    }else if(jRactivo.isSelected()==true){
        jlActivo.setText("Inactivo");
        jlActivo.setForeground(Color.red);
    }
    }//GEN-LAST:event_jRactivoMousePressed

    private void jBuscarPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarPrestadorMouseClicked
        try {
            if (jtIdAfiliado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un id para buscar");
                return;
            }
            int id = Integer.parseInt(jtIdAfiliado.getText());

            boolean aux = false;

            for (Afiliado afi2 : afiD.listarAfiliados()) {
                

                if (afi2.getIdAfiliado() == id) {
                    afi = afi2;
                    jTDni.setText(Integer.toString(afi2.getDni()));
                    jTDni.setForeground(Color.black);

                    jTnombre.setText(afi2.getNombre());
                    jTnombre.setForeground(Color.black);
                    jTapellido.setText(afi2.getApellido());
                    jTapellido.setForeground(Color.black);
                    jTtelefono.setText(Integer.toString(afi2.getTelefono()));
                    jTtelefono.setForeground(Color.black);
                    jTDomicilio.setText(afi2.getDomicilio());
                    jTDomicilio.setForeground(Color.black);

                    jRactivo.setSelected(afi2.isActivo());

                    Activo();
                    aux = true;
                    jBGuardar.setText("Guardar modificacion");
                    return;
                }
            }
            if (!aux) {
                JOptionPane.showMessageDialog(this, "Afiliado no encontrado");
                limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Id mal ingresado");
        }
    }//GEN-LAST:event_jBuscarPrestadorMouseClicked

    private void jtIdAfiliadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdAfiliadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAfiliadoMousePressed

    private void jtIdAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAfiliadoActionPerformed

    private void jtIdAfiliadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdAfiliadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAfiliadoKeyReleased

    private void jtIdAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdAfiliadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdAfiliadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jBuscarPrestador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLcartel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelAtras;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JLabel jlActivo;
    private javax.swing.JTextField jtIdAfiliado;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
    jtIdAfiliado.setText("");
    jTDni.setText("");
    jTDomicilio.setText("");
    jTapellido.setText("");
    jTtelefono.setText("");
    jTnombre.setText("");
    jRactivo.setSelected(false);
    Activo();
}
public void Activo(){
    //jlActivo.setText("");
    if(jRactivo.isSelected()==true){
        jlActivo.setText("activo");
        jlActivo.setForeground(Color.green);
    }else if(jRactivo.isSelected()==false){
        jlActivo.setText("Inactivo");
        jlActivo.setForeground(Color.red);
    }
}
}



