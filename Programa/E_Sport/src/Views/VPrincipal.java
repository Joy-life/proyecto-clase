/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controladora.Main;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Ventana principal.
 * Fecha de creación de la vista: 24/04/2018
 * @author eqdaw04
 */
public class VPrincipal extends javax.swing.JFrame {

    
    public VPrincipal(int tipo,String usuario) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        NombreUsu.setText(usuario);
        switch(tipo)
        {
            case 1:
                equipos.setEnabled(false);
                break;
            case 2:
                administracion.setEnabled(false);
                break;
            case 3:
                administracion.setEnabled(false);
                equipos.setEnabled(false);                
                break;
        }
        
        ImageIcon fondo = new ImageIcon("../../../imagenes/fondo2.jpg");
        Icon icono = new ImageIcon (fondo.getImage().getScaledInstance(imgfondo.getWidth(), imgfondo.getHeight(), Image.SCALE_DEFAULT));
        imgfondo.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUsu = new javax.swing.JLabel();
        imgfondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        administracion = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        crearJugador = new javax.swing.JMenuItem();
        crearEquipo = new javax.swing.JMenuItem();
        crearUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        modificarJugador = new javax.swing.JMenuItem();
        modificarEquipo = new javax.swing.JMenuItem();
        modificarUsuario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        eliminarJugador = new javax.swing.JMenuItem();
        eliminarEquipo = new javax.swing.JMenuItem();
        eliminarUsuario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        verJugador = new javax.swing.JMenuItem();
        verEquipo = new javax.swing.JMenuItem();
        verUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        generarCalendario = new javax.swing.JMenuItem();
        introducirResultados = new javax.swing.JMenuItem();
        equipos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ver = new javax.swing.JMenu();
        verCalendario = new javax.swing.JMenuItem();
        verResultClasi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        setResizable(false);
        getContentPane().setLayout(null);

