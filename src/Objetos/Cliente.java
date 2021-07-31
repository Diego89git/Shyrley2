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
public class Cliente {
    String id;  
    String Nombre;
    String Apellido;
    String Correo;
    String direccion;
    
    
    String tabla = this.getClass().getSimpleName();
    public Cliente(){
        
    }

    public Cliente(String id, String Nombre, String Apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public Cliente(String id, String Nombre, String Apellido, String Correo, String direccion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    
}
