package com.juanma.portlofio.security.service;

import com.juanma.portlofio.security.entity.Rol;
import com.juanma.portlofio.security.enums.RolNombre;
import com.juanma.portlofio.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    IRolRepository irolRepository;

    //no olvidarme la I mayuscula
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
