/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanma.portlofio.entity;

/**
 *
 * @author Juanma
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String tipo;
    
    @NotNull
    private String nombre;

    @Column(length = 1000000)
    private byte[] base64;

    // 
    @JsonIgnore
    @OneToMany(mappedBy="imagen", cascade=CascadeType.ALL)
    private Set<Proyecto> proyectos;
    
    @JsonIgnore
    @OneToMany(mappedBy="imagen", cascade = CascadeType.ALL)
    private Set<Formacion> formaciones;
    public Imagen() {}

    public Imagen(String tipo, String nombre, byte[] byte64) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.base64 = byte64;
    }
}
