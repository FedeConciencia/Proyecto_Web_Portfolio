
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.DetalleIdioma;
import com.proyecto.portfolio.repositories.DetalleIdiomaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleIdiomaService implements BaseService<DetalleIdioma> {
    
    @Autowired
    private DetalleIdiomaRepository detalleRepository;
    
    @Override
    @Transactional
    public List<DetalleIdioma> listRecurso() throws Exception {
        
        try{
            
            return detalleRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public DetalleIdioma readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<DetalleIdioma> entityOptional = detalleRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public DetalleIdioma createRecurso(DetalleIdioma entity) throws Exception{
        
        try{
            
            DetalleIdioma detalleIdioma = detalleRepository.save(entity);
            
            return detalleIdioma;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public DetalleIdioma updateRecurso(Long id, DetalleIdioma entity) throws Exception{
        
        try{
            
            Optional<DetalleIdioma> entityOptional = detalleRepository.findById(id);
            
            DetalleIdioma detalleIdioma = entityOptional.get();
             
            detalleIdioma = detalleRepository.save(entity);
            
            return detalleIdioma;
            
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
