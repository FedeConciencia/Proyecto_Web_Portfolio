
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.DetalleProSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProSkillRepository extends JpaRepository<DetalleProSkill, Long> {
    
}
