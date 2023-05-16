/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.SobreMi;
import com.juanma.portlofio.repository.RSobreMi;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSobreMi {

    @Autowired
    RSobreMi rSobreMi;

    //todos los elementos
    public List<SobreMi> list() {
        return rSobreMi.findAll();
    }

    //un elemento
    public SobreMi getOne(int id) {
        return rSobreMi.findById(id).orElse(null);
    }

    public void save(SobreMi sobre) {
        rSobreMi.save(sobre);
    }

    public void delete(int id) {
        rSobreMi.deleteById(id);
    }

    public void edit(SobreMi sobre) {
        rSobreMi.save(sobre);
    }
}
