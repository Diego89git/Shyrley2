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
public class Usuario {

    int id;
    String Nombre;
    String Apellido;
    String correo;
    String contraseña;
    String direccion;
    String Numero_Celular;

    Rol rol;

    
    String tabla = this.getClass().getSimpleName();
public Usuario(){
    
}
    public Usuario(int id, String Nombre, String Apellido, String correo, String contraseña) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario(int id, String Nombre, String Apellido, String correo, String contraseña, String direccion, String Numero_Celular, Rol rol) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.Numero_Celular = Numero_Celular;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_Celular() {
        return Numero_Celular;
    }

    public void setNumero_Celular(String Numero_Celular) {
        this.Numero_Celular = Numero_Celular;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    

}
