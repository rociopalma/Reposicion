/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicion;

/**
 *
 * @author Rocío
 */
public class Servicio {

    private String categoria;
    private String descripcion;

    public Servicio() {
        
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    

    public String toString() {
        return "Categoria: " + categoria + " Descripcion: " + descripcion;
    }
}
