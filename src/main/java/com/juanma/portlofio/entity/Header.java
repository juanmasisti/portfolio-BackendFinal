package com.juanma.portlofio.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Header {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 45, message = "No cumple con la cantidad de caracteres permitidos")
    private String titulo;
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la cantidad de caracteres permitidos")
    private String parrafo;
    
    @OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.MERGE)
    @JoinColumn(name = "imagen_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Imagen imagen;
    
    // Constructores

    public Header() {
    }

    public Header(String titulo, String parrafo, Imagen imagen) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.imagen = imagen;
    }
        
}
