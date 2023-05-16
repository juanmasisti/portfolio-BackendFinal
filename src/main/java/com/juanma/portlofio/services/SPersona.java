package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Persona;
import com.juanma.portlofio.repository.RPersona;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {

    @Autowired

    RPersona rPersona;

    //todos los elementos
    public List<Persona> list() {
        return rPersona.findAll();
    }

    //traer uno
    public Persona getOne(Long id) {
        Persona per = rPersona.findById(id).orElse(null);
        return per;
    }


    public void save(Persona per) {
        rPersona.save(per);
    }

    public void delete(Long id) {
        rPersona.deleteById(id);
    }

    public void edit(Persona per) {
        rPersona.save(per);
    }


}
