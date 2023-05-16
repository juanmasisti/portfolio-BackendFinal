
package com.juanma.portlofio.controller;

import com.juanma.portlofio.entity.Header;
import com.juanma.portlofio.entity.Imagen;
import com.juanma.portlofio.services.ImagenService;
import com.juanma.portlofio.services.SHeader;
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
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/header")
@CrossOrigin(origins = {"https://juanma-c04c8.web.app/"})
public class CHeader {
    @Autowired
    SHeader sHeader;
    
    @Autowired
    ImagenService imagenService;

    //ver todo
    @GetMapping("/lista")
    public ResponseEntity<List<Header>> lista() {
        List<Header> list = sHeader.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    //ver uno
    @GetMapping("/detail/{id}")
    public ResponseEntity<Header> detail(@PathVariable("id") int id) {
        Header header = sHeader.getOne(id);
        return new ResponseEntity(header, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void save(@RequestBody Header head) {
        Imagen imgSobre = imagenService.findByNombre(head.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            head.setImagen(imgSobre);
        }
        sHeader.save(head);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        sHeader.delete(id);
    }

    @PutMapping("/update")
    public void edit(@RequestBody Header head) {
        Imagen imgSobre = imagenService.findByNombre(head.getImagen().getNombre()).orElse(null);
        if (imgSobre != null) {
            head.setImagen(imgSobre);
        }
        sHeader.save(head);
    }
}
