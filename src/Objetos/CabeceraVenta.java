/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class CabeceraVenta {
    int Id;
         Cliente cliente;
          String Tipodecomprobante;
          int Numerocomprobante;
     Date fecha;
    
   
     
     
      String tabla = this.getClass().getSimpleName();
     
      public CabeceraVenta(){
          
      }

    public CabeceraVenta(int Id, Cliente cliente, String Tipodecomprobante) {
        this.Id = Id;
        this.cliente = cliente;
        this.Tipodecomprobante = Tipodecomprobante;
    }

    public CabeceraVenta(int Id, Cliente cliente, String Tipodecomprobante, int Numerocomprobante, Date fecha) {
        this.Id = Id;
        this.cliente = cliente;
        this.Tipodecomprobante = Tipodecomprobante;
        this.Numerocomprobante = Numerocomprobante;
        this.fecha = fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipodecomprobante() {
        return Tipodecomprobante;
    }

    public void setTipodecomprobante(String Tipodecomprobante) {
        this.Tipodecomprobante = Tipodecomprobante;
    }

    public int getNumerocomprobante() {
        return Numerocomprobante;
    }

    public void setNumerocomprobante(int Numerocomprobante) {
        this.Numerocomprobante = Numerocomprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

  

      
}
