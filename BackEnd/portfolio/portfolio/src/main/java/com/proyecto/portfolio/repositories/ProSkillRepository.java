
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.ProSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProSkillRepository extends JpaRepository<ProSkill, Long> {
    
}
