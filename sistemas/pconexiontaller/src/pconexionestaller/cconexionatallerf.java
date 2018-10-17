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
    
    //INSERTAR
    
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
    private CallableStatement insertarServicio = null;
    private CallableStatement insertarservicios = null;
    private CallableStatement insertarEmpleado = null;
    private CallableStatement insertarvehiculonuevo = null;
    
    //BORAR
    private CallableStatement borrarcliente = null;
    
    
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
            insertarservicios= conecta.prepareCall("{call insertarServicio(?,?,?)}");         //INSERTA CLIENTE
            insertarEmpleado= conecta.prepareCall("{call insertarEmpleado(?,?,?,?,?,?,?,?)}");         //INSERTA CLIENTE
            insertarvehiculonuevo= conecta.prepareCall("{call insertarVehiculo(?,?,?,?,?,?,?,?)}");         //INSERTA NUEVO VEHICULO
            
          
            
            
        //BLOQUE UTILIZADO PARA BORRAR INFORMACION DE TABLAS
        
        borrarcliente= conecta.prepareCall("{call eliminarCliente(?)}");         //ELIMINA CLIENTE
            
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
          //  conecta.close();
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
          //  conecta.close();
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
         //   conecta.close();
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
          //  conecta.close();
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
          //  conecta.close();
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
          //  conecta.close();
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
          //  conecta.close(); // SE CERRARON, PORQUE ERAN DE PRUEBA
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
          //  conecta.close();
        }

        return insertar;
    }//fin SERIE DE FACTURA INICIO Y FIN

    
    
    //MODULOS PARA INSERTAR LOS SERVICIOS
    
    
    
    public int insertarServiciosvarios(String serie, String inicio, String fin ) throws SQLException {

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
          //  conecta.close();
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
          //  conecta.close();
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
    
    
    //INSERTA CLIENTE
    public int insertarEmpleado(String nombres, String apellidos,String telefono,String correo,String dpi,
            String direccion,String tipoempleado,String bd,String campo,String Sexo) throws SQLException {

        
        int insertar = 0;
        

        try {
            conecta.setAutoCommit(false);
            
            //busca el registro de un dato requerrido, segun tabla y campo desao
            
            insertar = mostrarinformacionBDonParametros(bd,campo,tipoempleado);
            
            //envia informacion al procedimiento almacenado

            insertarEmpleado.setString(1, nombres);
            insertarEmpleado.setString(2, apellidos);
            insertarEmpleado.setString(3, direccion);
            insertarEmpleado.setString(4, telefono);
            insertarEmpleado.setString(5, dpi);
            insertarEmpleado.setString(6, Sexo);
            insertarEmpleado.setString(7, correo);
            insertarEmpleado.setInt(8, insertar);
            insertarEmpleado.execute();

           
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
    }//fin insertarEMPLEADO
    
    
    
    //INSERTA SERVIIO
    public int InsertarServicios(String descripcion, String costos,
            String departamento,String bd,String campo) throws SQLException {

        int insertar = 0;
        float costo = Float.parseFloat(costos);
        

        try {
            conecta.setAutoCommit(false);
            
            //busca el registro de un dato requerrido, segun tabla y campo desao
            
            insertar = mostrarinformacionBDonParametros(bd,campo,departamento);
            
            //envia informacion al procedimiento almacenado

            insertarservicios.setString(1, descripcion);
            insertarservicios.setInt(2, insertar);
            insertarservicios.setFloat(3, costo); 
            insertarservicios.execute();

           
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
    }//fin insertarServivicio
    
    
    //INSERTA insertarvehiculos
    public int insertarVehiculos(String linea,String modelo,String placa,String color,String observaciones,
            String campomarca, String camptransimision,String campoempleado) throws SQLException {

        
        int insertar = 0;
        int idmarca = 0;
        int idtransmision = 0;
        int idcliente = 0;
        String bd="tblmarca";
        String campo ="Descripcion";
        

        try {
            conecta.setAutoCommit(false);
            
            //busca el registro de un dato requerrido, segun tabla y campo desao
            
            idmarca = mostrarinformacionBDonParametros(bd,campo,campomarca);
            
            bd="tbltransmision";
            idtransmision = mostrarinformacionBDonParametros(bd,campo,camptransimision);
            
            bd="tblcliente";
            campo ="Nit";
            idcliente = mostrarinformacionBDonParametros(bd,campo,campoempleado);
            
            //envia informacion al procedimiento almacenado

            insertarvehiculonuevo.setString(1, linea);
            insertarvehiculonuevo.setString(2, modelo);
            insertarvehiculonuevo.setString(3, placa);
            insertarvehiculonuevo.setString(4, color);
            insertarvehiculonuevo.setString(5, observaciones);
            insertarvehiculonuevo.setInt(6, idmarca);
            insertarvehiculonuevo.setInt(7, idtransmision);
            insertarvehiculonuevo.setInt(8, idcliente);
            insertarvehiculonuevo.execute();

           
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
    }//fin insertarvehiculos
    
    
    
    
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
    
     
     
     
     
     
 //METODOS PARA ELIMINACION DE INFORMACION
     
     //INSERTA insertarvehiculos
    public int eliminarcliente(String nit) throws SQLException {

        int borrar=0;
        String bd ="tblcliente";
        String campo ="Nit";
        int id =0;
        
        
        

        try {
            conecta.setAutoCommit(false);
            
            
          //busca el registro de un dato requerrido, segun tabla y campo desao
            
            
            id = mostrarinformacionBDonParametros(bd,campo,nit);
            
            //envia informacion al procedimiento almacenado
            
            borrarcliente.setInt(1, id); 
            
             borrarcliente.execute();

           
            conecta.commit();
         
            borrar = 1;

        } catch (Exception e) {

            conecta.rollback();

            e.printStackTrace();
        } finally {
            // cerrar la Conexion
          //  conecta.close();
        }

        return borrar;
    }//fin eliminarcliente
    
    
     
     
 //FIN CLASE PRINCIPAL    
}//fin cconexionataller
