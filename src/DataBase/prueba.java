/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Objetos.*;
import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class prueba {
    public static void main(String[] args) {
        Consultar_db cn= new Consultar_db("rol");
        ArrayList<Rol> rols= new ArrayList();
        rols=cn.consultarRol();
        int tamaño= rols.size();
        int i=0;
        
        while (i<tamaño){
            System.out.println(rols.get(i).getNombre());
            System.out.println(rols.get(i).getDescripcion());
            
            i++;
        }
                Consultar_db cc= new Consultar_db("usuario");

      ArrayList<Usuario> usua= new ArrayList();
        usua=cc.consultarUsuarios();
        int tamaño1= usua.size();
        int j=0;
        
        while (j<tamaño1){
           
            System.out.println(usua.get(j).getId());
             System.out.println(usua.get(j).getNombre());
              System.out.println(usua.get(j).getApellido());
               System.out.println(usua.get(j).getCorreo()); 
             System.out.println(usua.get(j).getContraseña());
              System.out.println(usua.get(j).getNumero_Celular());
            
            j++;
        }
         Consultar_db pp= new Consultar_db("Proveedor");
        ArrayList<Proveedor> pro= new ArrayList();
        pro=pp.consultarProveedores();
        int tamaño2= pro.size();
        int k=0;
        
        while (k<tamaño2){
            System.out.println(pro.get(k).getIdentificacion());
            System.out.println(pro.get(k).getNombre_Comercial());
               System.out.println(pro.get(k).getRepresentante());
            
            k++;
    }
         Consultar_db ccs= new Consultar_db("cabeceracompra");
        ArrayList<CabeceraCompra> com= new ArrayList();
        com=ccs.consultarCabeceraCompra();
        int tamaño3= com.size();
        int m=0;
        
        while (m<tamaño3){
             System.out.println(com.get(m).getId());
            System.out.println(com.get(m).getTipodecomprobante());
             System.out.println(com.get(m).getNumerocomprobante());
              System.out.println(com.get(m).getProveedor());
              System.out.println(com.get(m).getFecha());
           
            
            m++;
            }
         Consultar_db cv= new Consultar_db("cabeceraventa");
        ArrayList<CabeceraVenta> cvv= new ArrayList();
        cvv=cv.consultarCabeceraVentas();
        int tamaño8= cvv.size();
        int s=0;
        
        while (s<tamaño8){
            
             System.out.println(cvv.get(s).getId());
            System.out.println(cvv.get(s).getCliente());
             System.out.println(cvv.get(s).getTipodecomprobante());
              System.out.println(cvv.get(s).getNumerocomprobante());
              
           
            
            s++;
            }
      Consultar_db pd= new Consultar_db("producto");
        ArrayList<Producto> pds= new ArrayList();
        pds=pd.consultarProductos();
        int tamaño4= pds.size();
        int n=0;
        
        while (n<tamaño4){
            System.out.println(pds.get(n).getCodigo());
            System.out.println(pds.get(n).getDescripcion());
            System.out.println(pds.get(n).getCategoria());
            System.out.println(pds.get(n).getModelo());
        
            
            n++;
            }
          Consultar_db cl= new Consultar_db("cliente");
        ArrayList<Cliente> c= new ArrayList();
        c=cl.consultarClientes();
        int tamaño5=c.size();
        int p=0;
        
        while (p<tamaño5){
           
            System.out.println(c.get(p).getId());
            System.out.println(c.get(p).getNombre());
            System.out.println(c.get(p).getApellido());
            System.out.println(c.get(p).getCorreo());
            System.out.println(c.get(p).getDireccion());
        
            
            p++;
        
   
    }
    Consultar_db dc= new Consultar_db("detallecompra");
        ArrayList<DetalleCompra> dcs= new ArrayList();
        dcs=dc.consultarDetalleCompras();
        int tamaño6= dcs.size();
        int r=0;
        
        while (r<tamaño6){
           System.out.println(dcs.get(r).getId());
            System.out.println(dcs.get(r).getIdCabeceraCompra());
             System.out.println(dcs.get(r).getProducto());
              System.out.println(dcs.get(r).getCantidad());
              System.out.println(dcs.get(r).getPrecioUnitario());
           System.out.println(dcs.get(r).getPrecio_Total());   
           
            r++;
            }
        Consultar_db dv= new Consultar_db("detalleventa");
        ArrayList<DetalleVenta> dvs= new ArrayList();
       dvs=dv.consultarDetalleVentas();
         int tamaño7= dvs.size();
        int q=0;
        
        while (q<tamaño7){
             System.out.println(dvs.get(q).getId());
            System.out.println(dvs.get(q).getIdCabeceraVenta());
             System.out.println(dvs.get(q).getProducto());
              System.out.println(dvs.get(q).getCantidad());
              System.out.println(dvs.get(q).getPrecioUnitario());
           System.out.println(dvs.get(q).getPrecio_Total());   
           
            
            q++;
            }
    }
}
    
