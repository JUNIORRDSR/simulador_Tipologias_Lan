/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulador;

/**
 *
 * @author junio
 */
public class Dispositivo {
    private String id;
    private String tipoDispositivo;
    private String direccionIP;
    private String direccionMAC;

    public Dispositivo(String id, String tipoDispositivo, String direccionIP, String direccionMAC) {
        this.id = id;
        this.tipoDispositivo = tipoDispositivo;
        this.direccionIP = direccionIP;
        this.direccionMAC = direccionMAC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    
}
