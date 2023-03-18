
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.RedSocial;
import com.proyecto.portfolio.repositories.RedSocialRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements BaseService<RedSocial> {
    
    @Autowired
    private RedSocialRepository redSocialRepository;
    
    
    @Override
    @Transactional
    public List<RedSocial> listRecurso() throws Exception {
        
        try{
            
            return redSocialRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public RedSocial readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<RedSocial> entityOptional = redSocialRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public RedSocial createRecurso(RedSocial entity) throws Exception{
        
        try{
            
            RedSocial redSocial = redSocialRepository.save(entity);
            
            return redSocial;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public RedSocial updateRecurso(Long id, RedSocial entity) throws Exception{
        
        try{
            
            Optional<RedSocial> entityOptional = redSocialRepository.findById(id);
            
            RedSocial redSocial = entityOptional.get();
             
            redSocial = redSocialRepository.save(entity);
            
            return redSocial;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(redSocialRepository.existsById(id)){
                
                redSocialRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Transactional
    public List<RedSocial> buscarRedSocial(Long id) throws Exception{
        
        try{
            
            List<RedSocial> lista = redSocialRepository.searchRedSocial(id);
            
            return lista;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
