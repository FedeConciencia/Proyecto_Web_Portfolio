
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.DetalleProSkill;
import com.proyecto.portfolio.repositories.DetalleProSkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


public class DetalleProSkillService implements BaseService<DetalleProSkill> {
    
    @Autowired
    private DetalleProSkillRepository detalleRepository;
    
    @Override
    @Transactional
    public List<DetalleProSkill> listRecurso() throws Exception {
        
        try{
            
            return detalleRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public DetalleProSkill readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<DetalleProSkill> entityOptional = detalleRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public DetalleProSkill createRecurso(DetalleProSkill entity) throws Exception{
        
        try{
            
            DetalleProSkill detallePro = detalleRepository.save(entity);
            
            return detallePro;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public DetalleProSkill updateRecurso(Long id, DetalleProSkill entity) throws Exception{
        
        try{
            
            Optional<DetalleProSkill> entityOptional = detalleRepository.findById(id);
            
            DetalleProSkill detallePro = entityOptional.get();
             
            detallePro = detalleRepository.save(entity);
            
            return detallePro;
            
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