        bCerrarSesion.setText("Cerrar sesión");
        bCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(bCerrarSesion);
        bCerrarSesion.setBounds(420, 13, 109, 25);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 225, 180, 40);

        NombreUsu.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        NombreUsu.setForeground(new java.awt.Color(0, 102, 255));
        NombreUsu.setText("Nombre");
        getContentPane().add(NombreUsu);
        NombreUsu.setBounds(230, 220, 120, 44);
        getContentPane().add(imgfondo);
        imgfondo.setBounds(0, 0, 550, 400);

        administracion.setText("Administración");

        jMenu4.setText("Crear");

        crearJugador.setText("Jugador");
        crearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJugadorActionPerformed(evt);
            }
        });
        jMenu4.add(crearJugador);

        crearEquipo.setText("Equipo");
        crearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEquipoActionPerformed(evt);
            }
        });
        jMenu4.add(crearEquipo);

        crearUsuario.setText("Usuario");
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        jMenu4.add(crearUsuario);

        administracion.add(jMenu4);

        jMenu5.setText("Modificar");

        modificarJugador.setText("Jugador");
        modificarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarJugadorActionPerformed(evt);
            }
        });
        jMenu5.add(modificarJugador);

        modificarEquipo.setText("Equipo");
        modificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEquipoActionPerformed(evt);
            }
        });
        jMenu5.add(modificarEquipo);

        modificarUsuario.setText("Usuario");
        modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUsuarioActionPerformed(evt);
            }
        });
        jMenu5.add(modificarUsuario);

        administracion.add(jMenu5);

        jMenu6.setText("Eliminar");

        eliminarJugador.setText("Jugador");
        eliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarJugadorActionPerformed(evt);
            }
        });
        jMenu6.add(eliminarJugador);

        eliminarEquipo.setText("Equipo");
        eliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEquipoActionPerformed(evt);
            }
        });
        jMenu6.add(eliminarEquipo);

        eliminarUsuario.setText("Usuario");
        eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(eliminarUsuario);

        administracion.add(jMenu6);

        jMenu7.setText("Ver");

        verJugador.setText("Jugador");
        verJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verJugadorActionPerformed(evt);
            }
        });
        jMenu7.add(verJugador);

        verEquipo.setText("Equipo");
        verEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEquipoActionPerformed(evt);
            }
        });
        jMenu7.add(verEquipo);

        verUsuario.setText("Usuario");
        verUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verUsuarioActionPerformed(evt);
            }
        });
        jMenu7.add(verUsuario);

        administracion.add(jMenu7);
        administracion.add(jSeparator1);

        generarCalendario.setText("Generar Liga");
        generarCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarCalendarioActionPerformed(evt);
            }
        });
        administracion.add(generarCalendario);

        introducirResultados.setText("Introducir resultados");
        introducirResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introducirResultadosActionPerformed(evt);
            }
        });
        administracion.add(introducirResultados);

        jMenuBar1.add(administracion);

        equipos.setText("Equipos");

        jMenuItem1.setText("Modificar Equipo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        equipos.add(jMenuItem1);

        jMenuBar1.add(equipos);

        ver.setText("Ver");

        verCalendario.setText("Calendario");
        verCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCalendarioActionPerformed(evt);
            }
        });
        ver.add(verCalendario);

        verResultClasi.setText("Result. y Clasi.");
        verResultClasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verResultClasiActionPerformed(evt);
            }
        });
        ver.add(verResultClasi);

        jMenuBar1.add(ver);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJugadorActionPerformed
        try {
            Main.abrirVentana(1, "alta");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearJugadorActionPerformed

    private void crearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEquipoActionPerformed
        try {
            Main.abrirVentana(2, "alta");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearEquipoActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        try {
            Main.abrirVentana(3, "alta");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void modificarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarJugadorActionPerformed
        try {
            Main.abrirVentana(1, "modificacion");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarJugadorActionPerformed

    private void modificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEquipoActionPerformed
        try {
            Main.abrirVentana(2, "modificacion");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarEquipoActionPerformed

    private void modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUsuarioActionPerformed
        try {
            Main.abrirVentana(3, "modificacion");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarUsuarioActionPerformed

    private void eliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarJugadorActionPerformed
        try {
            Main.abrirVentana(1, "baja");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarJugadorActionPerformed

    private void eliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEquipoActionPerformed
        try {
            Main.abrirVentana(2, "baja");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarEquipoActionPerformed

    private void eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioActionPerformed
        try {
            Main.abrirVentana(3, "baja");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarUsuarioActionPerformed

    private void verJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verJugadorActionPerformed
        try {
            Main.abrirVentana(1, "listado");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verJugadorActionPerformed

    private void verEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEquipoActionPerformed
        try {
            Main.abrirVentana(2, "listado");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verEquipoActionPerformed

    private void verUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verUsuarioActionPerformed
        try {
            Main.abrirVentana(3, "listado");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_verUsuarioActionPerformed

    private void introducirResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introducirResultadosActionPerformed
        // Abrir la ventana para la introduccion de los resultados de los partidos
        
        try {
            Main.abrirVentana(6, "resultado");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_introducirResultadosActionPerformed

    private void verCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCalendarioActionPerformed
        // TODO add your handling code here:
        // Abrir ventana
    }//GEN-LAST:event_verCalendarioActionPerformed

    private void verResultClasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verResultClasiActionPerformed
        // TODO add your handling code here:
        // Abrir ventana
    }//GEN-LAST:event_verResultClasiActionPerformed

    private void bCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarSesionActionPerformed
        Main.cerrarSesion(this);
    }//GEN-LAST:event_bCerrarSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Main.abrirVentana(5, NombreUsu.getText());
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void generarCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarCalendarioActionPerformed
        try {
            Main.abrirVentana(7, "");
        } catch (Exception ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generarCalendarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreUsu;
    private javax.swing.JMenu administracion;
    private javax.swing.JButton bCerrarSesion;
    private javax.swing.JMenuItem crearEquipo;
    private javax.swing.JMenuItem crearJugador;
    private javax.swing.JMenuItem crearUsuario;
    private javax.swing.JMenuItem eliminarEquipo;
    private javax.swing.JMenuItem eliminarJugador;
    private javax.swing.JMenuItem eliminarUsuario;
    private javax.swing.JMenu equipos;
    private javax.swing.JMenuItem generarCalendario;
    private javax.swing.JLabel imgfondo;
    private javax.swing.JMenuItem introducirResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem modificarEquipo;
    private javax.swing.JMenuItem modificarJugador;
    private javax.swing.JMenuItem modificarUsuario;
    private javax.swing.JMenu ver;
    private javax.swing.JMenuItem verCalendario;
    private javax.swing.JMenuItem verEquipo;
    private javax.swing.JMenuItem verJugador;
    private javax.swing.JMenuItem verResultClasi;
    private javax.swing.JMenuItem verUsuario;
    // End of variables declaration//GEN-END:variables
}
