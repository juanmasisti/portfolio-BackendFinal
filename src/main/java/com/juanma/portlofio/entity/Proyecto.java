
package com.juanma.portlofio.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la cantidad de caracteres permitidos")
    private String titulo;
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la cantidad de caracteres permitidos")
    private String parrafo;
    @Size(min = 1, max = 500, message = "No cumple con la cantidad de caracteres permitidos")
    private String linkPag;
    
    // Relacion imagen en tabla
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "imagen_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Imagen imagen;
    
    
    // Constructores
    public Proyecto() {
    }

    public Proyecto(String titulo, String parrafo, String linkPag, Imagen imagen) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.linkPag = linkPag;
        this.imagen = imagen;
    }
    
}
