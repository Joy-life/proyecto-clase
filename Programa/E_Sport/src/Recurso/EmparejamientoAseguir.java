/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recurso;

import UML.Equipo;
import UML.Jornada;
import UML.Partido;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author v6222
 */
public class EmparejamientoAseguir {
    
    int dia;
    ArrayList <Equipo> lEquipo;
    Jornada[] lJornada;
    Partido[] lPartido;
    String base, local, visitante;
    
    public EmparejamientoAseguir() {
    }

    public EmparejamientoAseguir(int dia, ArrayList<Equipo> listaEquipo) {
        this.dia = dia;
        this.lEquipo = listaEquipo;
    }
    
    public void calcularPartido(){
        int e = lEquipo.size();
        // obtener numero de jornadas, partidos y crear Array
        int j = (e-1)*2;
        lJornada = new Jornada[j];
        int p = e-1;
        lPartido = new Partido[p];
        // establecemos que 1 jornada = 1 semana = 7 días
        extraerEquipo();
        desordenar(e);
    }
    
    
    
    public void extraerEquipo(){
        String dato = "";
        for(int x = 1; x < lEquipo.size()+1 ; x++){
            
            for(int y = 1+x; y< lEquipo.size()+1 ; y++){
                dato += x + "x" + y + " ";
            }
        }
        base = dato;
    }
    
    public boolean comprobarEquipo(String dato){
        boolean existe = false;
        if(base.contains(dato)){
            existe = true;
        }
        return existe;
    }
    
    public void desordenar(int e){
        //desordenar numero equipo
        Collections.shuffle(lEquipo);
        //random del rango del tamaño del array para seleccionar una posicion aleatoria del array para el primer array
        Random rand = new Random();
        int a1 = rand.nextInt(e-1);
        //random igual al anterior excluyendo el número a1
        int a2;
        do{
            a2 = rand.nextInt(e-1);
        }
        while(a2==a1);
        int n = 0;
        for(int x = a1+1; x!=a1; x++){
            if(x==lEquipo.size()){
                x = 0;
            }
            
            if((a1+n) == lEquipo.size()){
                n = a1/-1;
            }
            asignarEquipo(a1+n,a2);
            n++;
        }
        asignarEquipo(a1-1,a2);
        JOptionPane.showMessageDialog(null, visitante);
    }
    
    public void asignarEquipo(int a1, int a2){
        String dato;
        if(lEquipo.get(a1) != lEquipo.get(a2)){
            dato = lEquipo.get(a1).getIdEquipo() + "x" + lEquipo.get(a2).getIdEquipo();
            
            if(comprobarEquipo(dato)){
                local +=  " " + dato;
            }
            else{
                visitante +=  " " + dato;
            }
        }
        
        for(int x = a2+1; x!=a2 ; x++){
            if(x==lEquipo.size()){
                x=0;
            }
            if(lEquipo.get(a1) != lEquipo.get(x)){
                dato = lEquipo.get(a1).getIdEquipo() + "x" + lEquipo.get(a2).getIdEquipo();
                JOptionPane.showMessageDialog(null, dato);
                if(comprobarEquipo(dato)){
                    local += " " + dato;
                }
                else{
                    visitante +=  " " + dato;
                }
            }
        }
    }

    
}
