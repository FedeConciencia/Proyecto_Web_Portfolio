
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.PersonalSkill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalSkillRepository extends JpaRepository<PersonalSkill, Long> {
    
     //Metodo Query Nativo para obtener por Id_Persona una lista de Idiomas =>
    @Query(
    
            value = "Select s.* from personal_skill as s inner join detalle_personal_skill as d on d.id_personal_skill = s.id inner join persona as p on p.id = d.id_personal_skill where p.id = :id",
            nativeQuery = true       
    
    )
    public List<PersonalSkill> searchPersonalSkill(@Param("id")Long id);
    
}
