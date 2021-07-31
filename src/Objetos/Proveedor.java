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
public class Proveedor {
 
    String identificacion;
    String Tipo_Identificacion;
    String Nombre_Comercial;
    String Representante;
    
    
    
    String tabla = this.getClass().getSimpleName();
public Proveedor(){
    
}
    public Proveedor(String identificacion, String Tipo_Identificacion, String Nombre_Comercial) {
        this.identificacion = identificacion;
        this.Tipo_Identificacion = Tipo_Identificacion;
        this.Nombre_Comercial = Nombre_Comercial;
    }

    public Proveedor(String identificacion, String Tipo_Identificacion, String Nombre_Comercial, String Representante) {
        this.identificacion = identificacion;
        this.Tipo_Identificacion = Tipo_Identificacion;
        this.Nombre_Comercial = Nombre_Comercial;
        this.Representante = Representante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo_Identificacion() {
        return Tipo_Identificacion;
    }

    public void setTipo_Identificacion(String Tipo_Identificacion) {
        this.Tipo_Identificacion = Tipo_Identificacion;
    }

    public String getNombre_Comercial() {
        return Nombre_Comercial;
    }

    public void setNombre_Comercial(String Nombre_Comercial) {
        this.Nombre_Comercial = Nombre_Comercial;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

   
    
}
