
package com.juanma.portlofio.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Habilidad {
           
@Id
@GeneratedValue (strategy= GenerationType.IDENTITY)
private int id;
    
    @NotNull
    private String titulo;
    @NotNull
    private String parrafo;
    @NotNull
    @Min(0)
    @Max(100)
    private int porcentaje;
    

    


    // C
    public Habilidad() {
    }

    public Habilidad(int id, String titulo, String parrafo, int porcentaje) {
        this.id = id;
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.porcentaje = porcentaje;
    }

    
    // Getters And Setters

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

    public String getParrafo() {
        return parrafo;
    }

    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
    
}
