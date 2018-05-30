package services;

import beans.UsuarioBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutenticationService {
    
    String url = "jdbc:mysql://localhost:3306/";
    String baseDeDatos = "wallet";
    String useSSL = "?useSSL=false";
    String usuarioDB = "root";
    String passDB = "mysqlroot";
    
    Connection conexion = null;
    Statement st = null;    
    
    public void conexion() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url+baseDeDatos+useSSL, 
                    usuarioDB, passDB);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AutenticationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion() throws SQLException{
        conexion.close();
    }    
    
    public AutenticationService(){}
    
    public boolean autentication(String idUsuario, String contraseña){
        if(contraseña == null || contraseña.trim() == ""){
            return false;
        }return true;
    }

    public UsuarioBean getUsuarioValido(String idUsuario, String contraseña) throws SQLException {
        conexion();
        String query = "SELECT * FROM usuarios WHERE "
            + "usuario_id ='" + idUsuario + "' AND contraseña ='" + contraseña + "'";
        ResultSet rs;
        boolean status;
        
        try{
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            status = rs.next();
            if(status){
                DBcrudService crud = new DBcrudService();
                UsuarioBean user = crud.read(Integer.parseInt(idUsuario));
                rs.close();
                cerrarConexion();
                return user;
            }
            rs.close();
            cerrarConexion();
        }catch(Exception e){
            e.printStackTrace();
        }        
        return null;
    }
    
    
}
