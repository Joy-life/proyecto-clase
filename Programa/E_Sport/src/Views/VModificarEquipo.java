/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controladora.Main;
import Excepciones.*;
import UML.Equipo;
import UML.Jugador;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Vista para la modificacion de equipos.
 * Fecha de creación de la vista: 24/04/2018
 * @author eqdaw04
 */
public class VModificarEquipo extends javax.swing.JFrame {

    /**
     * Creates new form ModificarEquipo
     */
    private static Equipo e;
    //array de jugadores integrantes del equipo
    private static ArrayList<Jugador> jEquipo;
    //array de jugadores disponibles
    private static ArrayList<Jugador> jDisp;
    
    /**
     * Metodo para modificar equipo.
     * @param usu String
     * @throws Exception 
     */
            
    public VModificarEquipo(String usu) throws Exception {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        e= Main.ConsultarEquipoPorUsuario(usu);
        nombeEquipo.setText(e.getNombre());
        rellenar();
        
        ImageIcon fondo = new ImageIcon("../../../imagenes/fondo2.jpg");
        Icon icono = new ImageIcon (fondo.getImage().getScaledInstance(imgfondo.getWidth(), imgfondo.getHeight(), Image.SCALE_DEFAULT));
        imgfondo.setIcon(icono);
        this.repaint();
    }

