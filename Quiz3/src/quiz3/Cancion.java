/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3;

/**
 *
 * @author rodri
 */
public class Cancion {
    private int idCancion;
    private String titulo;
    private String autor;
    private int duracion;
    private int año;

   
    public Cancion(int idCancion, String titulo, String autor, int duracion, int año) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.año = año;
    }

    
    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}


