
package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Habilidad;
import com.juanma.portlofio.repository.RHabilidad;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidad {
    
    @Autowired
    RHabilidad rHabilidad;
    

     //todos los elementos
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
     
     //trae uno
     public Habilidad getOne(int id){
        return rHabilidad.findById(id).orElse(null);
    }
     
     
     
       
    public void save(Habilidad habi){
        rHabilidad.save(habi);
    }
    
    public void delete(int id){
        rHabilidad.deleteById(id);
    }
    
    public void edit(Habilidad habi){
        rHabilidad.save(habi);
    }
    

}
