/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Imagen;
import com.juanma.portlofio.repository.ImagenRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juanma
 */
@Service
public class ImagenService {
    @Autowired
    ImagenRepository imgRepo;
     
    public Optional<Imagen> findByNombre(String nombre) {
        return imgRepo.findByNombre(nombre);
    }
    
    public List<Imagen> list(){
        return imgRepo.findAll();
    }
    
    public Imagen getOne(long id){
        return imgRepo.findById(id).orElse(null);
    }
    
    public void save(Imagen apren){
        imgRepo.save(apren);
    }  
    
    public void delete(long id) {
        imgRepo.deleteById(id);
    }
}
