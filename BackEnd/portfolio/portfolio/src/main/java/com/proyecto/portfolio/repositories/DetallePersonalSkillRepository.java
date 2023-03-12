
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.DetallePersonalSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePersonalSkillRepository extends JpaRepository<DetallePersonalSkill, Long> {
    
}
