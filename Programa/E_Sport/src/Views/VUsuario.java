package Views;

import Controladora.Main;
import javax.swing.JOptionPane;
import Excepciones.Excepcion;
import Recurso.ValidacionDeDatosDeEntrada;
import UML.Equipo;
import UML.Perfil;
import UML.Persona;
import java.sql.SQLException;
import java.util.ArrayList;

public class VUsuario extends javax.swing.JDialog {

    private int tipo, contador;
    /**
     * Creates new form VUsuario
     */

    ArrayList <Persona> lPersona;
    
    public VUsuario(String tipo) {
        initComponents();
        setModal(true);
        setLocationRelativeTo(null);
        //mostrar opciones según tipo de operaciones CRUD que se quiera realizar
        cargarDatos(tipo);
        setVisible(true);
        
    }
    
    private void cargarDatos(String tipo){
        try{
            cbPerfil.removeAllItems();
            ArrayList <Perfil> listaPerfil = new ArrayList();
            listaPerfil = Main.consultarTodosLosPerfiles();
            for(Perfil p : listaPerfil){
                cbPerfil.addItem(p.getNombre());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getClass());
        }
        cbPerfil.setSelectedIndex(-1);
        lPersona = new ArrayList();
        switch(tipo)
        {
            case "alta":
                this.tipo = 1;
                tfNombre.setEnabled(true);
                pfContrasenna.setEnabled(true);
                tfApellido1.setEnabled(true);
                tfApellido2.setEnabled(true);
                tfEmail.setEnabled(true);
                cbPerfil.setEnabled(true);
                bAceptar.setEnabled(true);
                bBuscar.setEnabled(false);
                break;
            case "baja":
                this.tipo = 3;
                break;
            case "modificacion":
                this.tipo = 2;
                break;
                
            case "listado":
                this.tipo = 4;
                break;
        }
    }

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
        ccFechaAlta = new org.freixas.jcalendar.JCalendarCombo();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellido1 = new javax.swing.JTextField();
        tfApellido2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pfContrasenna = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tfEquipo = new javax.swing.JTextField();

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

        ccFechaAlta.setEnabled(false);

        jLabel3.setText("Nombre:");

        tfNombre.setEnabled(false);

        jLabel4.setText("Apellido 1:");

        tfApellido1.setEnabled(false);

        tfApellido2.setEnabled(false);

        jLabel6.setText("Contraseña:");

        pfContrasenna.setEnabled(false);

        jLabel7.setText("Perfil:");

        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Dueño", "Usuario" }));
        cbPerfil.setSelectedIndex(-1);
        cbPerfil.setEnabled(false);

        jLabel10.setText("Apellido 2:");

