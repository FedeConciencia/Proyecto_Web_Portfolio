
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.FormacionAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionAcademicaRepository extends JpaRepository<FormacionAcademica, Long> {
    
}
