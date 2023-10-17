/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalud.Vistas.Prestador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoAdatos.EspecialidadData;
import massalud.Entidades.Especialidad;

/**
 *
 * @author Michi
 */
public class PanelEspecialidad extends javax.swing.JPanel {
DefaultTableModel modelo = new DefaultTableModel();
EspecialidadData espD = new EspecialidadData();
Especialidad esp = new Especialidad();
    /**
     * Creates new form Especialidad
     */
    public PanelEspecialidad() {
        initComponents();
        esp=null;
        cabecera();
        llenarT();
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
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtespecialidad = new javax.swing.JTable();
        jGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 213, -1));

        jBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jtespecialidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtespecialidad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtespecialidad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 683, 230));

        jGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

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

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
         String nombre = jtNombre.getText();
        if(nombre.isEmpty()){
                JOptionPane.showMessageDialog(this, "No pueden haber campos vacios");
                return;
 
            }else if(nombre.matches(".*\\d.*")){

                JOptionPane.showMessageDialog(this, "Nombre no puede contener números");
                return;
            }
        if(esp==null){
            
            esp = new Especialidad(nombre);
            espD.guardarEsp(esp);
            limpiar();
            return;
        }else{
        esp = new Especialidad(esp.getIdEspecialidad(),nombre);
        espD.modificar(nombre, esp.getIdEspecialidad());
        }
     
     llenarT();
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        if(jId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un ID");
            return;
        }
        int id = Integer.parseInt(jId.getText());
        esp= espD.buscarEp(id);
        jtNombre.setText(esp.getEspecialidad());
        jGuardar.setText("Modificar");
        
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtespecialidad;
    // End of variables declaration//GEN-END:variables
public void cabecera(){
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
jtespecialidad.setModel(modelo);
}

public void limpiar(){
    jId.setText("");
    jtNombre.setText("");
}
public void llenarT(){
    borrarT();
    for(Especialidad es: espD.listarEsp()){
        modelo.addRow(new Object[]{
        es.getIdEspecialidad(),
        es.getEspecialidad()
       });
    }
}
private void borrarT(){
    int indice=modelo.getRowCount()-1;
    for (int i = indice;i >= 0; i--) {
        modelo.removeRow(i);
    }

}

}

