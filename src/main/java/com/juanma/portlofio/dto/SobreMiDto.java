
package com.juanma.portlofio.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Juanma
 */
public class SobreMiDto {
    @NotBlank
    private String parrafo;
    
    // Constructores

    public SobreMiDto() {
    }

    public SobreMiDto(String parrafo) {
        this.parrafo = parrafo;
    }
    
    // Getters And Setters 

    public String getParrafo() {
        return parrafo;
    }

    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }
    
    
}
