
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.DescripcionLaboral;
import com.proyecto.portfolio.repositories.DescripcionLaboralRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescripcionLaboralService implements BaseService<DescripcionLaboral> {
    
    
    @Autowired
    private DescripcionLaboralRepository descripcionRepository;
    
    @Override
    @Transactional
    public List<DescripcionLaboral> listRecurso() throws Exception {
        
        try{
            
            return descripcionRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public DescripcionLaboral readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<DescripcionLaboral> entityOptional = descripcionRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public DescripcionLaboral createRecurso(DescripcionLaboral entity) throws Exception{
        
        try{
            
            DescripcionLaboral descripcion = descripcionRepository.save(entity);
            
            return descripcion;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public DescripcionLaboral updateRecurso(Long id, DescripcionLaboral entity) throws Exception{
        
        try{
            
            Optional<DescripcionLaboral> entityOptional = descripcionRepository.findById(id);
            
            DescripcionLaboral descripcion = entityOptional.get();
             
            descripcion = descripcionRepository.save(entity);
            
            return descripcion;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(descripcionRepository.existsById(id)){
                
                descripcionRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
