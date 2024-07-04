/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiocaso1;

/**
 *
 * @author jimec
 */
public class Agente {
    
    public String nombreAgente;
    public int cedulaAgente;
    public int codigoAgente;
    public String sucursal;
    public String vehiculo;

    public Agente(String nombreAgente, int cedulaAgente, int codigoAgente, String sucursal, String vehiculo) {
        this.nombreAgente = nombreAgente;
        this.cedulaAgente = cedulaAgente;
        this.codigoAgente = codigoAgente;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getCedulaAgente() {
        return cedulaAgente;
    }

    public void setCedulaAgente(int cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    
}
