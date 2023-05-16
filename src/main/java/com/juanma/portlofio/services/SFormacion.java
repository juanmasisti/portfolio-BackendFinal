
package com.juanma.portlofio.services;


import com.juanma.portlofio.entity.Formacion;
import com.juanma.portlofio.repository.RFormacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SFormacion {
@Autowired

RFormacion rFormacion;

  // Devuelve una lista con todas las formaciones
  public List<Formacion> list(){
        return rFormacion.findAll();
    }

  // Devuelve una formacion
      public Formacion getOne(long id){
        Formacion form = rFormacion.findById(id).orElse(null);
        return form;
    }
  

   public void save(Formacion form){
        rFormacion.save(form);
    }     
      
      
     public void delete(long id){
        rFormacion.deleteById(id);
    }
    
    public void edit(Formacion form){
        rFormacion.save(form);
    }
   
    
     public boolean existsById(long id){
        return rFormacion.existsById(id);
    }
    


}