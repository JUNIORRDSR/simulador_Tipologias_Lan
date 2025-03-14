/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulador;

import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class Red {
    private String nombre;
    private String estandar;
    private String velocidadTransmision;
    private String soporteTransmision;
    private String controlAcceso;
    private ArrayList<Dispositivo> Dispositivos = new ArrayList();

    public Red(String nombre, String estandar, String velocidadTransmision, String soporteTransmision, String controlAcceso) {
        this.nombre = nombre;
        this.estandar = estandar;
        this.velocidadTransmision = velocidadTransmision;
        this.soporteTransmision = soporteTransmision;
        this.controlAcceso = controlAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public String getVelocidadTransmision() {
        return velocidadTransmision;
    }

    public void setVelocidadTransmision(String velocidadTransmision) {
        this.velocidadTransmision = velocidadTransmision;
    }

    public String getSoporteTransmision() {
        return soporteTransmision;
    }

    public void setSoporteTransmision(String soporteTransmision) {
        this.soporteTransmision = soporteTransmision;
    }

    public String getControlAcceso() {
        return controlAcceso;
    }

    public void setControlAcceso(String controlAcceso) {
        this.controlAcceso = controlAcceso;
    }
    
    public void AgregarDispositivo(Dispositivo dispositivo){
        Dispositivos.add(dispositivo);
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return Dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> Dispositivos) {
        this.Dispositivos = Dispositivos;
    }
    
    
    
    public String ListarDispositivos(){
        String text= "";
        for (Dispositivo d : Dispositivos){
            text += d.getId()+"\n";
        }
        return text;
    }
    
    public void Visualizar(){};
    
    
    
}

