
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.RedSocial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long> {
    
     //Metodo Query Nativo para obtener por Id_Persona una lista de Idiomas =>
    @Query(
    
            value = "Select r.* from red_social as r inner join persona as p on r.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public List<RedSocial> searchRedSocial(@Param("id")Long id);
    
}
