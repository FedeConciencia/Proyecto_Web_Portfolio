
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.FormacionComplementaria;
import com.proyecto.portfolio.repositories.FormacionComplementariaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionComplementariaService implements BaseService<FormacionComplementaria> {
    
    @Autowired
    private FormacionComplementariaRepository formComplementRepo;
    
    @Override
    @Transactional
    public List<FormacionComplementaria> listRecurso() throws Exception {
        
        try{
            
            return formComplementRepo.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public FormacionComplementaria readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<FormacionComplementaria> entityOptional = formComplementRepo.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public FormacionComplementaria createRecurso(FormacionComplementaria entity) throws Exception{
        
        try{
            
            FormacionComplementaria formComplement = formComplementRepo.save(entity);
            
            return formComplement;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public FormacionComplementaria updateRecurso(Long id, FormacionComplementaria entity) throws Exception{
        
        try{
            
            Optional<FormacionComplementaria> entityOptional = formComplementRepo.findById(id);
            
            FormacionComplementaria formComplement = entityOptional.get();
             
            formComplement = formComplementRepo.save(entity);
            
            return formComplement;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(formComplementRepo.existsById(id)){
                
                formComplementRepo.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Transactional
    public List<FormacionComplementaria> buscarFormComplementarias(Long id) throws Exception{
        
        try{
            
            List<FormacionComplementaria> lista = formComplementRepo.searchFormComplementaria(id);
            
            return lista;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
