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
public class CabeceraCompra {
    int Id;
    String Tipodecomprobante;
      String Numerocomprobante;
        Proveedor proveedor;
    Date Fecha;
  

      
    String tabla = this.getClass().getSimpleName();
    public CabeceraCompra(){
        
    }

    public CabeceraCompra(int Id, String Tipodecomprobante, String Numerocomprobante) {
        this.Id = Id;
        this.Tipodecomprobante = Tipodecomprobante;
        this.Numerocomprobante = Numerocomprobante;
    }

    public CabeceraCompra(int Id, String Tipodecomprobante, String Numerocomprobante, Proveedor proveedor, Date Fecha) {
        this.Id = Id;
        this.Tipodecomprobante = Tipodecomprobante;
        this.Numerocomprobante = Numerocomprobante;
        this.proveedor = proveedor;
        this.Fecha = Fecha;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTipodecomprobante() {
        return Tipodecomprobante;
    }

    public void setTipodecomprobante(String Tipodecomprobante) {
        this.Tipodecomprobante = Tipodecomprobante;
    }

    public String getNumerocomprobante() {
        return Numerocomprobante;
    }

    public void setNumerocomprobante(String Numerocomprobante) {
        this.Numerocomprobante = Numerocomprobante;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
 }
   