/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.sql.Connection;
import BDConexion.Conexion;
import Modelo.ModelBiblioteca;
import Vista.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Javier
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
     Menu menu = new Menu();
      menu.setVisible(true);
        Conexion conexionBD = new Conexion();
        
        // Probar la conexión
        Connection conexion = conexionBD.Conectar();
        if (conexion != null) {
            
            System.out.println("Conexion establecida con exito.");
            String sql = "SELECT * FROM libros";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ModelBiblioteca t = new ModelBiblioteca();
                t.setId(rs.getInt("id"));
                t.setTitulo(rs.getString("titulo"));
                t.setAutor(rs.getString("autor"));
                t.setEditorial(rs.getString("editorial"));
                t.setAnio_publicacion(rs.getInt("anio_publicacion"));
                t.setIsbn(rs.getString("isbn"));
                t.setGenero(rs.getString("genero"));
                t.setNumero_paginas(rs.getInt("numero_paginas"));
                t.setIdioma(rs.getString("idioma"));
                t.setFormato(rs.getString("formato"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setFecha_adquisicion(rs.getString("fecha_adquisicion"));
                t.setPrecio(rs.getString("precio"));
                t.setEstado(rs.getString("estado"));
                t.setUbicacion(rs.getString("ubicacion"));
                 System.out.println("id " + t.getId() + t.getAutor());
            }
        } else {
            System.out.println("Error al establecer la conexión.");
        }
        
       
        // Probar la desconexión
        conexionBD.desconectar();
    }
    
}
