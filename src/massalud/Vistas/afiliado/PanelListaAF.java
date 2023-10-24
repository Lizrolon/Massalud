
package massalud.Vistas.afiliado;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoAdatos.AfiliadoData;
import massalud.AccesoAdatos.Conexion;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Afiliado;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;


public class PanelListaAF extends javax.swing.JPanel {
    private Connection con = null;
    Afiliado afi = new Afiliado();
    AfiliadoData afiD = new AfiliadoData();
    DefaultTableModel modelo= new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
        
    };
    /**
     * Creates new form PanelListaAF
     */
    public PanelListaAF() {
        initComponents();
        con = Conexion.getConexion();
        cabecera();
        llenarTabla();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTAblaAfiliado = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jtIdAfiliado = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jBuscarPrestador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTapellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jRactivo = new javax.swing.JRadioButton();
        jBGuardar = new javax.swing.JButton();
        JlEliminar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTAblaAfiliado.setBackground(new java.awt.Color(255, 255, 255));
        jtTAblaAfiliado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtTAblaAfiliado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTAblaAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTAblaAfiliadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTAblaAfiliado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 680, 180));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

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
        jPanel1.add(jtIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 150, 10));

        jBuscarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jBuscarPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscarPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarPrestadorMouseClicked(evt);
            }
        });
        jPanel1.add(jBuscarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 30, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DNI:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

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
        jPanel1.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 190, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 10));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

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
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

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
        jPanel1.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, 10));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 20));

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
        jPanel1.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 190, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Domicilio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

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
        jPanel1.add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 190, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 102, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 190, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Activo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

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
        jPanel1.add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jBGuardar.setBackground(new java.awt.Color(0, 153, 255));
        jBGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar modificacion");
        jBGuardar.setBorder(null);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 180, 30));

        JlEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/eliminara.png"))); // NOI18N
        JlEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(JlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

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

    private void jBuscarPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarPrestadorMouseClicked
        try {
            if (jtIdAfiliado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un id para buscar");
                return;
            }
            int id = Integer.parseInt(jtIdAfiliado.getText());

            boolean aux = false;

            for (Afiliado afi : afiD.listarAfiliados()) {

                if (afi.getIdAfiliado() == id) {

                    jTDni.setText(Integer.toString(afi.getDni()));
                    jTDni.setForeground(Color.black);

                    jTnombre.setText(afi.getNombre());
                    jTnombre.setForeground(Color.black);
                    jTapellido.setText(afi.getApellido());
                    jTapellido.setForeground(Color.black);
                    jTtelefono.setText(Integer.toString(afi.getTelefono()));
                    jTtelefono.setForeground(Color.black);
                    jTDomicilio.setText(afi.getDomicilio());
                    jTDomicilio.setForeground(Color.black);

                    jRactivo.setSelected(afi.isActivo());

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

    private void jTDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTDniMouseClicked

    private void jTDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDniMousePressed
        // TODO add your handling code here:
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

    private void jTDomicilioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilioMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTDomicilioMouseClicked

    private void jTDomicilioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDomicilioMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTDomicilioMousePressed

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jRactivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRactivoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jRactivoMouseClicked

    private void jRactivoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRactivoMousePressed
        // TODO add your handling code here:
        if(jRactivo.isSelected()==false){
            jRactivo.setText("activo");
            jRactivo.setForeground(Color.green);
        }else if(jRactivo.isSelected()==true){
            jRactivo.setText("Inactivo");
            jRactivo.setForeground(Color.red);
        }
    }//GEN-LAST:event_jRactivoMousePressed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
           try {
               if (jtIdAfiliado.getText().isEmpty()) {
                   JOptionPane.showMessageDialog(this, "Ingrese un Id");
                   return;
               }
               int id= Integer.parseInt(jtIdAfiliado.getText());
               
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
                    JOptionPane.showMessageDialog(this, "Ingrese un nombre de Prestador");
                    return;
                }
                String nombre = jTnombre.getText();
                if (nombre.matches(".*\\d.*")) {
                    JOptionPane.showMessageDialog(this, "Nombre no pueden contener números");
                    return;
                }
                if (jTapellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ingrese un apellido de prestador");
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
                    try {

                        boolean activo = jRactivo.isSelected();
                        
                        JOptionPane.showMessageDialog(this, 
                                " nombre: " + nombre+
                                " apellido:  "+ apellido+ 
                                " docu: "+ docu+ 
                                " telefono: "+ telefono +
                                " domicilio " + domicilio +
                                " activo: " + activo);
                        

                   
                        Afiliado afi2 = new Afiliado(id , nombre, apellido, docu, telefono, domicilio, activo);
                        afiD.modificarAfi2(afi2);
                        limpiar();
                        llenarTabla();
                        return;
                                              
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Aqui"+e.getMessage());
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

       
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void JlEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlEliminarMouseClicked
        // TODO add your handling code here:
        if (jtIdAfiliado.getText().isEmpty()) {
                   JOptionPane.showMessageDialog(this, "Ingrese un Id");
                   return;
               }
               int id= Integer.parseInt(jtIdAfiliado.getText());
               
               afiD.borrarAfiliado(id);
               
               llenarTabla();
   
    }//GEN-LAST:event_JlEliminarMouseClicked

    private void jtTAblaAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTAblaAfiliadoMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount()== 2) {
 
            int fila = jtTAblaAfiliado.getSelectedRow();
            jtIdAfiliado.setText(Integer.toString((int)modelo.getValueAt(fila, 0)));
            jtIdAfiliado.setEditable(false);
            jTDni.setText(Integer.toString((int)modelo.getValueAt(fila, 1)));
            jTDni.setForeground(Color.black);
            jTnombre.setText((String) modelo.getValueAt(fila, 2));
            jTnombre.setForeground(Color.black);
            jTapellido.setText((String) modelo.getValueAt(fila, 3));
            jTapellido.setForeground(Color.black);
            jTDomicilio.setText((String)modelo.getValueAt(fila, 4));
            jTDomicilio.setForeground(Color.black);
            jTtelefono.setText(Integer.toString((int)modelo.getValueAt(fila, 5)));
            jTtelefono.setForeground(Color.black);
            String var = (String) modelo.getValueAt(fila, 6);
            

             boolean act = false;
             
             if (var.equals("activo")) {

                 act = true;
             } else if(var.equals("inactivo")){
                 act = false;
             }
             jRactivo.setSelected(act);
             Activo();
             
         }
    }//GEN-LAST:event_jtTAblaAfiliadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JLabel jBuscarPrestador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JTextField jtIdAfiliado;
    private javax.swing.JTable jtTAblaAfiliado;
    // End of variables declaration//GEN-END:variables
public void cabecera(){
    modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado");
        jtTAblaAfiliado.setModel(modelo);

}
public void llenarTabla(){
    borrarT();
      AfiliadoData afiD = new AfiliadoData();

        for (Afiliado afi : afiD.listarAfiliados()) {
            String Act = "";
            if(afi.isActivo()==true){
                  Act="activo";  
                }else if (afi.isActivo()==false){
                    Act="Inactivo";
                };
            modelo.addRow(new Object[]{
                afi.getIdAfiliado(),
                afi.getDni(),
                afi.getNombre(),
                afi.getApellido(),
                afi.getDomicilio(),
                afi.getTelefono(),
                Act
            });
        }
    }

public void Activo(){
    //jlActivo.setText("");
    if(jRactivo.isSelected()==true){
        jRactivo.setText("activo");
        jRactivo.setForeground(Color.green);
    }else if(jRactivo.isSelected()==false){
        jRactivo.setText("Inactivo");
        jRactivo.setForeground(Color.red);
    }
}
public void limpiar(){
    jtIdAfiliado.setText("");
    jTDni.setText("");
    jTDomicilio.setText("");
    jTapellido.setText("");
    jTtelefono.setText("");
    jTnombre.setText("");
    jRactivo.setSelected(false);
    jRactivo.setText("");
 

}
 private void borrarT(){
    int indice =modelo.getRowCount()-1;
    for (int i = indice;i >= 0; i--) {
        modelo.removeRow(i);
    }

}

}