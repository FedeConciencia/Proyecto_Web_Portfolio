
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.Usuario;
import com.proyecto.portfolio.repositories.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements BaseService<Usuario> {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    @Transactional
    public List<Usuario> listRecurso() throws Exception {
        
        try{
            
            return usuarioRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Usuario readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<Usuario> entityOptional = usuarioRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Usuario createRecurso(Usuario entity) throws Exception{
        
        try{
            
            Usuario usuario = usuarioRepository.save(entity);
            
            return usuario;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Usuario updateRecurso(Long id, Usuario entity) throws Exception{
        
        try{
            
            Optional<Usuario> entityOptional = usuarioRepository.findById(id);
            
            Usuario usuario = entityOptional.get();
             
            usuario = usuarioRepository.save(entity);
            
            return usuario;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(usuarioRepository.existsById(id)){
                
                usuarioRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
