/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pconexionestaller;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author dcoutino
 */
public class cconexionataller {
   
    public static   Connection conecta;
    
    ////INSERCIONES
    
    private PreparedStatement insertacliente = null;  //INStaERTA EN TABLA EXISTENCIAINVENTARIO 
    private PreparedStatement insertatipocliente = null;  //INStaERTA EN TABLA tipcliente 
  
  //UPDATES
    
    
    
    //DELETE
    
    
    
public void cconexiona()
    {
        
      try {
               Class.forName("com.mysql.jdbc.Driver").newInstance ();
            } //fin try
       catch (Exception err) 
                   {
                    System.out.println("ERROR: " + err);
                   }//fin catch
try 
{
    conecta = DriverManager.getConnection("jdbc:mysql://localhost/taller", "root", "987565");   
 
    
}//try

catch (SQLException ex) 
{ 
    System.out.println("SQLException: " + ex.getMessage()); 
    System.out.println("SQLState: " + ex.getSQLState()); 
    System.out.println("VendorError: " + ex.getErrorCode()); 
    
}//fin del catch
       

    }//cconexionataller constructor de conexion

public Connection getConnection() {
        return conecta; // Retorno el objeto Connection
    }
  
 
///CLASES DE INSERCIONES

public int tipocliente(String descripcion,String descuento){
        
      
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
            
            insertar = conecta.prepareStatement(
                   "INSERT INTO aceso" +
                   "(nombre,apellidos)"+
                   "VALUES (?,?)"); 
            
            
            insertar.setString(1,"nit");
            insertar.setString(2, "nombre");
        
        
        insertarclientes = insertar.executeUpdate();
           
        }//fin try
        catch(SQLException e)
            
        {
            System.out.println("eror en la consulta " + e.getMessage());
           
        }//fin catch 
    
  
      
   return insertarclientes ;
 }//inventario      
    
  



    
}//fin cconexionataller
