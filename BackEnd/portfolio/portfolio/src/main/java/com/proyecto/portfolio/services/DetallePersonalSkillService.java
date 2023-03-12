
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.DetallePersonalSkill;
import com.proyecto.portfolio.repositories.DetallePersonalSkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePersonalSkillService implements BaseService<DetallePersonalSkill>{
    
    @Autowired
    private DetallePersonalSkillRepository detalleRepository;
    
    @Override
    @Transactional
    public List<DetallePersonalSkill> listRecurso() throws Exception {
        
        try{
            
            return detalleRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public DetallePersonalSkill readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<DetallePersonalSkill> entityOptional = detalleRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public DetallePersonalSkill createRecurso(DetallePersonalSkill entity) throws Exception{
        
        try{
            
            DetallePersonalSkill detallePerso = detalleRepository.save(entity);
            
            return detallePerso;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public DetallePersonalSkill updateRecurso(Long id, DetallePersonalSkill entity) throws Exception{
        
        try{
            
            Optional<DetallePersonalSkill> entityOptional = detalleRepository.findById(id);
            
            DetallePersonalSkill detallePerso = entityOptional.get();
             
            detallePerso = detalleRepository.save(entity);
            
            return detallePerso;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(detalleRepository.existsById(id)){
                
                detalleRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
