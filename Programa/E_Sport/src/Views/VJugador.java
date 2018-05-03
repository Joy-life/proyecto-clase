package Views;

import Controladora.Main;
import javax.swing.JOptionPane;
import Excepciones.Excepcion;
import Recurso.ValidacionDeDatosDeEntrada;
import UML.Jugador;

public class VJugador extends javax.swing.JDialog {
    
    private boolean alta, baja, modificacion, listado;    

    /**
     * Creates new form VJugador
     */

    public VJugador(String tipo) {
        initComponents();
        setModal(true);
        this.setLocationRelativeTo(null);
        setVisible(true);   
        //anular todas las vistas y mostrar únicamente según tipo de operaciones CRUD que se quiera realizar
        alta=false;
        baja=false;
        modificacion=false;
        listado=false;
        switch(tipo)
        {
            case "alta":
                alta=true;
                tfNombre.setEnabled(true);
                tfApellido1.setEnabled(true);
                tfApellido2.setEnabled(true);
                tfNickname.setEnabled(true);
                taComentario.setEnabled(true);
                bAceptar.setEnabled(true);
                bBuscar.setEnabled(false);
                break;
            case "baja":
                baja=true;
                break;
            case "modificacion":
                modificacion=true;
                break;
            case "listado":
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellido1 = new javax.swing.JTextField();
        tfApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNickname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taComentario = new javax.swing.JTextArea();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bPrimero = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        bUltimo = new javax.swing.JButton();
        ftfSueldo = new javax.swing.JFormattedTextField();
        bBuscar = new javax.swing.JButton();
        cFechaAlta = new org.freixas.jcalendar.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("JUGADOR");

        jLabel2.setText("DNI:");

        jLabel3.setText("Nombre:");

        tfNombre.setEnabled(false);

        jLabel4.setText("Apellidos:");

        tfApellido1.setEnabled(false);

        tfApellido2.setEnabled(false);

        jLabel5.setText("Nickname:");

        tfNickname.setEnabled(false);

        jLabel6.setText("Comentario:");

        taComentario.setColumns(20);
        taComentario.setRows(5);
        taComentario.setEnabled(false);
        jScrollPane1.setViewportView(taComentario);

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

        jLabel7.setText("Sueldo:");

        jLabel8.setText("Fecha de alta:");

        bPrimero.setText("|<");
        bPrimero.setEnabled(false);

        bAnterior.setText("<");
        bAnterior.setEnabled(false);

        bSiguiente.setText(">");
        bSiguiente.setEnabled(false);

        bUltimo.setText(">|");
        bUltimo.setEnabled(false);

        ftfSueldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        ftfSueldo.setEnabled(false);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        cFechaAlta.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNickname)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bPrimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bUltimo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(ftfSueldo)
                            .addComponent(cFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDNI)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido1)
                            .addComponent(tfApellido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ftfSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPrimero)
                    .addComponent(bAnterior)
                    .addComponent(bSiguiente)
                    .addComponent(bUltimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
       try
       {
           if(alta)
           {
               //validación de datos
                ValidacionDeDatosDeEntrada.validar(3, tfDNI);
                ValidacionDeDatosDeEntrada.validar(4, tfNombre);  
                ValidacionDeDatosDeEntrada.validar(5, tfApellido1);
                if(tfApellido2.getText()!= null){
                   ValidacionDeDatosDeEntrada.validar(5, tfApellido2);
                }
                //comprobar si existe, en caso negativo procede el alta.
               if(!Main.buscarDNI(tfDNI.getText()).isEmpty())
                {
                throw new Excepcion("Ya existe un jugador con ese DNI.");
                }
               Main.altaJugador(tfDNI.getText(), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfNickname.getText(), taComentario.getText());
           }
           else
           {
               ValidacionDeDatosDeEntrada.validar(3, tfDNI);
               //comprueba dni, en caso positivo, procede la operación.
               if(Main.buscarDNI(tfDNI.getText()).isEmpty())
                {
                    throw new Excepcion(17);
                }
               if(baja)
               {
                   //baja del jugador
                   Main.bajaJugador(tfDNI.getText());
               }
               else
               {
                   //valida los datos y si es correcto, modifica el jugador
                    ValidacionDeDatosDeEntrada.validar(4, tfNombre);  
                    ValidacionDeDatosDeEntrada.validar(5, tfApellido1);
                    if(tfApellido2.getText()!= null){
                        ValidacionDeDatosDeEntrada.validar(5, tfApellido2);
                    }
                   Main.modificarJugador(tfDNI.getText(), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfNickname.getText(), taComentario.getText());
               }
           }
       }
       catch (Excepcion e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 0);
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getClass());
       }
       
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        Main.cerrar(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        
        //localizar jugadores
        try
        {
            // si entra como opción listado, no se permite ninguna modificación y se crea un listado para recorrer por el listado
            if(listado)
            {
                // si dni está vacío, se crea una lista interna, permitiendo recorrerla con los botones direccionales, en caso contrario, muestra únicamente el jugador con ese dni
                if(tfDNI.getText().isEmpty())
                {
                    bPrimero.setEnabled(true);
                    bAnterior.setEnabled(true);
                    bSiguiente.setEnabled(true);
                    bUltimo.setEnabled(true);
                }
                else
                {
                    ValidacionDeDatosDeEntrada.validar(3, tfDNI);                    
                }
                mostrarDatos();
            }
            else
            {
                // localiza un jugador en exclusiva para su edición
                ValidacionDeDatosDeEntrada.validar(3, tfDNI);  
                mostrarDatos();
                if(modificacion)
                {
                    tfNombre.setEnabled(true);
                    tfApellido1.setEnabled(true);
                    tfApellido2.setEnabled(true);
                    tfNickname.setEnabled(true);
                    taComentario.setEnabled(true);
                }
                bAceptar.setEnabled(true);
            }
        }
       catch (Excepcion e)
       {
           JOptionPane.showMessageDialog(this, e.getMessage(), "Error", 0);
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(this, e.getClass());
       }
    }//GEN-LAST:event_bBuscarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bPrimero;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bUltimo;
    private org.freixas.jcalendar.JCalendarCombo cFechaAlta;
    private javax.swing.JFormattedTextField ftfSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taComentario;
    private javax.swing.JTextField tfApellido1;
    private javax.swing.JTextField tfApellido2;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() throws Exception {
        Jugador j =Main.buscarJugador();
        tfDNI.setText(j.getDni());
        tfNombre.setText(j.getNombre());
        tfApellido1.setText(j.getApellido1());
        tfApellido2.setText(j.getApellido2());
        tfNickname.setText(j.getNickname());
        ftfSueldo.setText(String.valueOf(j.getSueldo()));        
        cFechaAlta.setDate(j.getFechaAlta());
        taComentario.setText(j.getComentario());
    }
}
