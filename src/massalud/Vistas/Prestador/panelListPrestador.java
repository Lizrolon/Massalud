/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas.Prestador;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoAdatos.EspecialidadData;
import massalud.Entidades.Prestador;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;

/**
 *
 * @author daniel
 */
public class panelListPrestador extends javax.swing.JPanel {
    Prestador pres = new Prestador();
    PrestadorData presD = new PrestadorData();
    EspecialidadData espD = new EspecialidadData();
    private Connection con = null;
    DefaultTableModel modelo= new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
 
    };
    
   
    public panelListPrestador() {
        initComponents();
       cabecera();
       llenarTabla();
       llenarCbox();
       jtIdPrestador.setEditable(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelprincipal = new javax.swing.JPanel();
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
        jcEspecialidad = new javax.swing.JComboBox<>();
        jlActivo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jBuscarPrestador = new javax.swing.JLabel();
        jtIdPrestador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jBuscar1 = new javax.swing.JLabel();
        JlEliminar = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelprincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID:");
        jPanelprincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 150, 10));

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
        jPanelprincipal.add(jTDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 190, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nombre: ");
        jPanelprincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

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
        jPanelprincipal.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 10));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido:");
        jPanelprincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

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
        jPanelprincipal.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 190, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 190, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Especialidad");
        jPanelprincipal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Telefono:");
        jPanelprincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 20));

        jTtelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTtelefono.setForeground(new java.awt.Color(0, 0, 0));
        jTtelefono.setBorder(null);
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
        jPanelprincipal.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 190, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 190, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Activo:");
        jPanelprincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

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
        jPanelprincipal.add(jRactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Domicilio:");
        jPanelprincipal.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

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
        jPanelprincipal.add(jTDomicilio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 102, 204));
        jPanelprincipal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 190, 10));

        jBGuardar.setBackground(new java.awt.Color(0, 153, 255));
        jBGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar Modificacion");
        jBGuardar.setBorder(null);
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanelprincipal.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 30));

        jcEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        jcEspecialidad.setForeground(new java.awt.Color(0, 102, 204));
        jcEspecialidad.setBorder(null);
        jPanelprincipal.add(jcEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 150, 20));

        jlActivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanelprincipal.add(jlActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 50, 20));

        jtOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jtOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtOrdenesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtOrdenes);

        jPanelprincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 660, 180));

        jBuscarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jBuscarPrestador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscarPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscarPrestadorMouseClicked(evt);
            }
        });
        jPanelprincipal.add(jBuscarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 18, 30, -1));

        jtIdPrestador.setBackground(new java.awt.Color(255, 255, 255));
        jtIdPrestador.setForeground(new java.awt.Color(0, 0, 0));
        jtIdPrestador.setBorder(null);
        jtIdPrestador.setCaretColor(new java.awt.Color(0, 0, 0));
        jtIdPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jPanelprincipal.add(jtIdPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DNI:");
        jPanelprincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 102, 255));
        jPanelprincipal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, 10));

        jBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuscar1MouseClicked(evt);
            }
        });
        jPanelprincipal.add(jBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 60, 40));

        JlEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/massalud/imagenes/eliminarp.png"))); // NOI18N
        JlEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlEliminarMouseClicked(evt);
            }
        });
        jPanelprincipal.add(JlEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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
                JOptionPane.showMessageDialog(this, "Ingrese Dni");
                return;
            }
            
            int docu = Integer.parseInt(jTDni.getText());
            
            int idPres = Integer.parseInt(jtIdPrestador.getText());
            if(jTnombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese el nombre del prestador");
                return;
            
            }
            if(jTapellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el apellido del prestador");
                return;
            }
            String nombre = jTnombre.getText();
            String apellido= jTapellido.getText();
            if(nombre.matches(".*\\d.*")||apellido.matches(".*\\d.*")){

                JOptionPane.showMessageDialog(this, "Nombre y apellido no pueden contener números");
                return;
            }
            if(jTDomicilio1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el domicilio del prestador");
                return;
            }
            if (jTDni.getText().length()>8){
                JOptionPane.showMessageDialog(this, "DNI, máximo de caracteres 8");
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
            if(jcEspecialidad.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(this, "Seleccione una Especialidad");
                return;
            }
            try{
            
            

            int telefono = Integer.parseInt(jTtelefono.getText());
            
            String domicilio= jTDomicilio1.getText();
            boolean activo = jRactivo.isSelected();
            
            String selectItem =  jcEspecialidad.getSelectedItem().toString();
            int idEsp = Integer.parseInt(selectItem.replaceAll("[^0-9]", ""));
            String NOmbreEsp = selectItem.replaceAll("[0-9\\s]", "");
            
            Especialidad esp = new Especialidad(idEsp,NOmbreEsp );

             
            
                pres = new Prestador(idPres,docu, nombre, apellido, domicilio, telefono, esp, activo);
                presD.modificarPrestador(pres);
                limpiar();
                llenarTabla();
                pres = null;
                jtIdPrestador.setEditable(true);
                
               
            }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Telefono mal ingresado");
            }
        }catch(NumberFormatException ex ){
            JOptionPane.showMessageDialog(this, "Dni mal ingresado"+ex.getMessage());
        }
            
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jtOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtOrdenesMouseClicked
         if (evt.getClickCount()== 2) {
 
            int fila = jtOrdenes.getSelectedRow();
            jtIdPrestador.setText(Integer.toString((int)modelo.getValueAt(fila, 0)));
            jtIdPrestador.setEditable(false);
            jTDni.setText(Integer.toString((int)modelo.getValueAt(fila, 1)));
            jTDni.setForeground(Color.black);
            jTnombre.setText((String) modelo.getValueAt(fila, 2));
            jTnombre.setForeground(Color.black);
            jTapellido.setText((String) modelo.getValueAt(fila, 3));
            jTapellido.setForeground(Color.black);
            jTDomicilio1.setText((String)modelo.getValueAt(fila, 4));
            jTDomicilio1.setForeground(Color.black);
            jTtelefono.setText(Integer.toString((int)modelo.getValueAt(fila, 5)));
            jTtelefono.setForeground(Color.black);
            String NOmbreEsp = ((String) modelo.getValueAt(fila, 6));

             int id = 0;
             for (Especialidad object : espD.listarEsp()) {

                 if (object.getEspecialidad().equals(NOmbreEsp)) {
                     id = object.getIdEspecialidad();
                 }
             }
             jcEspecialidad.setSelectedItem(id + " " + NOmbreEsp);
             jcEspecialidad.setForeground(Color.BLACK);

             boolean act = false;
             String var = (String) modelo.getValueAt(fila, 7);
             if (var.equals("activo")) {

                 act = true;
             } else if(var.equals("inactivo")){
                 act = false;
             }
             jRactivo.setSelected(act);
             Activo();
             
         }
    }//GEN-LAST:event_jtOrdenesMouseClicked

    private void jBuscarPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscarPrestadorMouseClicked
        try {
            if (jtIdPrestador.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un Id para buscar");
                return;
            }
            int id = Integer.parseInt(jtIdPrestador.getText());

            borrarT();

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
                    
                    
                    modelo.addRow(new Object[]{
                        afi.getIdPrestador(),
                        afi.getDni(),
                        afi.getNombre(),
                        afi.getApellido(),
                        afi.getDomicilio(),
                        afi.getTelefono(),
                        afi.getEspecialidad().getEspecialidad(),
                        Act
                    });
                    
                }
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Ócurrio un error al intentar buscar un Prestador");
        }

         
    }//GEN-LAST:event_jBuscarPrestadorMouseClicked

    private void jtIdPrestadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtIdPrestadorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdPrestadorMousePressed

    private void jtIdPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIdPrestadorActionPerformed

    private void jtIdPrestadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdPrestadorKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jtIdPrestadorKeyReleased

    private void jtIdPrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdPrestadorKeyTyped
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jtIdPrestadorKeyTyped

    private void jBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuscar1MouseClicked
        // TODO add your handling code here:
       try {
            if (jcEspecialidad.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Seleccione una especialidad para buscar");
                return;
            }
            
            String EspText = jcEspecialidad.getSelectedItem().toString().replaceAll("[0-9\\s]", "");
            borrarT();
            for (Prestador afi : presD.listarPrestador()) {
                String Act = (afi.isActivo() ? "activo" : "Inactivo");
                if (afi.getEspecialidad().getEspecialidad().equals(EspText)) {   
                    modelo.addRow(new Object[]{
                        afi.getIdPrestador(),
                        afi.getDni(),
                        afi.getNombre(),
                        afi.getApellido(),
                        afi.getDomicilio(),
                        afi.getTelefono(),
                        afi.getEspecialidad().getEspecialidad(),
                        Act
                    });
                }
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Ócurrio un error al seleccionar Especialidad");
        }
        
    }//GEN-LAST:event_jBuscar1MouseClicked

    private void JlEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlEliminarMouseClicked
       try{
        if (jtIdPrestador.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un Id");
            return;
        }
        int id= Integer.parseInt(jtIdPrestador.getText());
        presD.borrarPres(id);
       

        llenarTabla();
        limpiar();
       }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Id mal ingresado");
       }
    }//GEN-LAST:event_JlEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JLabel jBuscar1;
    private javax.swing.JLabel jBuscarPrestador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelprincipal;
    private javax.swing.JRadioButton jRactivo;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTextField jtIdPrestador;
    private javax.swing.JTable jtOrdenes;
    // End of variables declaration//GEN-END:variables

    public void cabecera(){
    modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Especilidad");
        modelo.addColumn("Estado");
        jtOrdenes.setModel(modelo);

}
    
    public void llenarTabla(){
        borrarT();
        PrestadorData presD = new PrestadorData();

        for (Prestador afi : presD.listarPrestador()) {
            String Act = "";
            if(afi.isActivo()==true){
                  Act="activo";  
                }else if (afi.isActivo()==false){
                    Act="Inactivo";
                };
            modelo.addRow(new Object[]{
                afi.getIdPrestador(),
                afi.getDni(),
                afi.getNombre(),
                afi.getApellido(),
                afi.getDomicilio(),
                afi.getTelefono(),
                afi.getEspecialidad().getEspecialidad(),
                Act
            });
        }
    }
    public void limpiar(){
    jTDni.setText("");
    jTDomicilio1.setText("");
    jTapellido.setText("");
    jTtelefono.setText("");
    jTnombre.setText("");
    jRactivo.setSelected(false);
    jlActivo.setText("");
    jtIdPrestador.setText("");
    jcEspecialidad.setSelectedItem(null);
    
    
}
private void llenarCbox(){
    
    jcEspecialidad.removeAllItems();
    for (Especialidad esp : espD.listarEsp()) {
        jcEspecialidad.addItem(esp.toString());
    }
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
 private void borrarT(){
    int indice =modelo.getRowCount()-1;
    for (int i = indice;i >= 0; i--) {
        modelo.removeRow(i);
    }

}
}

