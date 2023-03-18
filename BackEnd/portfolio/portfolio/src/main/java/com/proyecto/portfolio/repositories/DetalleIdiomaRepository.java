
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.DetalleIdioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleIdiomaRepository extends JpaRepository<DetalleIdioma, Long> {
    
    

}
