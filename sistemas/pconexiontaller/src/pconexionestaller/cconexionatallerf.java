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
import java.sql.CallableStatement;
import java.sql.ResultSet;


/**
 *
 * @author dcoutino
 */
public class cconexionatallerf {

    public static Connection conecta;

    private PreparedStatement seleccionardatosbd = null;
    private CallableStatement insertartiipodeempleado = null;
    private CallableStatement insertartiipodecliente = null;
    private CallableStatement insertartiipodepago = null;
    private CallableStatement insertartiipodetarjeta = null;
    private CallableStatement insetarMarca = null;
    private CallableStatement insetarDepartamento = null;
    private CallableStatement insertarEstados = null;
    private CallableStatement insertarSerieFacturas = null;
    private CallableStatement insertarTransmision = null;
    private CallableStatement insertarCliente = null;
    
    
    public cconexionatallerf() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } //fin try
        catch (Exception err) {
            System.out.println("ERROR: " + err);
        }//fin catch
        try {
            conecta = DriverManager.getConnection("jdbc:mysql://localhost/taller", "root", "987565");
            
            insertartiipodeempleado = conecta.prepareCall("{call insertarTipoEmpleado(?)}"); //INSERTA TIPO DE EMPLEADO
            insertartiipodecliente = conecta.prepareCall("{call insertarTipoCliente(?,?)}");    //INSERTA TIPO DE CLIENTE
            insertartiipodepago= conecta.prepareCall("{call insertarTipoPago(?)}");         //INSERTA TIPO DE TIPO DE PAGO
            insertartiipodetarjeta= conecta.prepareCall("{call insertarTipoTarjeta(?)}");         //INSERTA TIPO DE TIPO DE TARJETA
            insetarMarca= conecta.prepareCall("{call insetarMarca(?)}");         //INSERTA MARCA DE AUTO
            insetarDepartamento= conecta.prepareCall("{call insertarDepartamento(?)}");         //INSERTA DEPARTAMENTO DEL TALLER
            insertarEstados= conecta.prepareCall("{call InsertarEstado(?)}");         //INSERTA EL STADO DEL AUTO
            insertarSerieFacturas= conecta.prepareCall("{call insertarFactura_Serie(?,?,?,?)}");         //INSERTA SERIE DE FACTURA INICIO Y FIN
            insertarTransmision= conecta.prepareCall("{call insertarTransmision(?)}");         //INSERTA TRANSMISION DEL AUTO
            insertarCliente= conecta.prepareCall("{call insertarCliente(?,?,?,?,?,?,?)}");         //INSERTA CLIENTE
             
            
            
        }//try
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

        }//fin del catch

    }//cconexionataller constructor de conexion



