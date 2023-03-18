
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.ProSkill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProSkillRepository extends JpaRepository<ProSkill, Long> {
    
     //Metodo Query Nativo para obtener por Id_Persona una lista de Idiomas =>
    @Query(
    
            value = "Select s.* from pro_skill as s inner join detalle_pro_skill as d on d.id_pro_skill = s.id inner join persona as p on p.id = d.id_pro_skill where p.id = :id",
            nativeQuery = true       
    
    )
    public List<ProSkill> searchProSkill(@Param("id")Long id);
    
}
