

package pconexionestaller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pconexionestaller.cconexionatallerf.*;
import static pconexionestaller.cconexionatallerf.conecta;
import static pconexionestaller.inserciones.conexion;
import java.sql.DriverManager;



/**
 *
 * @author dcoutino
 */

public class inserciones {
    
        public static  Connection conexion;
        private PreparedStatement insertacliente = null;  //INStaERTA EN TABLA EXISTENCIAINVENTARIO 
        
   
   public int clientenuevo(){
        
       
      
       
       
       String insertTableSQL = "INSERT INTO acceso " +
                                "(nombre)" +
                                " VALUES (?)";
     
   //  conexion = cconexionatallerf.conecta;
     
     
     
      PreparedStatement insertar = null;
     
      
     //String nombres,String apellidos,String telefono,String correo,
     //       String nit,String direccion,String tipocliente
       int insertarclientes=0;  
        
      try
        {   
            
            cconexionataller conexion = new cconexionataller();
            Connection con = conexion.getConnection();
            
            insertar =con.prepareStatement(insertTableSQL);
            
           insertar=  con.prepareStatement(
                   "INSERT INTO acceso " +
                   "(nombre)"+
                   "VALUES (?)"); 
           insertar.executeUpdate(); 
     //    insertar.setString(1, "DELUC");
          //  insertar.setString(2, "INGENIERIA");
           
            
       //     insertarclientes = insertar.executeUpdate();
           
        }//fin try
        catch(SQLException e)
            
        {
            System.out.println("eror en la consulta " + e.getMessage());
           
        }//fin catch 
    

       
      
   return insertarclientes ;
 }//inventario      
    
  
  
    public int prueba()
    {
        int datos =0;
        return datos =1;
    }//prueba
    
}//fin inserciones
