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
public class Producto {
   
    String codigo;
    String Descripcion;
    String Categoria;
    String Modelo;
    
    
   
    String tabla = this.getClass().getSimpleName();
public Producto(){
    
}
    public Producto(String codigo, String Descripcion, String Categoria) {
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
    }

    public Producto(String codigo, String Descripcion, String Categoria, String Modelo) {
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        this.Categoria = Categoria;
        this.Modelo = Modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

   

    
}
