/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Objetos.*;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Mauricio
 */
public class Tablas {
    
    public Tablas(){
        
    }
    
    
public void tbRol(JTable tabla) {
    ArrayList<Rol> objeto;

    try {
        Consultar_db cons= new Consultar_db("rol");
        objeto=cons.consultarRol();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("");
        int tamaño=objeto.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{objeto.get(i).getNombre(),
            objeto.get(i).getDescripcion(),
            objeto.get(i).getId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(315);
        modeloColumna.getColumn(1).setPreferredWidth(340);
        modeloColumna.getColumn(2).setPreferredWidth(1);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Uusario ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbPerfil(JTable tabla, String condision) {
    ArrayList<Perfil> lista;

    try {
        Consultar_db cons= new Consultar_db("Perfil", condision);
        lista=cons.consultarPerfiles();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("");
        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerNombre(),
            lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(265);
        modeloColumna.getColumn(1).setPreferredWidth(390);
        modeloColumna.getColumn(2).setPreferredWidth(1);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Uusario ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbPuntoEmision(JTable tabla, String condision) {
    ArrayList<PuntoEmision> lista;

    try {
        Consultar_db cons= new Consultar_db("PuntoEmision", condision);
        lista=cons.consultarPuntosEmision();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("Serie FC");
        modelo.addColumn("Serie NC");
        modelo.addColumn("Serie RT");
        modelo.addColumn("Sec.  FC");
        modelo.addColumn("Sec.  NC");
        modelo.addColumn("Sec.  RT");
        modelo.addColumn("");
        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerSerieFactura(),
            lista.get(i).obtenerSerieNotaCredito(),
            lista.get(i).obtenerSerieRetencion(),
            lista.get(i).obtenerSecuencialFactura(),
            lista.get(i).obtenerSecuencialNotaCredito(),
            lista.get(i).obtenerSecuencialRetencion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(200);
        modeloColumna.getColumn(1).setPreferredWidth(100);
        modeloColumna.getColumn(2).setPreferredWidth(100);
        modeloColumna.getColumn(3).setPreferredWidth(100);
        modeloColumna.getColumn(4).setPreferredWidth(100);
        modeloColumna.getColumn(5).setPreferredWidth(100);
        modeloColumna.getColumn(6).setPreferredWidth(100);
        modeloColumna.getColumn(7).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Uusario ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbAsignacion(JTable tabla, String condision) {
    ArrayList<Asignacion> lista;

    try {
        Consultar_db cons= new Consultar_db("Asignacion", condision);
        lista=cons.consultarAsignaciones();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Usuario");
        modelo.addColumn("Perfil");
        modelo.addColumn("Punto de Emision");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerUsuario(),
            lista.get(i).obtenerPerfil(),
            lista.get(i).obtenerPuntoEmision(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(250);
        modeloColumna.getColumn(1).setPreferredWidth(200);
        modeloColumna.getColumn(2).setPreferredWidth(250);
        modeloColumna.getColumn(3).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Uusario ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbCategoria(JTable tabla, String condision) {
    ArrayList<Categoria> lista;

    try {
        Consultar_db cons= new Consultar_db("Categoria", condision);
        lista=cons.consultarCategorias();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerCodigo(),
            lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(50);
        modeloColumna.getColumn(1).setPreferredWidth(500);
        modeloColumna.getColumn(2).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Categoria ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbBodega(JTable tabla, String condision) {
    ArrayList<Bodega> lista;

    try {
        Consultar_db cons= new Consultar_db("Bodega", condision);
        lista=cons.consultarBodegas();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerCodigo(),
            lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(50);
        modeloColumna.getColumn(1).setPreferredWidth(500);
        modeloColumna.getColumn(2).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Bodega ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbTipoIVA(JTable tabla, String condision) {
    ArrayList<TipoIVA> lista;

    try {
        Consultar_db cons= new Consultar_db("TipoIVA", condision);
        lista=cons.consultarTiposIVA();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Porcentaje");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerNombre(),
            lista.get(i).obtenerPorcentaje(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(500);
        modeloColumna.getColumn(1).setPreferredWidth(50);
        modeloColumna.getColumn(2).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.TipoIVA ",
                JOptionPane.ERROR_MESSAGE);
    }
}    
public void tbProducto(JTable tabla, String condision) {
    ArrayList<Producto> lista;

    try {
        Consultar_db cons= new Consultar_db("Producto", condision);
        lista=cons.consultarProductos();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Categoria");
        modelo.addColumn("Bodega");
        modelo.addColumn("IVA Tipo");
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerCategoria(),
            lista.get(i).obtenerBodega(),
            lista.get(i).obtenerTipoIVA(),
            lista.get(i).obtenerCodigo(),
            lista.get(i).obtenerNombre(),
            lista.get(i).obtenerPrecio(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(100);
        modeloColumna.getColumn(1).setPreferredWidth(100);
        modeloColumna.getColumn(2).setPreferredWidth(100);
        modeloColumna.getColumn(3).setPreferredWidth(50);
        modeloColumna.getColumn(4).setPreferredWidth(200);
        modeloColumna.getColumn(5).setPreferredWidth(50);
        modeloColumna.getColumn(6).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Producto ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbTipoIdentificacion(JTable tabla, String condision) {
    ArrayList<TipoIdentificacion> lista;

    try {
        Consultar_db cons= new Consultar_db("TipoIdentificacion", condision);
        lista=cons.consultarTiposIdentificacion();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cod.Com. SRI");
        modelo.addColumn("Cod.Ven. SRI");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerCodSRI_Compra(),
            lista.get(i).obtenerCodSRI_Venta(),

            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(300);
        modeloColumna.getColumn(1).setPreferredWidth(150);
        modeloColumna.getColumn(2).setPreferredWidth(150);
        modeloColumna.getColumn(3).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Producto ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbTipoContribuyente(JTable tabla, String condision) {
    ArrayList<TipoContribuyente> lista;

    try {
        Consultar_db cons= new Consultar_db("TipoContribuyente", condision);
        lista=cons.consultarTiposContribuyente();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Codigo SRI");
        modelo.addColumn("Descripcion");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerCodSRI(),
            lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(100);
        modeloColumna.getColumn(1).setPreferredWidth(400);
        modeloColumna.getColumn(2).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Producto ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbPersona(JTable tabla, String condision) {
    ArrayList<Persona> lista;

    try {
        Consultar_db cons= new Consultar_db("Persona", condision);
        lista=cons.consultarPersonas();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("T. Contribuyente");
        modelo.addColumn("T.Identificacion");
        modelo.addColumn("Tipo");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Nombre");
        modelo.addColumn("Local (s/n)");
        modelo.addColumn("Relacionado (s/n)");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            
            JCheckBox local=new JCheckBox();
            local.setSelected(lista.get(i).isLocal());
            JCheckBox relacionado=new JCheckBox();
            relacionado.setSelected(lista.get(i).isRelacionado());
            modelo.addRow(new Object[]{lista.get(i).obtenerTipoContribuyente(),
            lista.get(i).obtenerTipoIdentificacion(),
            lista.get(i).obtenerTipo(),
            lista.get(i).obtenerIdentificacion(),
            lista.get(i).obtenerNombre(),
            lista.get(i).isLocal(),
            lista.get(i).isRelacionado(),
            lista.get(i).obtenerDireccion(),
            lista.get(i).obtenerTelefono(),
            lista.get(i).obtenerCorreo(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(100);
        modeloColumna.getColumn(1).setPreferredWidth(100);
        modeloColumna.getColumn(2).setPreferredWidth(50);
        modeloColumna.getColumn(3).setPreferredWidth(150);
        modeloColumna.getColumn(4).setPreferredWidth(200);
        modeloColumna.getColumn(5).setCellEditor(tabla.getDefaultEditor(Boolean.class));
        modeloColumna.getColumn(5).setCellRenderer(tabla.getDefaultRenderer(Boolean.class));
        modeloColumna.getColumn(5).setPreferredWidth(50);
        modeloColumna.getColumn(6).setCellEditor(tabla.getDefaultEditor(Boolean.class));
        modeloColumna.getColumn(6).setCellRenderer(tabla.getDefaultRenderer(Boolean.class));
        modeloColumna.getColumn(6).setPreferredWidth(50);
        modeloColumna.getColumn(7).setPreferredWidth(100);
        modeloColumna.getColumn(8).setPreferredWidth(100);
        modeloColumna.getColumn(9).setPreferredWidth(100);
        modeloColumna.getColumn(10).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Producto ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbTipoComprobante(JTable tabla, String condision) {
    ArrayList<TipoComprobante> lista;

    try {
        Consultar_db cons= new Consultar_db("TipoComprobante", condision);
        lista=cons.consultarTiposComprobante();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("CodSRI Compra");
        modelo.addColumn("CodSRI Venta");
        modelo.addColumn("Signo Compra");
        modelo.addColumn("Signo Venta");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerCodSRI_Compra(),
            lista.get(i).obtenerCodSRI_Venta(),
            lista.get(i).obtenerSigoCompra(),
            lista.get(i).obtenerSigoVenta(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(300);
        modeloColumna.getColumn(1).setPreferredWidth(100);
        modeloColumna.getColumn(2).setPreferredWidth(100);
        modeloColumna.getColumn(3).setPreferredWidth(50);
        modeloColumna.getColumn(4).setPreferredWidth(50);
        modeloColumna.getColumn(5).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.TipoComprobante ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbFormaPago(JTable tabla, String condision) {
    ArrayList<FormaPago> lista;

    try {
        Consultar_db cons= new Consultar_db("FormaPago", condision);
        lista=cons.consultarFormasPago();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("Codigo SRI");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerCodSRI(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(400);
        modeloColumna.getColumn(1).setPreferredWidth(200);
        modeloColumna.getColumn(2).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.FormaPago ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbTipoRetencion(JTable tabla, String condision) {
    ArrayList<TipoRetencion> lista;

    try {
        Consultar_db cons= new Consultar_db("TipoRetencion", condision);
        lista=cons.consultarTiposRetencion();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(500);
        modeloColumna.getColumn(1).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.TipoRetencion ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbConceptoRetencion(JTable tabla, String condision) {
    ArrayList<ConceptoRetencion> lista;

    try {
        Consultar_db cons= new Consultar_db("ConceptoRetencion", condision);
        lista=cons.consultarConceptosRetencion();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Descripcion");
        modelo.addColumn("Tipo Retencion");
        modelo.addColumn("Codigo SRI");
        modelo.addColumn("Casll. F101");
        modelo.addColumn("Casll. F103");
        modelo.addColumn("Casll. F104");
        modelo.addColumn("Porcentaje");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerDescripcion(),
            lista.get(i).obtenerTipoRetencion(),
            lista.get(i).obtenerCodSRI(),
            lista.get(i).obtenerF101(),
            lista.get(i).obtenerF103(),
            lista.get(i).obtenerF104(),
            lista.get(i).obtenerPorcentaje(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(300);
        modeloColumna.getColumn(1).setPreferredWidth(50);
        modeloColumna.getColumn(2).setPreferredWidth(50);
        modeloColumna.getColumn(3).setPreferredWidth(50);
        modeloColumna.getColumn(4).setPreferredWidth(50);
        modeloColumna.getColumn(5).setPreferredWidth(50);
        modeloColumna.getColumn(6).setPreferredWidth(50);
        modeloColumna.getColumn(7).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.Producto ",
                JOptionPane.ERROR_MESSAGE);
    }
}
public void tbCabCompra(JTable tabla, String condision) {
    ArrayList<CabCompra> lista;

    try {
        Consultar_db cons= new Consultar_db("CabCompra", condision);
        lista=cons.consultarCabCompras();
        //Datos de Tabla
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Tipo Comprobante");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Serie");
        modelo.addColumn("Secuencial");
        modelo.addColumn("Fecha");
        modelo.addColumn("");

        int tamaño=lista.size();
        int i=0;

        while (i<tamaño) {
            modelo.addRow(new Object[]{lista.get(i).obtenerTipoComprobante(),
            lista.get(i).obtenerPersona(),
            lista.get(i).obtenerSerie(),
            lista.get(i).obtenerSecuencia(),
            lista.get(i).obtenerFecha(),
            lista.get(i).obtenerId()});
            i++;
        }
        TableColumnModel modeloColumna = tabla.getColumnModel();
        modeloColumna.getColumn(0).setPreferredWidth(100);
        modeloColumna.getColumn(1).setPreferredWidth(300);
        modeloColumna.getColumn(2).setPreferredWidth(50);
        modeloColumna.getColumn(3).setPreferredWidth(50);
        modeloColumna.getColumn(4).setPreferredWidth(50);
        modeloColumna.getColumn(5).setPreferredWidth(0);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                null,
                "Error: " + e.getMessage(),
                "Excepcion al cargar cargarDatosTabla.CabCompra ",
                JOptionPane.ERROR_MESSAGE);
    }
}
    
}
