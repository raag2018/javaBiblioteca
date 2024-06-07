/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carba
 */
public class Conexion {
    private Connection conexion;
    private String host = "localhost"; //192.168.1.17, 127.0.0.1
    private String usuario = "root"; //Nombre de usuario
    private String password = ""; //La contraseña configurada
    private String bd = "biblioteca";
    //private String url = "jdbc:mysql://hoscalhost/BDEmpresa";
    private String url = "jdbc:mysql://"+host+"/"+bd;
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection Conectar(){
        try {
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(this.url,this.usuario,this.password);
            System.out.println("Se establecio la conexion "+ bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se establecio la conexion "+ bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conexion;
    }
    
    public void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
