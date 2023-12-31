/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas.Prestador;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import massalud.AccesoAdatos.EspecialidadData;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;

/**
 *
 * @author daniel
 */
public class panelInternoPrestador extends javax.swing.JPanel {
    Prestador pres = new Prestador();
    PrestadorData presD = new PrestadorData();
    EspecialidadData espD =new EspecialidadData();
    /**
     * Creates new form panelInternoPrestador
     */
    public panelInternoPrestador() {
        initComponents();
        llenarCbox();
        jcEspecialidad.setSelectedItem(null);
        pres = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelprincipal = new javax.swing.JPanel();
        jLcartel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTDomicilio1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBGuardar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jcEspecialidad = new javax.swing.JComboBox<>();
        jlActivo = new javax.swing.JLabel();
        jBuscarPrestador = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtIdAfiliado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jPanelprincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLcartel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLcartel.setForeground(new java.awt.Color(0, 0, 0));
        jLcartel.setText("Registrar un nuevo Prestador");
        jPanelprincipal.add(jLcartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DNI:");
        jPanelprincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 10));

        jTDni.setBackground(new java.awt.Color(255, 255, 255));
        jTDni.setForeground(new java.awt.Color(0, 0, 0));
        jTDni.setBorder(null);
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
        jPanelprincipal.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre: ");
        jPanelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTnombre.setBackground(new java.awt.Color(255, 255, 255));
        jTnombre.setForeground(new java.awt.Color(0, 0, 0));
        jTnombre.setBorder(null);
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
        jPanelprincipal.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido:");
        jPanelprincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

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
        jPanelprincipal.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Especialidad");
        jPanelprincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono:");
        jPanelprincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 20));

        jTtelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTtelefono.setForeground(new java.awt.Color(0, 0, 0));
        jTtelefono.setBorder(null);
        jTtelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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
        jPanelprincipal.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 190, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Activo:");
        jPanelprincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

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
        jPanelprincipal.add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Domicilio:");
        jPanelprincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jTDomicilio1.setBackground(new java.awt.Color(255, 255, 255));
        jTDomicilio1.setForeground(new java.awt.Color(0, 0, 0));
        jTDomicilio1.setBorder(null);
        jTDomicilio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDomicilio1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTDomicilio1MousePressed(evt);
            }
        });
        jTDomicilio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilio1ActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jTDomicilio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 190, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 190, 10));

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
        jPanelprincipal.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 300, 40));

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
        jPanelprincipal.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 90, 30));

        jcEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        jcEspecialidad.setForeground(new java.awt.Color(0, 102, 204));
        jcEspecialidad.setBorder(null);
        jPanelprincipal.add(jcEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 190, -1));

        jlActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanelprincipal.add(jlActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jBuscarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jBuscarPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscarPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarPrestadorMouseClicked(evt);
            }
        });
        jPanelprincipal.add(jBuscarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 30, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, 10));

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
        jPanelprincipal.add(jtIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ID:");
        jPanelprincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTDniMouseClicked

    private void jTDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMousePressed


    }//GEN-LAST:event_jTDniMousePressed

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jTnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnombreMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTnombreMouseClicked

    private void jTnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTnombreMousePressed
        // TODO add your handling code here:
    
        

    }//GEN-LAST:event_jTnombreMousePressed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTapellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTapellidoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTapellidoMouseClicked

    private void jTapellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTapellidoMousePressed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jTapellidoMousePressed

    private void jTapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTapellidoActionPerformed

    private void jTtelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtelefonoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTtelefonoMouseClicked

    private void jTtelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtelefonoMousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTtelefonoMousePressed

    private void jTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoActionPerformed

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

    private void jTDomicilio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilio1MouseClicked

    private void jTDomicilio1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilio1MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTDomicilio1MousePressed

    private void jTDomicilio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilio1ActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try{
            if(jTDni.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese un Dni");
                return;
            }
            int docu=0;
            
            if (jTDni.getText().length()>8){
                JOptionPane.showMessageDialog(this, "DNI, maximo de caracteres 8");
                return;
            }else if (jTDni.getText().length()<8){
                
                StringBuilder dniRellenado = new StringBuilder(jTDni.getText());
                
                while (dniRellenado.length() < 8) {
                    dniRellenado.append('0'); // Añade '0' al final
                }
                // Actualiza el campo de texto con el DNI rellenado
               docu = Integer.parseInt(dniRellenado.toString());
            }else if (jTDni.getText().length()==8){
                docu = Integer.parseInt(jTDni.getText());
            };
            try {
                if (jTtelefono.getText().isEmpty()) {
                     JOptionPane.showMessageDialog(this, "Ingrese el telefono");
                     return;
                }
                int telefono = Integer.parseInt(jTtelefono.getText());
                try {
                    if (jTnombre.getText().isEmpty()) {
                         JOptionPane.showMessageDialog(this, "Ingrese un nombre de Prestador");
                         return;
                    } 
                    String nombre = jTnombre.getText();
                    if (nombre.matches(".*\\d.*")){
                         JOptionPane.showMessageDialog(this, "Nombre no pueden contener números");
                         return;
                    }
                    try {
                        if (jTapellido.getText().isEmpty()) {
                             JOptionPane.showMessageDialog(this, "Ingrese un apellido de prestador");
                             return;
                        }
                        String apellido = jTapellido.getText();
                        if (apellido.matches(".*\\d.*")){
                            JOptionPane.showMessageDialog(this, "Apellido no pueden contener números");
                            return;
                         }
                        try {
                            if (jTDomicilio1.getText().isEmpty()) {
                                 JOptionPane.showMessageDialog(this, "Ingrese un Domicilio");
                                 return;
                            }
                             String domicilio = jTDomicilio1.getText();
                            
                            if (jcEspecialidad.getSelectedItem().toString().isEmpty()) {
                                JOptionPane.showMessageDialog(this, "seleccione una Especialidad");
                                return;
                            }
                            
                            String selectItem = jcEspecialidad.getSelectedItem().toString();
                            int idEsp = Integer.parseInt(selectItem.replaceAll("[^0-9]", ""));
                            String NOmbreEsp = selectItem.replaceAll("[0-9\\s]", "");

                            Especialidad esp = new Especialidad(idEsp, NOmbreEsp);
                            
                           
                            
                            boolean activo = jRactivo.isSelected();

                            if (pres == null) {
                                pres = new Prestador(docu, nombre, apellido, domicilio, telefono, esp, activo);
                                presD.guardarPrestador(pres);
                                limpiar();
                                pres = null;
                                return;
                            } else {
                                pres = new Prestador(pres.getIdPrestador(), docu, nombre, apellido, domicilio, telefono, esp, activo);
                                presD.modificarPrestador(pres);
                                limpiar();
                                pres = null;
                                return;
                            }
                        } catch (Exception e) {
                          JOptionPane.showMessageDialog(this, "Seleccione una especialidad");   
                        }
                    } catch (Exception e) {
                         JOptionPane.showMessageDialog(this, "Apellido mal Ingressado");
                    }     
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Nombre mal Ingressado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Telefono mal Ingressado");
            }

        }catch(NumberFormatException ex ){
            JOptionPane.showMessageDialog(this, "DNI mal Ingresado");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try{
            if (jTDni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un DNI");
                return;
            }

            int docu = Integer.parseInt(jTDni.getText());

            pres= presD.buscarPresDni(docu);
            if (pres==null){
                return;
            }

            jRactivo.setSelected(pres.isActivo());
            Activo();
            
            jtIdAfiliado.setText(Integer.toString(pres.getIdPrestador()));
            jTnombre.setText(pres.getNombre());
            jTnombre.setForeground(Color.black);
            jTapellido.setText(pres.getApellido());
            jTapellido.setForeground(Color.black);
            jTtelefono.setText(Integer.toString(pres.getTelefono()));
            jTtelefono.setForeground(Color.black);
            jTDomicilio1.setText(pres.getDomicilio());
            jTDomicilio1.setForeground(Color.black);
            
            jRactivo.setSelected(pres.isActivo());
            
            Activo();
            
            jcEspecialidad.setSelectedItem(pres.getEspecialidad().toString());
            

            jLcartel.setText("Modificar Afiliado");
            jBGuardar.setText("Guardar modificacion");

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un número");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarPrestadorMouseClicked
        try {
            if (jtIdAfiliado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un id para buscar");
                return;
            }
            int id = Integer.parseInt(jtIdAfiliado.getText());

            boolean aux = false;
            
            for (Prestador afi : presD.listarPrestador()) {
                String Act = (afi.isActivo() ? "activo" : "Inactivo");

                if (afi.getIdPrestador() == id) {

                    pres = afi;

                    jTDni.setText(Integer.toString(pres.getDni()));
                    jTDni.setForeground(Color.black);

                    jTnombre.setText(pres.getNombre());
                    jTnombre.setForeground(Color.black);
                    jTapellido.setText(pres.getApellido());
                    jTapellido.setForeground(Color.black);
                    jTtelefono.setText(Integer.toString(pres.getTelefono()));
                    jTtelefono.setForeground(Color.black);
                    jTDomicilio1.setText(pres.getDomicilio());
                    jTDomicilio1.setForeground(Color.black);

                    jRactivo.setSelected(pres.isActivo());

                    Activo();

                    jcEspecialidad.setSelectedItem(pres.getEspecialidad().toString());
                    aux = true;
                    jBGuardar.setText("Guardar modificacion");
                   return;
                }
            }
            if (!aux) {
                JOptionPane.showMessageDialog(this, "Prestador no encontrado");
                limpiar();
            }
        } catch (Exception e) {
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcartel;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JComboBox<String> jcEspecialidad;
    private javax.swing.JLabel jlActivo;
    private javax.swing.JTextField jtIdAfiliado;
    // End of variables declaration//GEN-END:variables

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
private void llenarCbox(){
    jcEspecialidad.removeAllItems();
    for (Especialidad esp : espD.listarEsp()) {
        jcEspecialidad.addItem(esp.toString());
    }
}
public void limpiar(){
    jtIdAfiliado.setText("");
    jTDni.setText("");
    jTDomicilio1.setText("");
    jTapellido.setText("");
    jTtelefono.setText("");
    jTnombre.setText("");
    jRactivo.setSelected(false);
    jlActivo.setText("");
    
    jcEspecialidad.setSelectedItem(null);
    jLcartel.setText("Registrar un prestador");
    jBGuardar.setText("Registrar ");
}
}
