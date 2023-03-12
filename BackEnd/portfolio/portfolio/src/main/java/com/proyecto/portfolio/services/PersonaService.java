
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.Persona;
import com.proyecto.portfolio.repositories.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements BaseService<Persona> {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    @Transactional
    public List<Persona> listRecurso() throws Exception {
        
        try{
            
            return personaRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Persona readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<Persona> entityOptional = personaRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Persona createRecurso(Persona entity) throws Exception{
        
        try{
            
            Persona persona = personaRepository.save(entity);
            
            return persona;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Persona updateRecurso(Long id, Persona entity) throws Exception{
        
        try{
            
            Optional<Persona> entityOptional = personaRepository.findById(id);
            
            Persona persona = entityOptional.get();
             
            persona = personaRepository.save(entity);
            
            return persona;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(personaRepository.existsById(id)){
                
                personaRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
