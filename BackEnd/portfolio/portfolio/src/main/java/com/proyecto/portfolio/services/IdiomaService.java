
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.Idioma;
import com.proyecto.portfolio.repositories.IdiomaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements BaseService<Idioma> {
    
    @Autowired
    private IdiomaRepository idiomaRepository;
    
    @Override
    @Transactional
    public List<Idioma> listRecurso() throws Exception {
        
        try{
            
            return idiomaRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Idioma readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<Idioma> entityOptional = idiomaRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Idioma createRecurso(Idioma entity) throws Exception{
        
        try{
            
            Idioma usuario = idiomaRepository.save(entity);
            
            return usuario;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Idioma updateRecurso(Long id, Idioma entity) throws Exception{
        
        try{
            
            Optional<Idioma> entityOptional = idiomaRepository.findById(id);
            
            Idioma idioma = entityOptional.get();
             
            idioma = idiomaRepository.save(entity);
            
            return idioma;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(idiomaRepository.existsById(id)){
                
                idiomaRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
