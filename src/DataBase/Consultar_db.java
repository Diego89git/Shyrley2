/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Conecciones.Coneccion;
import Objetos.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author St
 */
public class Consultar_db {

    String tabla;
    String instruccion = "Select * from ";
    String condicionGeneral = " Where id= ";
    String condisiones = "";

    Coneccion cn = new Coneccion();
    ResultSet datos;

    public Consultar_db(String tabla) {
        this.tabla = tabla;
    }

    public Consultar_db(String tabla, String condisiones) {
        this.tabla = tabla;
        this.condisiones = condisiones;
    }
    
    public ArrayList<Usuario> consultarUsuarios() {
        ArrayList<Usuario> uss = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        Connection con = cn.conectar();
        Usuario us;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                us = new Usuario();

                us.setId(datos.getInt(1));
                us.setNombre(datos.getString(2));
                us.setApellido(datos.getString(3));
                us.setCorreo(datos.getString(4));
                us.setContraseña(datos.getString(5));
                us.setNumero_Celular(datos.getString(6));
                us.setRol(new Consultar_db("rol").consultarRol(datos.getInt(7)));

                uss.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uss;
    }
    public ArrayList<Rol> consultarRol() {
        ArrayList<Rol> pfs = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        Connection con = cn.conectar();
        Rol pf;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                pf = new Rol();

                pf.setId(datos.getInt(1));
                pf.setNombre(datos.getString(2));
                pf.setDescripcion(datos.getString(3));

                pfs.add(pf);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pfs;
    }
    public ArrayList<Proveedor> consultarProveedores() {
        ArrayList<Proveedor> pss = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        System.out.println(consulta);
        Proveedor ps;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                ps = new Proveedor();

                ps.setIdentificacion(datos.getString(1));
                ps.setTipo_Identificacion(datos.getString(2));

                ps.setNombre_Comercial(datos.getString(3));

                ps.setRepresentante(datos.getString(4));

                pss.add(ps);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pss;
    }
    public ArrayList<Cliente> consultarClientes() {
        ArrayList<Cliente> c = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        System.out.println(consulta);
        Cliente cc;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                cc = new Cliente();

                cc.setId(datos.getString(1));
                cc.setNombre(datos.getString(2));

                cc.setApellido(datos.getString(3));

                cc.setCorreo(datos.getString(4));
                cc.setDireccion(datos.getString(5));

                c.add(cc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public ArrayList<CabeceraCompra> consultarCabeceraCompra() {
        ArrayList<CabeceraCompra> ccs = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        CabeceraCompra cc = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                cc = new CabeceraCompra();

                cc.setId(datos.getInt(1));

                cc.setTipodecomprobante(datos.getString(2));
                cc.setNumerocomprobante(datos.getString(3));
                cc.setProveedor(new Consultar_db("proveedor").consultarProveedor(datos.getString(4)));

                cc.setFecha(datos.getDate(5));

                ccs.add(cc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ccs;
    }
    public ArrayList<DetalleVenta> consultarDetalleVentas() {                  //
        ArrayList<DetalleVenta> dvs = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        DetalleVenta dv = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                dv = new DetalleVenta();

                dv.setId(datos.getInt(1));
                dv.setIdCabeceraVenta(datos.getInt(2));
                dv.setProducto(new Consultar_db("producto").consultarProductos(datos.getString(3)));
                dv.setCantidad(datos.getInt(4));
                dv.setPrecioUnitario(datos.getInt(5));
                dv.setPrecio_Total(datos.getInt(6));

                dvs.add(dv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dvs;
    }
    public ArrayList<DetalleCompra> consultarDetalleCompras() {                  //
        ArrayList<DetalleCompra> dcs = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        DetalleCompra dc = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                dc = new DetalleCompra();

                dc.setId(datos.getInt(1));
                dc.setIdCabeceraCompra(datos.getInt(2));
                dc.setProducto(new Consultar_db("producto").consultarProductos(datos.getString(3)));
                dc.setCantidad(datos.getInt(4));
                dc.setPrecioUnitario(datos.getInt(5));
                dc.setPrecio_Total(datos.getInt(6));

                dcs.add(dc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dcs;
    }
    public ArrayList<CabeceraVenta> consultarCabeceraVentas() {
        ArrayList<CabeceraVenta> ccs = new ArrayList();
        String consulta = instruccion + tabla + condisiones;
        CabeceraVenta cv = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {

                cv = new CabeceraVenta();

                cv.setId(datos.getInt(1));
                cv.setCliente(new Consultar_db("cliente").consultarCliente(datos.getString(2)));
                cv.setTipodecomprobante(datos.getString(3));
                cv.setNumerocomprobante(datos.getInt(4));

                cv.setFecha(datos.getDate(5));

                ccs.add(cv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ccs;
    }
    public ArrayList<Producto> consultarProductos() {
        ArrayList<Producto> pds = new ArrayList();
        String consulta = instruccion + tabla + condisiones;

        Producto pd;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                pd = new Producto();

                pd.setCodigo(datos.getString(1));
                pd.setDescripcion(datos.getString(2));
                pd.setCategoria(datos.getString(3));
                pd.setModelo(datos.getString(4));

                pds.add(pd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pds;
    }

    public CabeceraCompra consultarCabeceraCompras(int Id) {

        String consulta = instruccion + tabla + " WHERE Identificación='" + Id + "'";
        System.out.println(consulta);
        CabeceraCompra cc = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            cc = new CabeceraCompra();
            cc.setId(datos.getInt(1));

            cc.setProveedor(new Consultar_db("proveedor").consultarProveedor(datos.getString(2)));
            cc.setTipodecomprobante(datos.getString(3));
            cc.setNumerocomprobante(datos.getString(4));
            cc.setFecha(datos.getDate(5));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
    public CabeceraVenta consultarCabeceraVentas(String Cliente) {

        String consulta = instruccion + tabla + " WHERE Identificación='" + Cliente + "'";
        System.out.println(consulta);
        CabeceraVenta cc = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            cc = new CabeceraVenta();

            cc.setId(datos.getInt(1));
            cc.setCliente(new Consultar_db("cliente").consultarCliente(datos.getString(2)));
            cc.setTipodecomprobante(datos.getString(3));
            cc.setNumerocomprobante(datos.getInt(4));

            cc.setFecha(datos.getDate(5));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
    public Usuario consultarUsuario() {

        String consulta = instruccion + tabla + condisiones;
        Connection con = cn.conectar();
        Usuario us = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                us = new Usuario();

                us.setId(datos.getInt(1));
                us.setNombre(datos.getString(2));
                us.setApellido(datos.getString(3));
                us.setCorreo(datos.getString(4));
                us.setContraseña(datos.getString(5));
                us.setNumero_Celular(datos.getString(6));
                us.setRol(new Consultar_db("rol").consultarRol(datos.getInt(7)));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }
    public Cliente consultarCliente(String Id) {

        String consulta = instruccion + tabla + " WHERE Identificacion='" + Id + "'";
        System.out.println(consulta);
        Cliente c = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            c = new Cliente();                              //Poner en todos los objetos

            c = new Cliente();

            c.setId(datos.getString(1));
            c.setNombre(datos.getString(2));

            c.setApellido(datos.getString(3));

            c.setCorreo(datos.getString(4));
            c.setDireccion(datos.getString(4));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public Rol consultarRol(int Id) {
        String consulta = instruccion + "rol" + " WHERE Id='" + Id + "'";
        Rol pf = new Rol();
        ResultSet dato = cn.consultaDatos(consulta);
        try {
            if (!dato.next()) {
                return null;
            }
            pf.setId(dato.getInt(1));
            pf.setNombre(dato.getString(2));
            pf.setDescripcion(dato.getString(3));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pf;
    }
    public DetalleCompra consultarDetalleCompra(int IdProducto) {
        String consulta = instruccion + tabla + " WHERE Identificación='" + IdProducto + "'";
        System.out.println(consulta);
        DetalleCompra dc = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            dc = new DetalleCompra();
            dc.setId(datos.getInt(1));
            dc.setIdCabeceraCompra(datos.getInt(2));
            dc.setProducto(new Consultar_db("producto").consultarProductos(datos.getString(3)));
            dc.setCantidad(datos.getInt(4));
            dc.setPrecioUnitario(datos.getInt(5));
            dc.setPrecio_Total(datos.getInt(6));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dc;
    }
    public DetalleVenta consultarDetalleVenta(int DetProducto) {
        String consulta = instruccion + tabla + " WHERE Identificación='" + DetProducto + "'";
        System.out.println(consulta);
        DetalleVenta dv = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            dv = new DetalleVenta();
            dv.setId(datos.getInt(1));
            dv.setIdCabeceraVenta(datos.getInt(2));
            dv.setProducto(new Consultar_db("producto").consultarProductos(datos.getString(3)));
            dv.setCantidad(datos.getInt(4));
            dv.setPrecioUnitario(datos.getInt(5));
            dv.setPrecio_Total(datos.getInt(6));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dv;
    }
    public Producto consultarProductos(String Codigo) {

        String consulta = instruccion + tabla + " WHERE Codigo='" + Codigo + "'";

        Producto pd = null;
        datos = cn.consultaDatos(consulta);
        try {
            while (datos.next()) {
                pd = new Producto();

                pd.setCodigo(datos.getString(1));
                pd.setCodigo(datos.getString(2));
                pd.setCategoria(datos.getString(3));
                pd.setModelo(datos.getString(4));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd;
    }
    public Proveedor consultarProveedor(String Id) {

        String consulta = instruccion + tabla + " WHERE Identificacion='" + Id + "'";
        System.out.println(consulta);
        Proveedor ps = null;
        datos = cn.consultaDatos(consulta);
        try {
            if (!datos.next()) {
                return null;
            }
            ps = new Proveedor();                              //Poner en todos los objetos

            ps.setIdentificacion(datos.getString(1));
            ps.setTipo_Identificacion(datos.getString(2));

            ps.setNombre_Comercial(datos.getString(3));

            ps.setRepresentante(datos.getString(4));

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

}
