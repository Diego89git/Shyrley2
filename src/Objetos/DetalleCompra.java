/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Personal
 */
public class DetalleCompra {
    int id;
     int IdCabeceraCompra;
         Producto producto;
    int Cantidad;
    int PrecioUnitario;
   
    int Precio_Total;

  
    String tabla = this.getClass().getSimpleName();
    public DetalleCompra(){
        
    }

    public DetalleCompra(int id, int Cantidad, int PrecioUnitario, int IdCabeceraCompra) {
        this.id = id;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.IdCabeceraCompra = IdCabeceraCompra;
    }

    public DetalleCompra(int id, int Cantidad, int PrecioUnitario, int IdCabeceraCompra, int Precio_Total, Producto producto) {
        this.id = id;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.IdCabeceraCompra = IdCabeceraCompra;
        this.Precio_Total = Precio_Total;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(int PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getIdCabeceraCompra() {
        return IdCabeceraCompra;
    }

    public void setIdCabeceraCompra(int IdCabeceraCompra) {
        this.IdCabeceraCompra = IdCabeceraCompra;
    }

    public int getPrecio_Total() {
        return Precio_Total;
    }

    public void setPrecio_Total(int Precio_Total) {
        this.Precio_Total = Precio_Total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

  
  
}
