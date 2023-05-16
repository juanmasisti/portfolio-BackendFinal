package com.juanma.portlofio.controller;

import com.juanma.portlofio.entity.Persona;
import com.juanma.portlofio.services.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPersona {

    @Autowired
    SPersona sPersona;

    //una persona
    @GetMapping("/persona/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") Long id) {
        Persona per = sPersona.getOne(id);
        return new ResponseEntity(per, HttpStatus.OK);
    }

    //todas
    @GetMapping("/persona/ver")
    public ResponseEntity<List<Persona>> list() {
        List<Persona> list = sPersona.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    //crear persona
    @PostMapping("/persona/create")
    public String agregarPersona(@RequestBody Persona per) {

        sPersona.save(per);
        return "La persona fue creada correctamente";
    }

    //eliminar persona
    @DeleteMapping("/persona/delete/{id}")
    public String borrarPersona(@PathVariable Long id) {
        sPersona.delete(id);
        return "La persona fue eliminada correctamente";
    }

    //actualizar persona
    @PutMapping("/persona/update")
    public void edit(@RequestBody Persona persona) {
        sPersona.edit(persona);
    }

    //editar persona
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre, @RequestParam("apellido") String nuevoApellido, @RequestParam("email") String nuevoEmail, @RequestParam("password") String nuevaPassword ) {
        Persona per = sPersona.getOne(id);
        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        per.setEmail(nuevoEmail);
        per.setPassword(nuevaPassword);

        sPersona.save(per);
        return per;

    }
}
