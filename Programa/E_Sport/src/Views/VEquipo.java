package Views;

import Controladora.Main;
import javax.swing.JOptionPane;
import Excepciones.Excepcion;
import java.util.Calendar;
import UML.Equipo;
import java.util.Date;

public class VEquipo extends javax.swing.JDialog {
    
    private boolean alta, baja, modificacion, listado; 

    /**
     * Creates new form VEquipo
     */
    public VEquipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public VEquipo(java.awt.Frame parent, boolean modal, String tipo) {
        super(parent, modal);
        initComponents();
        switch(tipo)
        {
            case "alta":
                alta=true;
                baja=false;
                modificacion=false;
                listado=false;
                tfNombre.setEnabled(true);
                taComentario.setEnabled(true);
                bAceptar.setEnabled(true);
                bBuscar.setEnabled(false);
                break;
            case "baja":
                alta=false;
                baja=true;
                modificacion=false;
                listado=false;
                break;
            case "modificacion":
                alta=false;
                baja=false;
                modificacion=true;
                listado=false;
                break;
            case "listado":
                alta=false;
                baja=false;
                modificacion=false;
                listado=true;
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bUltimo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taComentario = new javax.swing.JTextArea();
        bBuscar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bPrimero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bAnterior = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taPlantilla = new javax.swing.JTextArea();
        cFechaCreacion = new org.freixas.jcalendar.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bUltimo.setText(">|");
        bUltimo.setEnabled(false);
        bUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUltimoActionPerformed(evt);
            }
        });

        jLabel6.setText("Comentario:");

        taComentario.setColumns(20);
        taComentario.setRows(5);
        taComentario.setEnabled(false);
        jScrollPane1.setViewportView(taComentario);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bPrimero.setText("|<");
        bPrimero.setEnabled(false);
        bPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrimeroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EQUIPO");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Fecha de creación:");

        bAnterior.setText("<");
        bAnterior.setEnabled(false);
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        bSiguiente.setText(">");
        bSiguiente.setEnabled(false);
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Plantilla:");

        taPlantilla.setColumns(20);
        taPlantilla.setRows(5);
        taPlantilla.setEnabled(false);
        jScrollPane2.setViewportView(taPlantilla);

        cFechaCreacion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bPrimero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bAnterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bSiguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bUltimo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bAceptar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bCancelar))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(cFechaCreacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPrimero)
                            .addComponent(bAnterior)
                            .addComponent(bSiguiente)
                            .addComponent(bUltimo)))
                    .addComponent(bCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        try
        {
            if(listado)
            {
                if(tfNombre.getText().isEmpty())
                {
                    bSiguiente.setEnabled(true);
                    bUltimo.setEnabled(true);
                }
                else
                {
                    validarNombre();                    
                }
                mostrarDatos();
            }
            else
            {
                validarNombre();
                mostrarDatos();
                if(modificacion)
                {
                    taComentario.setEnabled(true);
                }
                bAceptar.setEnabled(true);
            }
        }
        catch (Excepcion e)
        {
            JOptionPane.showMessageDialog(this, e.getMensaje(), "Error", 0);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getClass());
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        try
        {
            if(alta)
            {
                validarNombre();                
                // Main.altaEquipo(tfNombre.getText(), cFechaCreacion.getDate(), taComentario.getText());
            }
            else
            {
                if(baja)
                {
                   // Main.bajaEquipo(tfNombre.getText());
                }
                else
                {
                    if(modificacion)
                    {
                        validarNombre();
                        // Main.modificarEquipo(tfNombre.getText(), taComentario.getText());
                    }
                }
            }
        }
        catch (Excepcion e)
        {
            JOptionPane.showMessageDialog(this, e.getMensaje(), "Error", 0);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getClass());
        }

    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        // Main.cerrar(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrimeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPrimeroActionPerformed

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void bUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(VEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VEquipo dialog = new VEquipo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bPrimero;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bUltimo;
    private org.freixas.jcalendar.JCalendarCombo cFechaCreacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taComentario;
    private javax.swing.JTextArea taPlantilla;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
    
    private void validarNombre() throws Exception {
        if(tfNombre.getText().isEmpty())
        {
            throw new Excepcion("El nombre del equipo es obligatorio.");
        }
        // Validar nombre para ver si existe algún equipo con ese nombre
        if(alta)
        {
            /*if(Main.buscarNombre(tfNombre.getText()))
            {
                throw new Excepcion("Ya existe un equipo con ese nombre.");
            }*/
        }
        // Validar nombre para ver si no existe algún nombre con ese número
        else
        {
            /*if(!Main.buscarNombre(tfNombre.getText()))
            {
                throw new Excepcion("No existe ningún equipo con ese nombre.");
            }*/
        }
    }
    
    private void mostrarDatos() throws Exception {
        /*Equipo e =Main.buscarEquipo();
        cFechaCreacion.setDate(e.getFechaCreacion());
        taPlantilla.setText(Main.buscarPlantilla());
        taComentario.setText(e.getComentario());*/
    }
}
