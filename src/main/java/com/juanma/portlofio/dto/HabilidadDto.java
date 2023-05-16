
package com.juanma.portlofio.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author Juanma
 */
public class HabilidadDto {
    @NotBlank
    private String titulo;
    @NotBlank
    private String parrafo;
    @NotBlank
    @Min(0)
    @Max(100)
    private String porcentaje;

    public HabilidadDto() {
    }

    public HabilidadDto(String titulo, String parrafo, String porcentaje) {
        this.titulo = titulo;
        this.parrafo = parrafo;
        this.porcentaje = porcentaje;
    }
    
    
}
