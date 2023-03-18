
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.Domicilio;
import com.proyecto.portfolio.repositories.DomicilioRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements BaseService<Domicilio> {
    
    @Autowired
    private DomicilioRepository domicilioRepository;
    
    @Override
    @Transactional
    public List<Domicilio> listRecurso() throws Exception {
        
        try{
            
            return domicilioRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Domicilio readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<Domicilio> entityOptional = domicilioRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Domicilio createRecurso(Domicilio entity) throws Exception{
        
        try{
            
            Domicilio domicilio = domicilioRepository.save(entity);
            
            return domicilio;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Domicilio updateRecurso(Long id, Domicilio entity) throws Exception{
        
        try{
            
            Optional<Domicilio> entityOptional = domicilioRepository.findById(id);
            
            Domicilio domicilio = entityOptional.get();
             
            domicilio = domicilioRepository.save(entity);
            
            return domicilio;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(domicilioRepository.existsById(id)){
                
                domicilioRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Transactional
    public Domicilio buscarDomicilio(Long id) throws Exception{
        
        try{
            
            Domicilio domicilio = domicilioRepository.searchDomicilio(id);
            
            return domicilio;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
