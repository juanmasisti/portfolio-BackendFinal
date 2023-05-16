
package com.juanma.portlofio.controller;

import com.juanma.portlofio.dto.FormacionDto;
import com.juanma.portlofio.entity.Formacion;
import com.juanma.portlofio.entity.Imagen;
import com.juanma.portlofio.security.controller.Mensaje;
import com.juanma.portlofio.services.ImagenService;
import com.juanma.portlofio.services.SFormacion;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
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
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/formacion")
@CrossOrigin(origins = {"http://localhost:4200/"})
public class CFormacion {
    @Autowired
    SFormacion sFormacion;
    
    @Autowired
    ImagenService imagenService;
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Formacion>> list(){
        return new ResponseEntity(sFormacion.list(), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Formacion> detail(@PathVariable("id") int id){
        return new ResponseEntity(sFormacion.getOne(id), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void save(@RequestBody Formacion form) {
        Imagen imgSobre = imagenService.findByNombre(form.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            form.setImagen(imgSobre);
        }
        
        sFormacion.save(form);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sFormacion.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Formacion form) {
        Imagen imgSobre = imagenService.findByNombre(form.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            form.setImagen(imgSobre);
        }
        sFormacion.save(form);
    }
}
