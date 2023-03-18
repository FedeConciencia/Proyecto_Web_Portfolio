
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.Idioma;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long> {
    
    //Metodo Query Nativo para obtener por Id_Persona una lista de Idiomas =>
    @Query(
    
            value = "Select i.* from idioma as i inner join detalle_idioma as d on d.id_idioma = i.id inner join persona as p on p.id = d.id_persona where p.id = :id",
            nativeQuery = true       
    
    )
    public List<Idioma> searchIdioma(@Param("id")Long id);
    
    
    
}
