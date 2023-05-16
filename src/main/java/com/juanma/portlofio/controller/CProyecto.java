package com.juanma.portlofio.controller;

import com.juanma.portlofio.entity.Imagen;
import com.juanma.portlofio.entity.Proyecto;
import com.juanma.portlofio.services.ImagenService;
import com.juanma.portlofio.services.SProyecto;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/proyecto")
@CrossOrigin(origins = {"https://juanma-c04c8.web.app/"})

public class CProyecto {

    @Autowired
    SProyecto sProyecto;
    
    @Autowired
    ImagenService imagenService;

    // ver todos
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>> lista() {
        List<Proyecto> list = sProyecto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    //ver uno
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> detail(@PathVariable("id") int id) {
        Proyecto proye = sProyecto.getOne(id);
        return new ResponseEntity(proye, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void save(@RequestBody Proyecto proye) {
        Imagen imgSobre = imagenService.findByNombre(proye.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            proye.setImagen(imgSobre);
        }
        sProyecto.save(proye);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        sProyecto.delete(id);
    }

    @PutMapping("/update")
    public void edit(@RequestBody Proyecto proye) {
        Imagen imgSobre = imagenService.findByNombre(proye.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            proye.setImagen(imgSobre);
        }
        sProyecto.save(proye);
    }

}
