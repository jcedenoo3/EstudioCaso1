/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiocaso1;

import javax.swing.JOptionPane;

/**
 *
 * @author jimec
 */
public class EstudioCaso1 {

    public static void main(String[] args) {
        
        //informacion del agente
        String nombreAgente = JOptionPane.showInputDialog("Nombre del agente");
        int cedulaAgente = Integer.parseInt(JOptionPane.showInputDialog("Cedula agente:"));
        int codigoAgente = Integer.parseInt(JOptionPane.showInputDialog("Codigo agente:"));
        String sucursal = JOptionPane.showInputDialog("Sucursal");
        String vehiculo = JOptionPane.showInputDialog("Cuenta con vehiculo propio (si/no)");
        
        Agente agente = new Agente(nombreAgente, cedulaAgente, codigoAgente, sucursal, vehiculo);
        
        
   
        
        //informacion del cliente
        String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente");
        int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Cedula cliente:"));
        int codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Codigo factura:"));
        int montoFactura = Integer.parseInt(JOptionPane.showInputDialog("Monto de la factura:"));
       

                

        
        
   

        
        

        

        
        
        
        }
    }


