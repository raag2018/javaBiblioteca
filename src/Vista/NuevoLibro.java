/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;
import Modelo.ModelBiblioteca;
import Controlador.bibliotecaControl;
import javax.swing.JFrame;


/**
 *
 * @author Javier
 */
public class NuevoLibro extends javax.swing.JFrame {

    /**
     * Creates new form NuevoTrabajador
     */
    public NuevoLibro() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtxtIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbEdicion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jrbHombre = new javax.swing.JRadioButton();
        jrbMujer = new javax.swing.JRadioButton();
        jcxbInternacional = new javax.swing.JCheckBox();
        jbtnGuardar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboIdioma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboUbicacion = new javax.swing.JComboBox<>();
        jcxbNacional = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("ISBN");

        jLabel2.setText("Titulo");

        jLabel3.setText("Autor");

        jLabel5.setText("Categoria");

        jcbEdicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1era Edicion", "2da  Edicion", "3era Edicion", "4ta  Edicion", "5ta  Edicion", "6ta  Edicion", "7  Edicion", "8  Edicion", "9  Edicion", "10  Edicion" }));

        jLabel6.setText("Genero Autor");

        bgGenero.add(jrbHombre);
        jrbHombre.setSelected(true);
        jrbHombre.setText("Hombre");

        bgGenero.add(jrbMujer);
        jrbMujer.setText("Mujer");

        jcxbInternacional.setText("Internacional");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingresar Libro Nuevo");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 14));

        jLabel7.setText("Idioma");

        jComboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingles ", "Español", "Aleman", "Chino", " " }));

        jLabel8.setText("Estado");

        jLabel9.setText("Ubicacion");

        jComboUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San salvador", "Chalate", "San miguel ", "Son sonate" }));

        jcxbNacional.setText("Nacional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jcxbInternacional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnLimpiar)
                .addGap(30, 30, 30)
                .addComponent(jbtnGuardar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jrbHombre)
                        .addGap(29, 29, 29)
                        .addComponent(jrbMujer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGap(77, 77, 77))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(128, 128, 128)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcxbNacional)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jtxtTitulo)
                                .addComponent(jtxtAutor)
                                .addComponent(jcbEdicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstado)
                                .addComponent(jComboUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbHombre)
                        .addComponent(jrbMujer)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcxbInternacional)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnGuardar)
                    .addComponent(jcxbNacional))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
       try{
           ModelBiblioteca t = new ModelBiblioteca();
           //t.setDui(jtxtIsbn.getText());
           //t.setNombre(jtxtTitulo.getText());
           //t.setApellido(jtxtAutor.getText());
           //t.setEdad(Integer.parseInt(jspnEdad.getValue().toString()));
           //t.setCargo(jcbEdicion.getSelectedItem().toString());
           /*t.setGenero(jrbHombre.isSelected());
           t.setEstadoCivil(jcxbInternacional.isSelected());
           t.setId(jtxtId.getText());
           */
           
           bibliotecaControl tControl = new bibliotecaControl();
           
           /*if(tControl.agregarTrabajador(t)){
               JOptionPane.showMessageDialog(this, "Guardado exitoso");
           }else{
               JOptionPane.showMessageDialog(this, "No se guardo");
           }*/
           
           this.limpiar();
           
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex.getMessage());
       } 
       
       
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void limpiar(){
        jtxtIsbn.setText("");
        jtxtTitulo.setText("");
        jtxtAutor.setText("");
        //jspnEdad.setValue(0);
        jcbEdicion.setSelectedIndex(0);
        jrbHombre.setSelected(true);
        jcxbInternacional.setSelected(false);
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
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JComboBox<String> jComboIdioma;
    private javax.swing.JComboBox<String> jComboUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcbEdicion;
    private javax.swing.JCheckBox jcxbInternacional;
    private javax.swing.JRadioButton jcxbNacional;
    private javax.swing.JRadioButton jrbHombre;
    private javax.swing.JRadioButton jrbMujer;
    private javax.swing.JTextField jtxtAutor;
    private javax.swing.JTextField jtxtIsbn;
    private javax.swing.JTextField jtxtTitulo;
    private javax.swing.JTextField txtEstado;
    // End of variables declaration//GEN-END:variables
}
