/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Javier
 */
public class ModelBiblioteca {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private int anio_publicacion;
    private String isbn;
    private String genero;
    private int numero_paginas;
    private String idioma;
    private String formato;       
    private String descripcion;
    private String fecha_adquisicion;
    private String precio;
    private String estado;
    private String ubicacion;
    
    public ModelBiblioteca(){
    }

    public ModelBiblioteca(int id, String titulo, String autor, String editorial, int anio_publicacion, String isbn, String genero, int numero_paginas, String idioma, String formato, String descripcion, String fecha_adquisicion, String precio, String estado, String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio_publicacion = anio_publicacion;
        this.isbn = isbn;
        this.genero = genero;
        this.numero_paginas = numero_paginas;
        this.idioma = idioma;
        this.formato = formato;
        this.descripcion = descripcion;
        this.fecha_adquisicion = fecha_adquisicion;
        this.precio = precio;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(String fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "ModelBiblioteca{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", a\u00f1o_publicacion=" + anio_publicacion + ", isbn=" + isbn + ", genero=" + genero + ", numero_paginas=" + numero_paginas + ", idioma=" + idioma + ", formato=" + formato + ", descripcion=" + descripcion + ", fecha_adquisicion=" + fecha_adquisicion + ", precio=" + precio + ", estado=" + estado + ", ubicacion=" + ubicacion + '}';
    }



}
