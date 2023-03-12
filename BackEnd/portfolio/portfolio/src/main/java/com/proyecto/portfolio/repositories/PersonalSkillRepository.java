
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.PersonalSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalSkillRepository extends JpaRepository<PersonalSkill, Long> {
    
}