
package com.juanma.portlofio.repository;

import com.juanma.portlofio.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto, Long>{
   
}