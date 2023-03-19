
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.DescripcionLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DescripcionLaboralRepository extends JpaRepository<DescripcionLaboral, Long> {
    
    //Metodo Query Nativo para obtener por Id_Persona una lista de Idiomas =>
    @Query(
    
            value = "Select d.* from descripcion_laboral as d inner join experiencia_laboral as e on d.id_experiencia = e.id where e.id = :id",
            nativeQuery = true       
    
    )
    public List<DescripcionLaboral> searchDescripciones(@Param("id")Long id);
    
}
