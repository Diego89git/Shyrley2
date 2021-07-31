/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import DataBase.*;
import Objetos.*;

/**
 *
 * @author roni9
 */
public class VRol extends javax.swing.JFrame {

    /**
     * Creates new form VRol
     */
    public VRol() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTabla();
    }
    
    public void cargarTabla(){
        Tablas tab= new Tablas();
        tab.tbRol(tbRol);
    }
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Salir = new javax.swing.JButton();
        titulo_rol = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        Descripcion_Rol = new javax.swing.JLabel();
        Nombre_Rol = new javax.swing.JLabel();
        text_Nombre = new javax.swing.JTextField();
        text_descripcion = new javax.swing.JTextField();
        BT_Grabar = new javax.swing.JButton();
        BT_Cancelar = new javax.swing.JButton();
        Buscar_tabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRol = new javax.swing.JTable();
        BT_OK = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Salir.setText("SALIR");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        titulo_rol.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        titulo_rol.setForeground(new java.awt.Color(255, 255, 255));
        titulo_rol.setText("ROL");
        getContentPane().add(titulo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sillaa.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        Descripcion_Rol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Descripcion_Rol.setText("Descripción: ");
        getContentPane().add(Descripcion_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Nombre_Rol.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Nombre_Rol.setText("Nombre:");
        getContentPane().add(Nombre_Rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        text_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(text_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 190, -1));
        getContentPane().add(text_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 190, -1));

        BT_Grabar.setText("Grabar");
        BT_Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GrabarActionPerformed(evt);
            }
        });
        getContentPane().add(BT_Grabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 80, -1));

        BT_Cancelar.setText("Cancelar");
        getContentPane().add(BT_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 80, -1));

        jLabel1.setText("Informacion: ");

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        jLabel2.setText("Buscar: ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        tbRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbRol);

        javax.swing.GroupLayout Buscar_tablaLayout = new javax.swing.GroupLayout(Buscar_tabla);
        Buscar_tabla.setLayout(Buscar_tablaLayout);
        Buscar_tablaLayout.setHorizontalGroup(
            Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buscar_tablaLayout.createSequentialGroup()
                .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Buscar_tablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(Buscar_tablaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Buscar_tablaLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Buscar_tablaLayout.setVerticalGroup(
            Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buscar_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Buscar_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Buscar_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 450, 160));

        BT_OK.setText("OK");
        getContentPane().add(BT_OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void BT_GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GrabarActionPerformed
        Rol rol= new Rol();
        rol.setId(0);
        rol.setNombre(this.text_Nombre.getText());
        rol.setDescripcion(this.text_descripcion.getText());
        Insertar_db ins= new Insertar_db("rol");
        ins.insertarRol(rol);
        cargarTabla();
        
    }//GEN-LAST:event_BT_GrabarActionPerformed

    private void text_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(VRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Grabar;
    private javax.swing.JButton BT_OK;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JPanel Buscar_tabla;
    private javax.swing.JLabel Descripcion_Rol;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Nombre_Rol;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRol;
    private javax.swing.JTextField text_Nombre;
    private javax.swing.JTextField text_descripcion;
    private javax.swing.JLabel titulo_rol;
    // End of variables declaration//GEN-END:variables
}