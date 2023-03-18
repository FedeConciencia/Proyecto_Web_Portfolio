
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.Imagen;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long> {
    
    
    //Metodo Query Nativo para obtener por Id_Persona Experiencia_Laboral =>
    @Query(
    
            value = "Select i.* from imagen as i inner join persona as p on i.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public List<Imagen> searchImagen(@Param("id")Long id);
    
    
    
}