    private VModificarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombeEquipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liJugEqui = new javax.swing.JList<String>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liJugDisp = new javax.swing.JList<String>();
        jLabel3 = new javax.swing.JLabel();
        bEliminar = new javax.swing.JButton();
        bAnnadir = new javax.swing.JButton();
        bConsultar = new javax.swing.JButton();
        tfSueldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        imgfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(843, 547));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        jLabel1.setText("Modificar Equipo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 30, 270, 40);

        nombeEquipo.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        nombeEquipo.setForeground(new java.awt.Color(51, 102, 255));
        nombeEquipo.setText("NOMBREEQUIPO");
        getContentPane().add(nombeEquipo);
        nombeEquipo.setBounds(420, 30, 230, 44);

        liJugEqui.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        liJugEqui.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        liJugEqui.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                liJugEquiFocusGained(evt);
            }
        });
        liJugEqui.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                liJugEquiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(liJugEqui);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(62, 170, 258, 214);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Jugadores en el equipo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 140, 220, 21);

        liJugDisp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        liJugDisp.setToolTipText("");
        liJugDisp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                liJugDispFocusGained(evt);
            }
        });
        liJugDisp.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                liJugDispValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(liJugDisp);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(509, 170, 258, 214);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Sueldo del jugador:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 420, 190, 21);

        bEliminar.setText("Eliminar Jugador");
        bEliminar.setEnabled(false);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bEliminar);
        bEliminar.setBounds(100, 460, 150, 25);

        bAnnadir.setText("Añadir Jugador");
        bAnnadir.setEnabled(false);
        bAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnadirActionPerformed(evt);
            }
        });
        getContentPane().add(bAnnadir);
        bAnnadir.setBounds(580, 460, 150, 25);

        bConsultar.setText("Consultar");
        bConsultar.setEnabled(false);
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(bConsultar);
        bConsultar.setBounds(360, 250, 110, 25);

        tfSueldo.setText("Sueldo");
        getContentPane().add(tfSueldo);
        tfSueldo.setBounds(410, 420, 110, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Jugadores Disponibles:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 140, 220, 21);

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir);
        bSalir.setBounds(380, 500, 73, 25);
        getContentPane().add(imgfondo);
        imgfondo.setBounds(0, 0, 840, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnadirActionPerformed
        try{
            if(Main.AnnadirJugadorEquipo(liJugDisp.getSelectedValue(),String.valueOf(e.getIdEquipo()))){
                JOptionPane.showMessageDialog(this, "Jugador añadido exitosamente");
                rellenar();
            }
        }  catch (SQLException e){
               switch(e.getErrorCode()){
                   case 20001:
                    JOptionPane.showMessageDialog(this, new Excepcion(28).getMessage());
                       break;
                    case 20002:
                    JOptionPane.showMessageDialog(this, new Excepcion(29).getMessage());
                       break;
               }
        }catch (Exception ex) {
                Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("AÑADIR");

        }
        bAnnadir.setEnabled(false);
    }//GEN-LAST:event_bAnnadirActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if(Main.EliminarJugadorEquipo(liJugEqui.getSelectedValue())){
            JOptionPane.showMessageDialog(this, "Jugador eliminado exitosamente");
            try {
                rellenar();
            } catch (Exception ex) {
                Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ELIMINAR");
            }
            bEliminar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "Error2");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void liJugEquiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liJugEquiValueChanged
        bEliminar.setEnabled(true);
        bConsultar.setEnabled(true);
        bAnnadir.setEnabled(false);
        liJugDisp.clearSelection();
        tfSueldo.setText(String.valueOf(jEquipo.get(liJugEqui.getSelectedIndex()).getSueldo()));
    }//GEN-LAST:event_liJugEquiValueChanged

    private void liJugDispValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_liJugDispValueChanged
        bEliminar.setEnabled(false);
        bConsultar.setEnabled(true);
        bAnnadir.setEnabled(true);
        liJugEqui.clearSelection();
        tfSueldo.setText(String.valueOf(jDisp.get(liJugDisp.getSelectedIndex()).getSueldo()));
    }//GEN-LAST:event_liJugDispValueChanged

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        System.out.println(liJugEqui.getSelectedValue()+liJugDisp.getSelectedValue());
        if(liJugEqui.isSelectionEmpty()){
            try { 
                liJugEqui.clearSelection();
                Main.abrirVJugador(Main.consultarJugadorNickname(liJugDisp.getSelectedValue()));
            } catch (Exception ex) {
                Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ 
            try {
                liJugDisp.clearSelection();
                Main.abrirVJugador(Main.consultarJugadorNickname(liJugEqui.getSelectedValue())); 
            } catch (Exception ex) {
                Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
 
    }//GEN-LAST:event_bConsultarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        Main.cerrar2(this);
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void liJugEquiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_liJugEquiFocusGained

    }//GEN-LAST:event_liJugEquiFocusGained

    private void liJugDispFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_liJugDispFocusGained

    }//GEN-LAST:event_liJugDispFocusGained

    /**
     * @param args the command line arguments
     */
    private void rellenar() throws Exception{
        //No entiendo muy bien porque, pero sipongo directamente el codigo el segundo modelo (sea cual sea) no funciona correctamente
        rellenar1();
        rellenar2();    
    }
    
    /**
     * Metodo para buscar los jugadores que forman el equipo y rellenar una lista con ellos. 
     */
    private void rellenar1(){
        try {
            jEquipo=new ArrayList();
            jEquipo=Main.obtenerJugEqui(String.valueOf(e.getIdEquipo()));
            DefaultListModel<String> model = new DefaultListModel();
            for (int x=0;x < jEquipo.size();x++){
                model.addElement(jEquipo.get(x).getNickname());
            }
            liJugEqui.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo para buscar jugadores sin equipo y rellenar una lista con ellos.
     */
    
    private void rellenar2(){
        try {
            jDisp=new ArrayList();
            jDisp=Main.consultarJugadoresDisponibles();
            DefaultListModel<String> modelo = new DefaultListModel();
            for (int y=0;y< jDisp.size();y++){
                modelo.addElement(jDisp.get(y).getNickname());
            }
            liJugDisp.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(VModificarEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnnadir;
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel imgfondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> liJugDisp;
    private javax.swing.JList<String> liJugEqui;
    private javax.swing.JLabel nombeEquipo;
    private javax.swing.JTextField tfSueldo;
    // End of variables declaration//GEN-END:variables
}
