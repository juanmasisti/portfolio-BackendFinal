
package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Proyecto;
import com.juanma.portlofio.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SProyecto {
    
    
      @Autowired
    RProyecto rProyecto;
    
     
    //todos los elementos
     public List<Proyecto> list(){
        return rProyecto.findAll();
     }

      
        
    //traer uno
      public Proyecto getOne(long id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }  
     
    
    public void save(Proyecto proye){
       rProyecto.save(proye);
    }
    
     public void delete(long id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
    
} 
    