
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.FormacionComplementaria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionComplementariaRepository extends JpaRepository<FormacionComplementaria, Long> {
    
    //Metodo Query Nativo para obtener por Id_Persona una lista de FormComplementaria =>
    @Query(
    
            value = "Select f.* from formacion_complementaria as f inner join persona as p on f.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public List<FormacionComplementaria> searchFormComplementaria(@Param("id")Long id);
    
}
