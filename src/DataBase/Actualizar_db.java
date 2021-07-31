/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Conecciones.Coneccion;
import Objetos.*;
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
public class Actualizar_db {
    //sentencias

    String tabla;
    String parametros;
    String sentencia = "exec sp_Actualizar";
    //TABLAS
    Usuario usuario;

    Coneccion cn = new Coneccion();
    ResultSet datos;

    public Actualizar_db(String tabla, String parametros) {
        this.tabla = tabla;
        this.parametros = parametros;
        this.sentencia = this.sentencia + tabla + parametros;
    }

    public boolean actualizarUsuario(Usuario us) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, us.obtenerNombre());
            pst.setString(2, us.obtenerCorreo());
            pst.setString(3, us.obtenerContraseña());
            pst.setInt(4, us.obtenerId());
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

    public boolean actualizarPerfil(Perfil pf) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, pf.obtenerNombre());
            pst.setString(2, pf.obtenerDescripcion());
            pst.setInt(3, pf.obtenerId());
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

    public boolean actualizarPuntoEmision(PuntoEmision pe) {
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
            pst.setInt(8, pe.obtenerId());
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

    public boolean actualizarAsignacion(Asignacion as) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, as.obtenerUsuario().obtenerId());
            pst.setInt(2, as.obtenerPerfil().obtenerId());
            pst.setInt(3, as.obtenerPuntoEmision().obtenerId());
            pst.setInt(4, as.obtenerId());
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

    public boolean actualizarTipoContribuyente(TipoContribuyente tc) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tc.obtenerCodSRI());
            pst.setString(2, tc.obtenerDescripcion());
            pst.setInt(3, tc.obtenerId());
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

    public boolean actualizarTipoIdentificacion(TipoIdentificacion ti) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, ti.obtenerDescripcion());
            pst.setString(2, ti.obtenerCodSRI_Compra());
            pst.setString(3, ti.obtenerCodSRI_Venta());
            pst.setInt(4, ti.obtenerId());
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

    public boolean actualizarPersona(Persona ps) {
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
            pst.setInt(11, ps.obtenerId());
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

    public boolean actualizarCategoria(Categoria ct) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, ct.obtenerCodigo());
            pst.setString(2, ct.obtenerDescripcion());

            pst.setInt(3, ct.obtenerId());
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

    public boolean actualizarBodega(Bodega bd) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, bd.obtenerCodigo());
            pst.setString(2, bd.obtenerDescripcion());

            pst.setInt(3, bd.obtenerId());
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

    public boolean actualizarTipoIVA(TipoIVA tv) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tv.obtenerNombre());
            pst.setInt(2, tv.obtenerPorcentaje());

            pst.setInt(3, tv.obtenerId());
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

    public boolean actualizarProducto(Producto pt) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, pt.obtenerCategoria().obtenerId());
            pst.setInt(2, pt.obtenerBodega().obtenerId());
            pst.setInt(3, pt.obtenerTipoIVA().obtenerId());
            pst.setString(4, pt.obtenerCodigo());
            pst.setString(5, pt.obtenerNombre());
            pst.setDouble(6, pt.obtenerPrecio());

            pst.setInt(7, pt.obtenerId());
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

    public boolean actualizarTipoComprobante(TipoComprobante tc) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tc.obtenerDescripcion());
            pst.setString(2, tc.obtenerCodSRI_Compra());
            pst.setString(3, tc.obtenerCodSRI_Venta());
            pst.setInt(4, tc.obtenerSigoCompra());
            pst.setInt(5, tc.obtenerSigoVenta());
 
            pst.setInt(6, tc.obtenerId());
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

    public boolean actualizarFormaPago(FormaPago fp) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, fp.obtenerDescripcion());
            pst.setString(2, fp.obtenerCodSRI());
         

            pst.setInt(3, fp.obtenerId());
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

    public boolean actualizarCabCompra(CabCompra cc) {
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
            pst.setDate(6,fecha );
            pst.setInt(7, cc.obtenerFormaPago().obtenerId());

            pst.setInt(8, cc.obtenerId());
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

    public boolean actualizarDetCompra(DetCompra dc) {
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

            pst.setInt(8, dc.obtenerId());
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

    public boolean actualizarCabVenta(CabVenta cv) {
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

            pst.setInt(9, cv.obtenerId());
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

    public boolean actualizarDetVenta(DetVenta dv) {
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

            pst.setInt(8, dv.obtenerId());
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

    public boolean actualizarTipoRetencion(TipoRetencion tr) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setString(1, tr.obtenerDescripcion());

            pst.setInt(2, tr.obtenerId());
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

    public boolean actualizarConceptoRetencion(ConceptoRetencion cr) {
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

            pst.setInt(8, cr.obtenerId());
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

    public boolean actualizarCabRetencion(CabRetencion cr) {
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

            pst.setInt(8, cr.obtenerId());
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

    public boolean actualizarDetRetencion(DetRetencion dr) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, dr.obtenerCabRetencion().obtenerId());
            pst.setInt(2, dr.obtenerConceptoRetencion().obtenerId());
            pst.setDouble(3, dr.obtenerBase());
            pst.setDouble(4, dr.obtenerPorcentaje());
            pst.setDouble(5, dr.obtenerValor());

            pst.setInt(6, dr.obtenerId());
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
    
     public boolean actualizarAuditoria(Auditoria ad) {
        PreparedStatement pst;
        Connection con = cn.conectar();
        try {
            pst = con.prepareCall(sentencia);
            pst.setInt(1, ad.obtenerUsuario().obtenerId());
            pst.setString(2, ad.obtenerTipoTransaccion());
            pst.setString(3, ad.obtenerOrigenTransaccion());
            pst.setString(4, ad.obtenerDetalle());

            pst.setInt(5, ad.obtenerId());
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
