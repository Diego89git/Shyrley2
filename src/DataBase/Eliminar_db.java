/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Conecciones.Coneccion;
import Objetos.Auditoria;
import Objetos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio
 */
public class Eliminar_db {
         //sentencias
    String tabla;
    String parametros;
    String sentencia = "Delete from ";
    String condicionGeneral = " Where id= ";
    //TABLAS
    Usuario usuario;
    
    Coneccion cn = new Coneccion();
    ResultSet datos;

    public Eliminar_db (String tabla, Usuario us) {
        this.tabla = tabla;
        this.usuario=us;
        this.sentencia = this.sentencia + tabla+this.condicionGeneral;
    }

    public boolean eliminarObjeto(int id) {
        Auditoria ad;
        try {
            ad = new Auditoria( usuario, "Eliminacion", tabla, "Se elimino un registro de "+tabla+" : con Id("+id+")s" );
            ad.insertar();
        } catch (Exception e) {
            return false;
        }
        
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia+id);
            int res = pst.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Insertar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
 
}
