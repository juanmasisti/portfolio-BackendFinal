/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanma.portlofio.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Juanma
 */
public class ProyectoDto {
    @NotBlank
    private String titulo;
    @NotBlank
    private String parrafo;
    @NotBlank
    private String linkPag;
    @NotBlank
    private String imgTitulo;
    @NotBlank
    private String imgTipo;
    @NotBlank
    private String imgBase64;
    
    // Constructores

    public ProyectoDto() {
    }

    public ProyectoDto(String titulo, String parrafo, String linkPag, String imgTitulo, String imgTipo, String imgBase64) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.linkPag = linkPag;
        this.imgTitulo = imgTitulo;
        this.imgTipo = imgTipo;
        this.imgBase64 = imgBase64;
    }
    
    // Getters and Setters

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

    public String getLinkPag() {
        return linkPag;
    }

    public void setLinkPag(String linkPag) {
        this.linkPag = linkPag;
    }

    public String getImgTitulo() {
        return imgTitulo;
    }

    public void setImgTitulo(String imgTitulo) {
        this.imgTitulo = imgTitulo;
    }

    public String getImgTipo() {
        return imgTipo;
    }

    public void setImgTipo(String imgTipo) {
        this.imgTipo = imgTipo;
    }

    public String getImgBase64() {
        return imgBase64;
    }

    public void setImgBase64(String imgBase64) {
        this.imgBase64 = imgBase64;
    }
    
    
}
