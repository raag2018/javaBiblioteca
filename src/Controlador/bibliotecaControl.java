/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import BDConexion.Conexion;
import Modelo.ModelBiblioteca;

public class bibliotecaControl {
    private Conexion conexion = new Conexion();

    // Método para agregar biblioteca
    public boolean agregarBiblioteca(ModelBiblioteca biblioteca) throws SQLException {
        boolean fueAgregado = false;
        Connection conn = conexion.Conectar();
        try {
            String sql = "INSERT INTO libros (id, titulo, autor, editorial, anio_publicacion, isbn, genero, numero_paginas, idioma, formato, descripcion, fecha_adquisicion, precio, estado, ubicacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement b = conn.prepareStatement(sql);

            b.setInt(1, biblioteca.getId());
            b.setString(2, biblioteca.getTitulo());
            b.setString(3, biblioteca.getAutor());
            b.setString(4, biblioteca.getEditorial());
            b.setInt(5, biblioteca.getAnio_publicacion());
            b.setString(6, biblioteca.getIsbn());
            b.setString(7, biblioteca.getGenero());
            b.setInt(8, biblioteca.getNumero_paginas());
            b.setString(9, biblioteca.getIdioma());
            b.setString(10, biblioteca.getFormato());
            b.setString(11, biblioteca.getDescripcion());
            b.setString(12, biblioteca.getFecha_adquisicion());
            b.setString(13, biblioteca.getPrecio());
            b.setString(14, biblioteca.getEstado());
            b.setString(15, biblioteca.getUbicacion());

            int cantidad = b.executeUpdate();
            fueAgregado = (cantidad > 0);
            
            b.close();
        } catch (Exception ex) {
            System.out.println("Error al agregar libro: " + ex.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return fueAgregado;
    }

    // Método para listar biblioteca
    public ArrayList<ModelBiblioteca> listarBiblioteca() throws SQLException {
        ArrayList<ModelBiblioteca> lbiblioteca = new ArrayList<>();
        Connection conn = conexion.Conectar();

        try {
            String sql = "SELECT * FROM libros";
            PreparedStatement stmt = conn.prepareStatement(sql);
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
                    
                    lbiblioteca.add(t);
                    }
        } catch (SQLException ex) {
            System.out.println("Error al listar la biblioteca: " + ex.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return lbiblioteca;
    }

    // Método para buscar biblioteca por ID
    public ArrayList<ModelBiblioteca> buscarPorID(String id) throws SQLException {
        ArrayList<ModelBiblioteca> lbiblioteca = new ArrayList<>();
        Connection conn = conexion.Conectar();

        try {
            String sql = "SELECT * FROM libros WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
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
                        
                        lbiblioteca.add(t);
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar por ID: " + ex.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return lbiblioteca;
    }

    // Método para eliminar biblioteca
    public boolean eliminarBiblioteca(String id) throws SQLException {
        boolean fueEliminado = false;
        Connection conn = conexion.Conectar();
        try {
            String sql = "DELETE FROM libros WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);

            fueEliminado = (stmt.executeUpdate() > 0);
            stmt.close();
        } catch (Exception ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return fueEliminado;
    }
}