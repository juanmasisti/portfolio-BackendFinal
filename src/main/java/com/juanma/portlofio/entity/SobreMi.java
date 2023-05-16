
package com.juanma.portlofio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author Juanma
 */
@Entity
public class SobreMi {
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id;
    
    @Size(min = 1, max = 500, message = "No cumple con la cantidad de caracteres permitidos")
    private String parrafo;
    
    
    // Constructores

    public SobreMi() {
    }

    public SobreMi(int id,String parrafo) {
        this.id = id;
        this.parrafo = parrafo;
    }
    
    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParrafo() {
        return parrafo;
    }

    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }
    
}
