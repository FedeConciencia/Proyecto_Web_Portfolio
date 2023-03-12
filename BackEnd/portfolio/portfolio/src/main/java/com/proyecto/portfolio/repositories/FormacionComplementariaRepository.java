
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.FormacionComplementaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionComplementariaRepository extends JpaRepository<FormacionComplementaria, Long> {
    
}
