/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.bibliotecaControl;
import Modelo.ModelBiblioteca;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carba
 */
public class ListaBiblioteca extends javax.swing.JFrame {
    ArrayList<ModelBiblioteca> Libros = null;
    /**
     * Creates new form ListaTrabajador
     */
    public ListaBiblioteca() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtBiblioteca = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jtBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Titulo", "Autor", "Editorial", "año_publicacion", "isbn", "genero", "numero_paginas", "idioma", "formato", "descripcion", "fecha_adquisicion", "precio", "estado", "ubicacion"
            }
        ));
        jScrollPane1.setViewportView(jtBiblioteca);
        if (jtBiblioteca.getColumnModel().getColumnCount() > 0) {
            jtBiblioteca.getColumnModel().getColumn(14).setResizable(false);
        }

        jtxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarActionPerformed(evt);
            }
        });

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Quieres eliminar Libro de la lista?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnBuscar)
                        .addGap(30, 30, 30)
                        .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarActionPerformed
        // TODO add your handling code here:
        jbtnBuscarActionPerformed(evt);
    }//GEN-LAST:event_jtxtBuscarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        this.listar2();
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed

        //try {
            // TODO add your handling code here:
            int indice = jtBiblioteca.getSelectedRow();
            
            //ModelBiblioteca biblioteca = this.jtBiblioteca.getId(indice);
            bibliotecaControl tControl = new bibliotecaControl();
            
            /*if(tControl.eliminarBiblioteca(jtBiblioteca.get(indice))){
                JOptionPane.showMessageDialog(this, "Eleminado Correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se a podido Eliminar");
            }*/
        /*} catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }*/
            
        this.listar();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void listar2(){
        
        bibliotecaControl tControl = new bibliotecaControl();
        try{
           ArrayList<ModelBiblioteca> Libros = null;
            if(jtxtBuscar.getText().isEmpty()){
                Libros = tControl.listarBiblioteca();
            }else{
                Libros = tControl.buscarPorID(jtxtBuscar.getText());
                if(Libros.size()==0){
                    JOptionPane.showMessageDialog(this,"No se ha encontrado nada con ID");
                }
            }
            
            
            DefaultTableModel tablaListar = new DefaultTableModel();
            tablaListar.addColumn("id");
            tablaListar.addColumn("titulo");
            tablaListar.addColumn("autor");
            tablaListar.addColumn("editorial");
            tablaListar.addColumn("anio_publicacion");
            tablaListar.addColumn("isbn");
            tablaListar.addColumn("genero");
            tablaListar.addColumn("numero_paginas");
            tablaListar.addColumn("idioma");
            tablaListar.addColumn("formato");
            tablaListar.addColumn("fecha_adquisicion");
            tablaListar.addColumn("precio");
            tablaListar.addColumn("estado");
            tablaListar.addColumn("ubicacion");
         
            
            for (ModelBiblioteca biblio : Libros) {
                Object[] fila = new Object[15];
                fila[0] = biblio.getId();
                fila[1] = biblio.getTitulo();
                fila[2] = biblio.getAutor();
                fila[3] = biblio.getEditorial();
                fila[4] = biblio.getAnio_publicacion();
                fila[5] = biblio.getIsbn();
                fila[6] = biblio.getGenero();
                fila[7] = biblio.getNumero_paginas();
                fila[8] = biblio.getIdioma();
                fila[9] = biblio.getFormato();
                fila[10] = biblio.getDescripcion();
                fila[11] = biblio.getFecha_adquisicion();
                fila[12] = biblio.getPrecio();
                fila[13] = biblio.getEstado();
                fila[14] = biblio.getUbicacion();
                tablaListar.addRow(fila);
            }
             this.jtBiblioteca.setModel(tablaListar);
        } catch (Exception ex) {
            System.out.println("Ha surgido un error al buscar: " + ex.getMessage());
        }
           
    }
    
    public void listar() {
        bibliotecaControl bControl = new bibliotecaControl();
        try {
             Libros = bControl.listarBiblioteca();
            DefaultTableModel tablaListar = new DefaultTableModel();
            tablaListar.addColumn("id");
            tablaListar.addColumn("titulo");
            tablaListar.addColumn("autor");
            tablaListar.addColumn("editorial");
            tablaListar.addColumn("anio_publicacion");
            tablaListar.addColumn("isbn");
            tablaListar.addColumn("genero");
            tablaListar.addColumn("numero_paginas");
            tablaListar.addColumn("idioma");
            tablaListar.addColumn("formato");
            tablaListar.addColumn("fecha_adquisicion");
            tablaListar.addColumn("precio");
            tablaListar.addColumn("estado");
            tablaListar.addColumn("ubicacion");
            for (ModelBiblioteca biblio : Libros) {
                Object[] fila = new Object[15];
                fila[0] = biblio.getId();
                fila[1] = biblio.getTitulo();
                fila[2] = biblio.getAutor();
                fila[3] = biblio.getEditorial();
                fila[4] = biblio.getAnio_publicacion();
                fila[5] = biblio.getIsbn();
                fila[6] = biblio.getGenero();
                fila[7] = biblio.getNumero_paginas();
                fila[8] = biblio.getIdioma();
                fila[9] = biblio.getFormato();
                fila[10] = biblio.getDescripcion();
                fila[11] = biblio.getFecha_adquisicion();
                fila[12] = biblio.getPrecio();
                fila[13] = biblio.getEstado();
                fila[14] = biblio.getUbicacion();
                tablaListar.addRow(fila);
            }
            this.jtBiblioteca.setModel(tablaListar);
        } catch (SQLException ex) {
            System.out.println("Ha surgido un error al listar: " + ex.getMessage());
        }
    }

    
    
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
            java.util.logging.Logger.getLogger(ListaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaBiblioteca().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JTable jtBiblioteca;
    private javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}
