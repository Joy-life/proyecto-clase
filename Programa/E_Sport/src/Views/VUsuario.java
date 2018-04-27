package Views;

import Controladora.Main;
import javax.swing.JOptionPane;
import Excepciones.Excepcion;
import Recurso.ValidacionDeDatosDeEntrada;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import UML.Persona;
import java.awt.Color;
import javax.swing.JTextField;

public class VUsuario extends javax.swing.JDialog {
    
    private boolean alta, baja, modificacion, listado;

    /**
     * Creates new form VUsuario
     */

    public VUsuario(String tipo) {
        initComponents();
        setModal(true);
        setLocationRelativeTo(null);
        setVisible(true);
        //mostrar opciones según tipo de operaciones CRUD que se quiera realizar
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
                tfEmail.setEnabled(true);
                cbPerfil.setEnabled(true);
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

        jLabel5 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bPrimero = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        bSiguiente = new javax.swing.JButton();
        bUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cFechaAlta = new org.freixas.jcalendar.JCalendarCombo();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellido1 = new javax.swing.JTextField();
        tfApellido2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pfContrasenna = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        cbEquipo = new javax.swing.JComboBox<>();
        bBuscarEquipos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("E-mail:");

        tfEmail.setEnabled(false);

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

        jLabel8.setText("Fecha de alta:");

        bPrimero.setText("|<");
        bPrimero.setEnabled(false);
        bPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrimeroActionPerformed(evt);
            }
        });

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

        bUltimo.setText(">|");
        bUltimo.setEnabled(false);
        bUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUltimoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario:");

        jLabel9.setText("Equipo:");

        cFechaAlta.setEnabled(false);

        jLabel3.setText("Nombre:");

        tfNombre.setEnabled(false);

        jLabel4.setText("Apellidos:");

        tfApellido1.setEnabled(false);

        tfApellido2.setEnabled(false);

        jLabel6.setText("Contraseña:");

        pfContrasenna.setEnabled(false);

        jLabel7.setText("Perfil:");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Dueño", "Usuario" }));
        cbPerfil.setSelectedIndex(-1);
        cbPerfil.setEnabled(false);

        cbEquipo.setEnabled(false);

        bBuscarEquipos.setText("Buscar");
        bBuscarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarEquiposActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cFechaAlta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfApellido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(tfApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfContrasenna, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmail))
                                .addGap(18, 18, 18)
                                .addComponent(bBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bPrimero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bAnterior)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bSiguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bUltimo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bAceptar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bCancelar))
                                    .addComponent(cbEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(bBuscarEquipos)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pfContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarEquipos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPrimero)
                    .addComponent(bAnterior)
                    .addComponent(bUltimo)
                    .addComponent(bSiguiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        try
        {
            if(alta)
            {
                // comprobar todos los campos si cumple con las condiciones, si cumple, procede el alta
                ValidacionDeDatosDeEntrada.validar(7, tfUsuario);
                ValidacionDeDatosDeEntrada.validar(8, pfContrasenna);
                ValidacionDeDatosDeEntrada.validar(4, tfNombre);  
                ValidacionDeDatosDeEntrada.validar(5, tfApellido1);
                if(tfApellido2.getText()!= null){
                   ValidacionDeDatosDeEntrada.validar(5, tfApellido2);
                }
                ValidacionDeDatosDeEntrada.validar(6, tfEmail);
                if(cbPerfil.getSelectedIndex() == -1){
                    throw new Excepcion(9);
                }
                /*if(Main.buscarUsuario(tfUsuario.getText()))
                {
                    throw new Excepcion("Ya existe un usuario con ese nombre.");
                }*/
                // Main.altaUsuario(tfUsuario.getText(), String.valueOf(pfContrasenna.getPassword()), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfEmail.getText(), cFechaAlta.getDate(), String.valueOf(cbPerfil.getSelectedItem()), String.valueOf(cbEquipo.getSelectedItem()));
            }
            else
            {
                // 
                if(baja)
                {
                    //proceso de baja, sólo si existe el dni de la persona.
                    /*if(!Main.buscarUsuario(tfUsuario.getText()))
                        {
                            throw new Excepcion(No existe ningún usuario con ese nombre.);
                        }*/
                    // Main.bajaUsuario(tfUsuario.getText());
                }
                else
                {
                    if(modificacion)
                    {
                        // comprobar todos los campos si cumple con las condiciones, si cumple, procede la modificación.
                        ValidacionDeDatosDeEntrada.validar(7, tfUsuario);
                        ValidacionDeDatosDeEntrada.validar(8, pfContrasenna);
                        ValidacionDeDatosDeEntrada.validar(4, tfNombre);  
                        ValidacionDeDatosDeEntrada.validar(5, tfApellido1);
                        if(tfApellido2.getText()!= null){
                           ValidacionDeDatosDeEntrada.validar(5, tfApellido2);
                        }
                        ValidacionDeDatosDeEntrada.validar(6, tfEmail);
                        if(cbPerfil.getSelectedIndex() == -1){
                            throw new Excepcion(9);
                        }
                        //comprobar si existe el usuario
                        /*if(!Main.buscarUsuario(tfUsuario.getText()))
                        {
                            throw new Excepcion(No existe ningún usuario con ese nombre.);
                        }*/
                        // Main.modificarUsuario(tfUsuario.getText(), String.valueOf(pfContrasenna.getPassword()), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfEmail.getText(), String.valueOf(cbPerfil.getSelectedItem()), String.valueOf(cbEquipo.getSelectedItem()));
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

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        //búsqueda por nombre de usuario
        try
        {
            if(listado)
            {
                //si ha entrado con opción de listado y no introduce el usuario a buscar, se carga una tabla interna de usuarios para poder recorrerla mediante los botones direccionales.
                //si rellena campo usuario, se carga únicamente el usuario introducido
                if(tfUsuario.getText().isEmpty())
                {
                    bPrimero.setEnabled(true);
                    bAnterior.setEnabled(true);
                    bSiguiente.setEnabled(true);
                    bUltimo.setEnabled(true);
                }
                else
                {
                    /*if(!Main.buscarUsuario(tfUsuario.getText()))
                        {
                            throw new Excepcion(No existe ningún usuario con ese nombre.);
                        }*/
                }
                mostrarDatos();
            }
            else
            {
                // consulta el usuario, si existe, carga los datos para modificarlo.
                /*if(!Main.buscarUsuario(tfUsuario.getText()))
                        {
                            throw new Excepcion(No existe ningún usuario con ese nombre.);
                        }*/
                mostrarDatos();
                tfNombre.setEnabled(true);
                tfApellido1.setEnabled(true);
                tfApellido2.setEnabled(true);
                tfEmail.setEnabled(true);
                cbPerfil.setEnabled(true);
                
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

    private void bBuscarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarEquiposActionPerformed
        // si perfil dueño es seleccionado y presiona el botón, carga el listado de equipos que el dueño puede editar.
        if(cbPerfil.getSelectedItem().equals("Dueño"))
        {
            cbEquipo.setVisible(true);
        }
    }//GEN-LAST:event_bBuscarEquiposActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bBuscarEquipos;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bPrimero;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bUltimo;
    private org.freixas.jcalendar.JCalendarCombo cFechaAlta;
    private javax.swing.JComboBox<String> cbEquipo;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pfContrasenna;
    private javax.swing.JTextField tfApellido1;
    private javax.swing.JTextField tfApellido2;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    
    private void mostrarDatos() throws Exception {
        /*Persona p =Main.buscarPersona();
        tfUsuario.setText(p.getUsuario());
        pfContrasenna.setText(p.getContrasenna());
        tfNombre.setText(p.getNombre());
        tfApellido1.setText(p.getApellido1());
        tfApellido2.setText(p.getApellido2());
        tfEmail.setText(p.getEmail());        
        cFechaAlta.setDate(p.getFechaAlta());
        cbPerfil.setSelectedItem(p.getPerfil().getNombre());
        cbEquipo.setSelectedItem(p.getEquipo().getNombre());*/
    }
}
