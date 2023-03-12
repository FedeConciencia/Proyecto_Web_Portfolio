
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.Imagen;
import com.proyecto.portfolio.repositories.ImagenRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenService implements BaseService<Imagen> {
    
    @Autowired
    private ImagenRepository imagenRepository;
    
    @Override
    @Transactional
    public List<Imagen> listRecurso() throws Exception {
        
        try{
            
            return imagenRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Imagen readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<Imagen> entityOptional = imagenRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Imagen createRecurso(Imagen entity) throws Exception{
        
        try{
            
            Imagen imagen = imagenRepository.save(entity);
            
            return imagen;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Imagen updateRecurso(Long id, Imagen entity) throws Exception{
        
        try{
            
            Optional<Imagen> entityOptional = imagenRepository.findById(id);
            
            Imagen imagen = entityOptional.get();
             
            imagen = imagenRepository.save(entity);
            
            return imagen;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(imagenRepository.existsById(id)){
                
                imagenRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
