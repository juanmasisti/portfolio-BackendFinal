package com.juanma.portlofio.controller;

import com.juanma.portlofio.entity.SobreMi;
import com.juanma.portlofio.services.SSobreMi;
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

@RequestMapping("/sobremi")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CSobreMi {

    @Autowired
    SSobreMi sSobreMi;

    //ver todo
    @GetMapping("/lista")
    public ResponseEntity<List<SobreMi>> lista() {
        List<SobreMi> list = sSobreMi.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    //ver uno
    @GetMapping("/detail/{id}")
    public ResponseEntity<SobreMi> detail(@PathVariable("id") int id) {
        SobreMi sobreMi = sSobreMi.getOne(id);
        return new ResponseEntity(sobreMi, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void save(@RequestBody SobreMi sobre) {
        sSobreMi.save(sobre);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        sSobreMi.delete(id);
    }

    @PutMapping("/update")
    public void edit(@RequestBody SobreMi sobre) {
        sSobreMi.save(sobre);
    }
}
