package com.juanma.portlofio.repository;

import com.juanma.portlofio.entity.Formacion;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RFormacion extends JpaRepository<Formacion, Long> {

}