        tfEquipo.setEditable(false);

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ccFechaAlta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfApellido2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(tfApellido1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfContrasenna, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEmail)
                                    .addComponent(tfUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfEquipo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(bPrimero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bAnterior)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSiguiente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bUltimo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(bAceptar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bCancelar))
                                .addComponent(cbPerfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 212, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        try
        {
            Persona p = null;
            /*
            p = Main.buscarPersona(tfUsuario.getText()) y comprobacion()
            se ha insertado en cada case por lo siguiente:
            1. en la baja no precisa validar datos.
            2. para evitar el acceso constante a la bbdd, ya que lo primero es validar los datos en java
            */
            switch(tipo){
                case 1:
                    // comprobar todos los campos si los datos introducidos cumple con las validaciones 
                    comprobacion();
                    p = Main.consultarPersona(tfUsuario.getText());
                    // proceder al alta de la persona
                    alta(p);
                    break;
                    
                case 2:
                    // comprobar todos los campos si los datos introducidos cumple con las validaciones
                    comprobacion();
                    p = Main.consultarPersona(tfUsuario.getText());
                    // proceder a la modificacion de la persona
                    modificacion(p);
                    break;
                    
                case 3:
                    // proceder a la eliminación de la persona
                    p = Main.consultarPersona(tfUsuario.getText());
                    baja(p);
                    break;
            }
        }
        catch (Excepcion e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getClass());
        }

    }//GEN-LAST:event_bAceptarActionPerformed

    private void comprobacion()throws Exception{
        
        ValidacionDeDatosDeEntrada.validar(7, tfUsuario);
        ValidacionDeDatosDeEntrada.validar(8, pfContrasenna);
        ValidacionDeDatosDeEntrada.validar(4, tfNombre);  
        ValidacionDeDatosDeEntrada.validar(5, tfApellido1);
        if(!tfApellido2.getText().equals("")){
            ValidacionDeDatosDeEntrada.validar(5, tfApellido2);
        }
        if(!tfEmail.getText().equals("")){
            ValidacionDeDatosDeEntrada.validar(6, tfEmail);
        }
        if(cbPerfil.getSelectedIndex() == -1){
            throw new Excepcion(9);
        }
    }
    
    private void alta(Persona p)throws Exception{
        //comprobar que no exista la persona
        if(p !=  null)
        {
            throw new Excepcion(15);
        }
        // mandar al main para proceder al alta
        Main.altaPersona(tfUsuario.getText(), String.valueOf(pfContrasenna.getPassword()), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfEmail.getText(), ccFechaAlta.getDate(), String.valueOf(cbPerfil.getSelectedItem()));
        JOptionPane.showMessageDialog(this, "El usuario se ha dado de alta correctamente.");
        Main.cerrar(this);
    }
    
    private void modificacion(Persona p) throws Exception{
        //comprobar si existe la persona
        if(p == null)
        {
            throw new Excepcion(18);
        }
        //mandar al main para modificar el usuario con los nuevos datos
        Main.modificarPersona(tfUsuario.getText(), String.valueOf(pfContrasenna.getPassword()), tfNombre.getText(), tfApellido1.getText(), tfApellido2.getText(), tfEmail.getText(), String.valueOf(cbPerfil.getSelectedItem()));
        JOptionPane.showMessageDialog(this, "El usuario se ha dado modificado correctamente.");
        Main.cerrar(this);
    }
    
    private void baja(Persona p) throws Exception{
        try{
            // comprobar si existe la persona
            if(p == null)
            {
                throw new Excepcion(18);
            }
            // mandar al main para proceder a la baja
            Main.bajaPersona(tfUsuario.getText());
            JOptionPane.showMessageDialog(this, "El usuario se ha dado de baja correctamente.");
            Main.cerrar(this);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            //JOptionPane.showMessageDialog(this, e.getMessage(), "No se ha podido eliminar el registro, la persona tiene vinculado otro registro.", 0);
        }
    }

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        Main.cerrar(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrimeroActionPerformed
        // cargar el primer registro
        JOptionPane.showMessageDialog(this, "Este es el primer registro");
        contador = 0;
        mostrarDatos(lPersona.get(contador));
    }//GEN-LAST:event_bPrimeroActionPerformed

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        // retroceder un registro
        if(contador == 0){
            JOptionPane.showMessageDialog(this, "Este es el primer registro");
        }
        else{
            contador--;
            mostrarDatos(lPersona.get(contador));
        }
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        // avanzar un registro
        if(contador == lPersona.size()-1){
            JOptionPane.showMessageDialog(this, "Este es el último registro");
        }
        else{
            contador++;
            mostrarDatos(lPersona.get(contador));
        }
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void bUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUltimoActionPerformed
        // cargar el último registro
        JOptionPane.showMessageDialog(this, "Este es el último registro");
        contador = lPersona.size()-1;
        mostrarDatos(lPersona.get(contador));
    }//GEN-LAST:event_bUltimoActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        //buscar persona
        try
        {
            // comprobar si el administrador ha rellenado el campo Usuario y cargar únicamente ese usuario, en caso contrario, array de todos los usuarios.
            if(tfUsuario.getText().equals("")){
                bPrimero.setEnabled(true);
                bAnterior.setEnabled(true);
                bSiguiente.setEnabled(true);
                bUltimo.setEnabled(true);
                lPersona = Main.consultarTodasLasPersonas();
                contador = 0;
                mostrarDatos(lPersona.get(0));
            }
            else{
                Persona p = Main.consultarPersona(tfUsuario.getText());
                if(p == null)
                {
                    throw new Excepcion(14);
                }
                // mostrar datos de la persona
                mostrarDatos(p);
            }
            // habilitar los campos si se ha accedido como modificación
            if(tipo == 2){
                tfNombre.setEnabled(true);
                tfApellido1.setEnabled(true);
                tfApellido2.setEnabled(true);
                pfContrasenna.setEnabled(true);
                tfEmail.setEnabled(true);
                cbPerfil.setEnabled(true);
            }
            bAceptar.setEnabled(true);
        }
        catch (Excepcion e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getClass());
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void mostrarDatos(Persona p) {
        tfUsuario.setText(p.getUsuario());
        pfContrasenna.setText(p.getContrasenna());
        tfNombre.setText(p.getNombre());
        tfApellido1.setText(p.getApellido1());
        tfApellido2.setText(p.getApellido2());
        tfEmail.setText(p.getEmail());
        ccFechaAlta.setDate(p.getFechaAlta());
        cbPerfil.setSelectedItem(p.getPerfil().getNombre());
        // comrpobar si es dueño, en caso afirmativo, mostrar su equipo
        if(cbPerfil.getSelectedItem().equals("Dueño"))
        {
            tfEquipo.setVisible(true);
        }
        Equipo eq = null;
        //eq = Main.consultarEquipoPorUsuario(p.getUsuario());
        if(p.getEquipo() != null){
            tfEquipo.setText(p.getEquipo().getNombre());
        }      
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bPrimero;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bUltimo;
    private javax.swing.JComboBox<String> cbPerfil;
    private org.freixas.jcalendar.JCalendarCombo ccFechaAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField tfEquipo;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

}
