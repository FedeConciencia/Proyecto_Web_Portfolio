
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
    
    //Metodo Query Nativo para obtener por Id_Persona Experiencia_Laboral =>
    @Query(
    
            value = "Select d.* from domicilio as d inner join persona as p on d.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public Domicilio searchDomicilio(@Param("id")Long id);
    
}