//insertar por procemientos
//public static void insertarProcedimiento(String descripcion,String descuento) throws SQLException{
    
    //INSERTA TIPO DE EMPLEADO
    public int insertarTipodeEmpleado(String descripcion) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            //CallableStatement cStmt = conecta.prepareCall("{call insertarTipoEmpleado(?)}");
            insertartiipodeempleado.setString(1, descripcion.toUpperCase());
           // cStmt.setString(2, "0");
            // cStmt.registerOutParameter("inOutParam", Types.INTEGER);    

            insertartiipodeempleado.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodeEmpleado


  //INSERTA TIPO DE CLIENTE
    public int insertarTipodeCliente(String descripcion,String descuento) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insertartiipodecliente.setString(1, descripcion.toUpperCase());
            insertartiipodecliente.setString(2, descuento);
            insertartiipodecliente.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodeEmpleado  

    
    //INSERTA TIPO DE PAGO
    public int insertarTipodePago(String tipodepago) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insertartiipodepago.setString(1, tipodepago.toUpperCase());
            insertartiipodepago.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodePago  

  //INSERTA TIPO DE TARJETA
    
    public int insertarTipodetARJETA(String tipodepago) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insertartiipodetarjeta.setString(1, tipodepago.toUpperCase());
            insertartiipodetarjeta.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodetARJETA  

  //INSERTA MARCA DEL AUTO
    
    public int insertarMarcadeAuto(String marca) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insetarMarca.setString(1, marca.toUpperCase());
            insetarMarca.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodetARJETA  

    
    //INSERTA DEPARTAMENTOS DEL TALLER
    
    //INSERTA MARCA DEL AUTO
    
    public int insertarDepartamentos(String departamento) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insetarDepartamento.setString(1, departamento.toUpperCase());
            insetarDepartamento.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodetARJETA  

    
    //INSERTA EL ESTADO DEL AUTO DEL AUTO
    
    public int insertarEstadodelAuto(String estado) throws SQLException {

        int insertar = 0;
        String dato="info";

        try {
            conecta.setAutoCommit(false);

            insertarEstados.setString(1, estado.toUpperCase());
            insertarEstados.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin INSERTA ESTADO DEL AUTO

   
    
    //INSERTA EL ESTADO DEL AUTO DEL AUTO
    
    public int insertarSeriedeFacturas(String serie, String inicio, String fin ) throws SQLException {

        int insertar = 0;
        int inicioserie = Integer.parseInt(inicio);
         int finserie = Integer.parseInt(fin);
        String dato="info";

        try {
            
            
            conecta.setAutoCommit(false);

            insertarSerieFacturas.setString(1, serie);
            insertarSerieFacturas.setInt(2, inicioserie);
            insertarSerieFacturas.setInt(3, finserie);
            insertarSerieFacturas.setInt(4, 0);
            insertarSerieFacturas.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin SERIE DE FACTURA INICIO Y FIN

    
    
    //INSERTA TRANSMISION DE AUTO
    public int insertarTransmision(String transmision) throws SQLException {

        int insertar = 0;

        try {
            conecta.setAutoCommit(false);

            insertarTransmision.setString(1, transmision);
            insertarTransmision.execute();

           
            conecta.commit();
          //  System.out.println("Insertado con exito");
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
            conecta.close();
        }

        return insertar;
    }//fin insertarTipodetARJETA  

    
    //INSERTA CLIENTE
    public int insertarCliente(String nombres, String apellidos,String telefono,String correo,String nit,String direccion,
            String tipocliente,String bd,String campo) throws SQLException {

        int insertar = 0;
        

        try {
            conecta.setAutoCommit(false);
            
            //busca el registro de un dato requerrido, segun tabla y campo desao
            
            insertar = mostrarinformacionBDonParametros(bd,campo,tipocliente);
            
            //envia informacion al procedimiento almacenado

            insertarCliente.setString(1, nombres);
            insertarCliente.setString(2, apellidos);
            insertarCliente.setString(3, telefono);
            insertarCliente.setString(4, correo);
            insertarCliente.setString(5, nit);
            insertarCliente.setString(6, direccion);
            insertarCliente.setInt(7, insertar);
            insertarCliente.execute();

           
            conecta.commit();
         
            insertar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
          //  conecta.close();
        }

        return insertar;
    }//fin insertarTipodetARJETA 
    
    
    
    //clase para buscar informacion en tablas, que llenan combo box en jsp
    //recibe el nombre de la bd, para luego transferir la informacion
    
    public ResultSet mostrarinformacionBD(String bd) throws SQLException
    {
      seleccionardatosbd= conecta.prepareStatement(
        "SELECT * FROM "+ bd + " " ); 
           ResultSet rs;
       rs = seleccionardatosbd.executeQuery();  
        return  rs;
    }//fin mostrarinformacionBD
    
    
    //busca informacion en la bd, cuando tiene un parametro, con cualquier tabla
    
     public int mostrarinformacionBDonParametros(String bd, String  campobd,String campocondicion) throws SQLException
    {
      seleccionardatosbd= conecta.prepareStatement(
        "SELECT * FROM "+ bd + " where "+ campobd + " = '"+campocondicion+"' " ); 
           ResultSet rs;
       rs = seleccionardatosbd.executeQuery();  
       rs.first();
       
        return  rs.getInt(1) ;
    }//fin mostrarinformacionBD
    
}//fin cconexionataller
