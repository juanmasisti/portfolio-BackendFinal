
package com.juanma.portlofio.controller;

import com.juanma.portlofio.entity.Imagen;
import com.juanma.portlofio.services.ImagenService;
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
    @RequestMapping("/imagen")
    @CrossOrigin(origins = {"https://juanma-c04c8.web.app/"})
    
public class CImagen {
    @Autowired
    ImagenService imgServ;
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Imagen>> list(){
        return new ResponseEntity(imgServ.list(), HttpStatus.OK);
    }
    
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Imagen> detail(@PathVariable("id") int id){
        return new ResponseEntity(imgServ.getOne(id), HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public void save(@RequestBody Imagen estu) {      
        imgServ.save(estu);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        imgServ.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Imagen estu) {      
        imgServ.save(estu);
    }
}
        
