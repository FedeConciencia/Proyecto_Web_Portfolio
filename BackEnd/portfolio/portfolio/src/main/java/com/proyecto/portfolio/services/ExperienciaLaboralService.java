
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.ExperienciaLaboral;
import com.proyecto.portfolio.repositories.ExperienciaLaboralRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements BaseService<ExperienciaLaboral> {
    
    @Autowired
    private ExperienciaLaboralRepository expeLabRepo;
    
    @Override
    @Transactional
    public List<ExperienciaLaboral> listRecurso() throws Exception {
        
        try{
            
            return expeLabRepo.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public ExperienciaLaboral readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<ExperienciaLaboral> entityOptional = expeLabRepo.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public ExperienciaLaboral createRecurso(ExperienciaLaboral entity) throws Exception{
        
        try{
            
            ExperienciaLaboral expeLab = expeLabRepo.save(entity);
            
            return expeLab;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public ExperienciaLaboral updateRecurso(Long id, ExperienciaLaboral entity) throws Exception{
        
        try{
            
            Optional<ExperienciaLaboral> entityOptional = expeLabRepo.findById(id);
            
            ExperienciaLaboral expeLab = entityOptional.get();
             
            expeLab = expeLabRepo.save(entity);
            
            return expeLab;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(expeLabRepo.existsById(id)){
                
                expeLabRepo.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
