/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Coneccion {
     String driver = "com.mysql.jdbc.Driver";
    String direccionDB = "jdbc:mysql://localhost:3306/proyecto";
    String user = "root";
    String password = "";
    Connection cn = null;

    public Connection conectar() {
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(direccionDB, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede establecer la conección" + e.getMessage(),
                    "Error de coneccion", JOptionPane.ERROR_MESSAGE);
        }

        return cn;
    }

    public ResultSet consultaDatos(String consulta) {
        cn=conectar();
        Statement st = null;
        ResultSet rs = null;
    
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consulta);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede establecer la conección" + e.getMessage(),
                    "Error de conSULTAR dATOS", JOptionPane.ERROR_MESSAGE);
        }

        return rs;
    }

    public void desconectar() {
        try {
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en desconectar" + e.getMessage(),
                    "Error de conSULTAR dATOS", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarDatos(String consulta) {
        cn=conectar();
        Statement st = null;
        
        try {
            st = cn.createStatement();
            st.executeUpdate(consulta);
          cn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en insertar" + e.getMessage(),
                    "Error de conSULTAR dATOS", JOptionPane.ERROR_MESSAGE);
        }

    }
    
 

}
