
package massalud.Vistas.afiliado;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoAdatos.AfiliadoData;
import massalud.AccesoAdatos.Conexion;
import massalud.AccesoAdatos.PrestadorData;
import massalud.Entidades.Afiliado;
import massalud.Entidades.Prestador;


public class PanelListaAF extends javax.swing.JPanel {
    private Connection con = null;
    DefaultTableModel modelo= new DefaultTableModel();
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
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void cabecera(){
    modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);

}
public void llenarTabla(){
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

}