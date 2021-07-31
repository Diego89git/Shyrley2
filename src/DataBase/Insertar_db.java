/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Conecciones.Coneccion;
import Objetos.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio
 */
public class Insertar_db {

    //sentencias
    String tabla;
   
    //TABLAS
    Usuario usuario;

    Coneccion cn = new Coneccion();
    ResultSet datos;

    public Insertar_db(String tabla) {
        this.tabla = tabla;
    }
    public boolean insertarRol(Rol rol) {
        String sentencia="INSERT INTO rol (Id, Nombre, Descripción) VALUES ('"+rol.getId()+"', '"+rol.getNombre()+"', '"+rol.getDescripcion()+"')";
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareStatement(sentencia);
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
    public boolean insertarUsuario(Usuario usu) {
        String sentencia="INSERT INTO usuario (Id, Nombre, Apellido, Correo, Contraseña, Dirección, Numerodecelular, idRol) VALUES ('"+usu.getId()+"', '"+usu.getNombre()+"', '"+usu.getApellido()+"', '"+usu.getCorreo()+"', '"+usu.getContraseña()+"', '"+usu.getDireccion()+"', '"+usu.getNumero_Celular()+"', '"+usu.getRol().getId()+"')";
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareStatement(sentencia);
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
    public boolean insertarPuntoEmision(PuntoEmision pe){
       PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, pe.obtenerDescripcion());
            pst.setString(2, pe.obtenerSerieFactura());
            pst.setString(3, pe.obtenerSerieNotaCredito());
            pst.setString(4, pe.obtenerSerieRetencion());
            pst.setInt(5, pe.obtenerSecuencialFactura());
            pst.setInt(6, pe.obtenerSecuencialNotaCredito());
            pst.setInt(7, pe.obtenerSecuencialRetencion());
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
    public boolean insertarAsignacion(Asignacion as){
       PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, as.obtenerUsuario().obtenerId());
            pst.setInt(2, as.obtenerPerfil().obtenerId());
            pst.setInt(3, as.obtenerPuntoEmision().obtenerId());
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
    public boolean insertarTipoContribuyente(TipoContribuyente tc) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tc.obtenerCodSRI());
            pst.setString(2, tc.obtenerDescripcion());
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
    public boolean insertarTipoIdentificacion(TipoIdentificacion ti) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, ti.obtenerDescripcion());
            pst.setString(2, ti.obtenerCodSRI_Compra());
            pst.setString(3, ti.obtenerCodSRI_Venta());
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
    public boolean insertarPersona(Persona ps) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, ps.obtenerTipoContribuyente().obtenerId());
            pst.setInt(2, ps.obtenerTipoIdentificacion().obtenerId());
            pst.setString(3, String.valueOf(ps.obtenerTipo()));
            pst.setString(4, ps.obtenerIdentificacion());
            pst.setString(5, ps.obtenerNombre());
            pst.setBoolean(6, ps.isLocal());
            pst.setBoolean(7, ps.isRelacionado());
            pst.setString(8, ps.obtenerDireccion());
            pst.setString(9, ps.obtenerTelefono());
            pst.setString(10, ps.obtenerCorreo());
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
    public boolean insertarCategoria(Categoria ct){
       PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, ct.obtenerCodigo());
            pst.setString(2, ct.obtenerDescripcion());
           
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
    public boolean insertarBodega(Bodega bd){
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, bd.obtenerCodigo());
            pst.setString(2, bd.obtenerDescripcion());
           
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
    public boolean insertarTipoIVA(TipoIVA tv){
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tv.obtenerNombre());
            pst.setInt(2, tv.obtenerPorcentaje());
           
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
    public boolean insertarProducto(Producto pd){
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, pd.obtenerCategoria().obtenerId());
            pst.setInt(2, pd.obtenerBodega().obtenerId());
            pst.setInt(3, pd.obtenerTipoIVA().obtenerId());
            pst.setString(4, pd.obtenerCodigo());
            pst.setString(5, pd.obtenerNombre());
            pst.setDouble(6, pd.obtenerPrecio());
           
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
    public boolean insertarTipoComprobante(TipoComprobante tc){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tc.obtenerDescripcion());
            pst.setString(2, tc.obtenerCodSRI_Compra());
            pst.setString(3, tc.obtenerCodSRI_Venta());
            pst.setInt(4, tc.obtenerSigoCompra());
            pst.setInt(5, tc.obtenerSigoVenta());
           
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
    public boolean insertarFormaPago(FormaPago fp){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, fp.obtenerDescripcion());
            pst.setString(2, fp.obtenerCodSRI());
         
           
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
    public boolean insertarCabCompra(CabCompra cc){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, cc.obtenerUsuario().obtenerId());
            pst.setInt(2, cc.obtenerTipoComprobante().obtenerId());
            pst.setString(3, cc.obtenerSerie());
            pst.setInt(4, cc.obtenerSecuencia());
            pst.setInt(5, cc.obtenerPersona().obtenerId());
            java.sql.Date fecha= new java.sql.Date(cc.obtenerFecha().getTime());
            pst.setDate(6, fecha);
            pst.setInt(7, cc.obtenerFormaPago().obtenerId());
         
           
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
    public boolean insertarDetCompra(DetCompra dc){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, dc.obtenerCabCompra().obtenerId());
            pst.setInt(2, dc.obtenerProducto().obtenerId());
            pst.setDouble(3, dc.obtenerCantidad());
            pst.setDouble(4, dc.obtenerPrecioUnitario());
            pst.setDouble(5, dc.obtenerBaseTotal());
            pst.setDouble(6, dc.obtenerValorIva());
            pst.setDouble(7, dc.obtenerTotal());
         
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
    public boolean insertarCabVenta(CabVenta cv){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, cv.obtenerUsuario().obtenerId());
            pst.setInt(2, cv.obtenerPuntoEmision().obtenerId());
            pst.setInt(3, cv.obtenerTipoComprobante().obtenerId());
            pst.setString(4, cv.obtenerSerie());
            pst.setInt(5, cv.obtenerSecuencial());
            pst.setInt(6, cv.obtenerPersona().obtenerId());
            java.sql.Date fecha= new java.sql.Date(cv.obtenerFecha().getTime());
            pst.setDate(7, fecha);
            pst.setInt(8, cv.obtenerFormaPago().obtenerId());

         
           
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
    public boolean insertarDetVenta(DetVenta dv){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, dv.obtenerCabVenta().obtenerId());
            pst.setInt(2, dv.obtenerProducto().obtenerId());
            pst.setDouble(3, dv.obtenerCantidad());
            pst.setDouble(4, dv.obtenerPrecioUnitario());
            pst.setDouble(5, dv.obtenerBaseTotal());
            pst.setDouble(6, dv.obtenerValorIva());
            pst.setDouble(7, dv.obtenerTotal());
         
           
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
    public boolean insertarTipoRetencion(TipoRetencion tr){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tr.obtenerDescripcion());
         
           
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
    public boolean insertarConceptoRetencion(ConceptoRetencion cr){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, cr.obtenerDescripcion());
            pst.setInt(2, cr.obtenerTipoRetencion().obtenerId());
            pst.setString(3, cr.obtenerCodSRI());
            pst.setInt(4, cr.obtenerF101());
            pst.setInt(5, cr.obtenerF103());
            pst.setInt(6, cr.obtenerF104());   
            pst.setDouble(7, cr.obtenerPorcentaje());
         
           
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
    public boolean insertarCabRetencion(CabRetencion cr){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, cr.obtenerUsuario().obtenerId());
            pst.setInt(2, cr.obtenerTipoComprobante().obtenerId());
            pst.setInt(3, cr.obtenerPuntoEmision().obtenerId());
            pst.setInt(4, cr.obtenerCabCompra().obtenerId());
            pst.setString(5, cr.obtenerSerie());
            pst.setInt(6, cr.obtenerSecuencial());
            java.sql.Date fecha= new java.sql.Date(cr.obtenerFecha().getTime());
            pst.setDate(7, fecha);
         
           
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
    public boolean insertarDetRetencion(DetRetencion dr){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, dr.obtenerCabRetencion().obtenerId());
            pst.setInt(2, dr.obtenerConceptoRetencion().obtenerId());
            pst.setDouble(3, dr.obtenerBase());
            pst.setDouble(4, dr.obtenerPorcentaje());
            pst.setDouble(5, dr.obtenerValor());
         
           
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
    public boolean insertarAuditoria(Auditoria ad){ 
        PreparedStatement pst;
        Connection con = cn.conectar();
        
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, ad.obtenerUsuario().obtenerId());
            pst.setString(2, ad.obtenerTipoTransaccion());
            pst.setString(3, ad.obtenerOrigenTransaccion());
            pst.setString(4, ad.obtenerDetalle());
         
           
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
