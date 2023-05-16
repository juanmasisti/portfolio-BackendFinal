
package com.juanma.portlofio.dto;

import javax.validation.constraints.NotBlank;


public class FormacionDto {
    // No pueden estar vacíos
    @NotBlank
    private String titulo;
    @NotBlank
    private String parrafo;
    @NotBlank
    private String periodo;
    @NotBlank
    private String imgTitulo;
    @NotBlank
    private String imgBase64;
    @NotBlank
    private String imgTipo;
    @NotBlank
    private String eleccion;
    

    // Constructores 

    public FormacionDto() {
    }

    public FormacionDto(String titulo, String parrafo, String periodo, String imgtitulo, String imgbase64, String imgtipo, String eleccion) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.periodo = periodo;
        this.imgTitulo = imgtitulo;
        this.imgBase64 = imgbase64;
        this.imgTipo = imgtipo;
        this.eleccion = eleccion;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getImgtitulo() {
        return imgTitulo;
    }

    public void setImgtitulo(String imgtitulo) {
        this.imgTitulo = imgtitulo;
    }

    public String getImgbase64() {
        return imgBase64;
    }

    public void setImgbase64(String imgbase64) {
        this.imgBase64 = imgbase64;
    }

    public String getImgtipo() {
        return imgTipo;
    }

    public void setImgtipo(String imgtipo) {
        this.imgTipo = imgtipo;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

  

    
    
    
}
