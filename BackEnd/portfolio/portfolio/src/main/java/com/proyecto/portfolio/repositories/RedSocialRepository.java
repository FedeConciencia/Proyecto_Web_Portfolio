
package com.proyecto.portfolio.repositories;

import com.proyecto.portfolio.entities.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long> {
    
}
