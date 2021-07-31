/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Objetos.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Mauricio
 */
public class ComboBox {
    
    String prim="Seleccione...";
   public void cbRol(JComboBox<Rol> cb){
      ArrayList<Rol> objetos;
        
        try {
            Consultar_db cons= new Consultar_db("rol");
            objetos=cons.consultarRol();
           
            int tamaño=objetos.size();
            int i=0;
            System.out.println("el tamaño es "+tamaño);
            Rol rol= new Rol();
            rol.setNombre(prim);
            cb.addItem(rol);
            while (i<tamaño) {
                cb.addItem(objetos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Uusario ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbPerfil(JComboBox<Perfil> cb,String condision){
      ArrayList<Perfil> datos;
        
        try {
            Consultar_db cons= new Consultar_db("Perfil", condision);
            datos=cons.consultarPerfiles();
           
            int tamaño=datos.size();
            int i=0;
            Perfil pr= new Perfil();
            pr.ponerNombre(prim);
            cb.addItem(pr);
            
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Perfil ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbPuntoEmision(JComboBox<PuntoEmision> cb,String condision){
      ArrayList<PuntoEmision> datos;
        
        try {
            Consultar_db cons= new Consultar_db("PuntoEmision", condision);
            datos=cons.consultarPuntosEmision();
           
            int tamaño=datos.size();
            int i=0;
            PuntoEmision pr= new PuntoEmision();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.PuntoEmision ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   } 
   public void cbCategoria(JComboBox<Categoria> cb,String condision){
      ArrayList<Categoria> datos;
        
        try {
            Consultar_db cons= new Consultar_db("Categoria", condision);
            datos=cons.consultarCategorias();
           
            int tamaño=datos.size();
            int i=0;
            Categoria pr= new Categoria();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Categoria ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbBodega(JComboBox<Bodega> cb,String condision){
      ArrayList<Bodega> datos;
        
        try {
            Consultar_db cons= new Consultar_db("Bodega", condision);
            datos=cons.consultarBodegas();
           
            int tamaño=datos.size();
            int i=0;
            Bodega pr= new Bodega();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Bodega ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbTipoIVA(JComboBox<TipoIVA> cb,String condision){
      ArrayList<TipoIVA> datos;
        
        try {
            Consultar_db cons= new Consultar_db("TipoIVA", condision);
            datos=cons.consultarTiposIVA();
           
            int tamaño=datos.size();
            int i=0;
            TipoIVA pr= new TipoIVA();
            pr.ponerNombre(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.TipoIVA ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbProducto(JComboBox<Producto> cb,String condision){
      ArrayList<Producto> datos;
        
        try {
            Consultar_db cons= new Consultar_db("Producto", condision);
            datos=cons.consultarProductos();
           
            int tamaño=datos.size();
            int i=0;
            Producto pr= new Producto();
            pr.ponerNombre(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Producto ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbTipoContribuyente(JComboBox<TipoContribuyente> cb,String condision){
      ArrayList<TipoContribuyente> datos;
        
        try {
            Consultar_db cons= new Consultar_db("TipoContribuyente", condision);
            datos=cons.consultarTiposContribuyente();
           
            int tamaño=datos.size();
            int i=0;
            TipoContribuyente pr= new TipoContribuyente();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.TipoContribuyente ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbTipoIdentificacion(JComboBox<TipoIdentificacion> cb,String condision){
     
       ArrayList<TipoIdentificacion> datos;
        
        try {
            Consultar_db cons= new Consultar_db("TipoIdentificacion", condision);
            
            datos=cons.consultarTiposIdentificacion();
            
            int tamaño=datos.size();
            int i=0;
            TipoIdentificacion pr= new TipoIdentificacion();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.TipoIdentificacion ",
                    JOptionPane.ERROR_MESSAGE);
        }  

   }
   public void cbPersona(JComboBox<Persona> cb,String condision){
      ArrayList<Persona> datos;
        
        try {
            Consultar_db cons= new Consultar_db("Persona", condision);
            datos=cons.consultarPersonas();
           
            int tamaño=datos.size();
            int i=0;
            Persona pr= new Persona();
            pr.ponerNombre(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Persona ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbTipoComprobante(JComboBox<TipoComprobante> cb,String condision){
      ArrayList<TipoComprobante> datos;
        
        try {
            Consultar_db cons= new Consultar_db("TipoComprobante", condision);
            datos=cons.consultarTiposComprobante();
            System.out.println(cons);
            int tamaño=datos.size();
            int i=0;
            TipoComprobante pr= new TipoComprobante();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.TipoComprobante ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbFormaPago(JComboBox<FormaPago> cb,String condision){
      ArrayList<FormaPago> datos;
        
        try {
            Consultar_db cons= new Consultar_db("FormaPago", condision);
            datos=cons.consultarFormasPago();
           
            int tamaño=datos.size();
            int i=0;
            FormaPago pr= new FormaPago();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.FormaPago ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbTipoRetencion(JComboBox<TipoRetencion> cb,String condision){
      ArrayList<TipoRetencion> datos;
        
        try {
            Consultar_db cons= new Consultar_db("TipoRetencion", condision);
            datos=cons.consultarTiposRetencion();
           
            int tamaño=datos.size();
            int i=0;
            TipoRetencion pr= new TipoRetencion();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.TipoRetencion  ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
   public void cbConceptoRetencion(JComboBox<ConceptoRetencion> cb,String condision){
      ArrayList<ConceptoRetencion> datos;
        
        try {
            Consultar_db cons= new Consultar_db("ConceptoRetencion", condision);
            datos=cons.consultarConceptosRetencion();
           
            int tamaño=datos.size();
            int i=0;
            ConceptoRetencion pr= new ConceptoRetencion();
            pr.ponerDescripcion(prim);
            cb.addItem(pr);
            while (i<tamaño) {
                cb.addItem(datos.get(i));
                i++;
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.ConceptoRetencion  ",
                    JOptionPane.ERROR_MESSAGE);
        }  
   }
    
}
