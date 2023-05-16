
package com.juanma.portlofio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 40, message = "Ingrese un nombre válido")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 40, message = "Ingrese un apellido válido")
    private String apellido;
    @NotNull
    @Size(min = 1, max = 40, message = "Ingrese un mail válido")
    private String email;
    @NotNull
    @Size(min = 1, max = 40, message = "Ingrese una contraseña válido")
    private String password;
    
    public Persona(){
        
    }

    public Persona(Long id, String nombre, String apellido, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }
    
    
}
