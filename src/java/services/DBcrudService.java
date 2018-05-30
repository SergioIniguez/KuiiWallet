package services;

import beans.UsuarioBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author _SERGIO_
 */
public class DBcrudService {

 
    String cadenaConexion = "jdbc:mysql://localhost:3306/wallet?useSSL=false";
    String usuarioDB = "root";
    String passDB = "mysqlroot";
    Connection conexion;
    private void conexion(){
        try{
            conexion = DriverManager.getConnection(cadenaConexion,usuarioDB,passDB);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    private void cerrarConexion(){
        try{
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
    
    
    public boolean create(UsuarioBean usuario) throws SQLException {
        conexion();
        String insertUsuario = "INSERT INTO usuarios (nombre_usuario,contraseña,bitcoin, ethereum,ripple) "
                + "VALUES(?,?,0,0,0)";
        PreparedStatement stm = conexion.prepareStatement(insertUsuario);
        stm.setString(1, usuario.getNombreUsuario());
        stm.setString(2, usuario.getContraseña());
        boolean ejecutado = stm.executeUpdate() > 0;
        //stm.close();
        cerrarConexion();
        return ejecutado;
    }

    
    public UsuarioBean read(int id) throws SQLException {
        UsuarioBean usuario = new UsuarioBean();
        String leerQuery = "SELECT * FROM usuarios WHERE usuario_id="+id+";";
                
        conexion();
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(leerQuery);
       
        while(resultado.next()){
            usuario.setNombreUsuario(resultado.getString(2));
            usuario.setBitcoin(resultado.getInt(4));
            usuario.setEthereum(resultado.getInt(5));
            usuario.setRipple(resultado.getInt(6));
            usuario.setUsuario(resultado.getString(1));
        }
            resultado.close();
            sentencia.close();
            cerrarConexion();
        return usuario;
    }

    
    /*public boolean update(Cancion entidad, int selCancion) throws SQLException {
        conexion();
        String updateCancion = "UPDATE canciones SET nombre = ?, artista = ?"
                + "WHERE num_cancion = ?";
        
        PreparedStatement stm = conexion.prepareStatement(updateCancion);
        stm.setString(1, entidad.getNombre());
        stm.setString(2, entidad.getArtista());
        stm.setInt(3, selCancion);
        boolean ejecutado = stm.executeUpdate()>0;
        //stm.close();
        cerrarConexion();
        return ejecutado;
    }

    
    /*public boolean delete(int num_cancion) throws SQLException {
        conexion();
        String deleteCancion = "DELETE FROM canciones WHERE num_cancion = ?";
        PreparedStatement stm = conexion.prepareStatement(deleteCancion);
        stm.setInt(1, num_cancion);
        boolean ejecutado = stm.executeUpdate() > 0;
        //stm.close();
        cerrarConexion();
        return ejecutado;
    }*/
   
    
}
