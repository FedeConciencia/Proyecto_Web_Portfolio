
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.DescripcionLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescripcionLaboralRepository extends JpaRepository<DescripcionLaboral, Long> {
    
}
