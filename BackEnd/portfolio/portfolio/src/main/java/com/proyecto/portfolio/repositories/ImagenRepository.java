
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    
}
