/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiocaso1;

/**
 *
 * @author jimec
 */
public class Facturas {
//Atributos
    public String nombreCliente;
    public int cedulaCliente;
    public int codigoFactura;
    public int montoFactura;

    public Facturas(String nombreCliente, int cedulaCliente, int codigoFactura, int montoFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }
   
        
        

    }

