package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Header;
import com.juanma.portlofio.repository.RHeader;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHeader {

    @Autowired
    RHeader rHeader;

    //todos los elementos
    public List<Header> list() {
        return rHeader.findAll();
    }

    //traer uno
    public Header getOne(int id) {
        Header head = rHeader.findById(id).orElse(null);
        return head;
    }

    public void save(Header head) {
        rHeader.save(head);
    }

    public void delete(int id) {
        rHeader.deleteById(id);
    }

    public void edit(Header head) {
        rHeader.save(head);
    }

}
