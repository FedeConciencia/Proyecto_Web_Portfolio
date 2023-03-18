
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    //Metodo Query Nativo para obtener por Id_Persona Usuario =>
    @Query(
    
            value = "Select u.* from usuario as u inner join persona as p on u.id_persona = p.id where p.id = :id",
            nativeQuery = true       
    
    )
    public Usuario searchUsuario(@Param("id")Long id);
    
}
