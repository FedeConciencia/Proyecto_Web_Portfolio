
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.ExperienciaLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long> {
    
    
    //Metodo Query Nativo para obtener por Id_Persona Experiencia_Laboral =>
    @Query(
    
            value = "Select ex.* from experiencia_laboral as ex inner join persona as p on ex.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public List<ExperienciaLaboral> searchExperiencia(@Param("id")Long id);
    
}
