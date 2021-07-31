/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Objetos.*;

/**
 *
 * @author Personal
 */
public class PruebaInserciones {
    
    
    public static void main(String[] args) {
        Insertar_db ins= new Insertar_db("Rol");
        /*Rol rll= new Rol();
        rll.setId(0);
        rll.setNombre("Pruebarol");
        rll.setDescripcion("Detalle de rol");
        System.out.println(ins.insertarRol(rll)); */
        
        Consultar_db con= new Consultar_db("Rol");
        Rol rol= new Rol();
           rol=con.consultarRol(2);
        
        
        Usuario us= new Usuario();
        us.setId(0);
        us.setNombre("NomPrueba2");
        us.setApellido("ApePrueba2");
        us.setCorreo("CorrPrueba2");
        us.setContraseña("pass2");
        us.setDireccion("dirPrueb2");
        us.setNumero_Celular("999999992");
        us.setRol(rol);
        System.out.println(ins.insertarUsuario(us));
        
        
        
    }
    
    
}
