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
public class Rol {

    int Id;
    String Nombre;

    String Descripcion;

  
    String tabla = this.getClass().getSimpleName();
    public Rol(){
        
    }
    public Rol(String Nombre, String Descripcion) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public Rol(int Id, String Nombre, String Descripcion) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    @Override
    public String toString(){
        return this.Nombre;
    }

  

}
