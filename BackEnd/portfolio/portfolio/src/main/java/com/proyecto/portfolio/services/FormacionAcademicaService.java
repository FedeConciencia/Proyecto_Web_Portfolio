
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.FormacionAcademica;
import com.proyecto.portfolio.repositories.FormacionAcademicaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionAcademicaService implements BaseService<FormacionAcademica> {
    
    @Autowired
    private FormacionAcademicaRepository formAcademicRepo;
    
    @Override
    @Transactional
    public List<FormacionAcademica> listRecurso() throws Exception {
        
        try{
            
            return formAcademicRepo.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public FormacionAcademica readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<FormacionAcademica> entityOptional = formAcademicRepo.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public FormacionAcademica createRecurso(FormacionAcademica entity) throws Exception{
        
        try{
            
            FormacionAcademica formAcademic = formAcademicRepo.save(entity);
            
            return formAcademic;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public FormacionAcademica updateRecurso(Long id, FormacionAcademica entity) throws Exception{
        
        try{
            
            Optional<FormacionAcademica> entityOptional = formAcademicRepo.findById(id);
            
            FormacionAcademica formAcademic = entityOptional.get();
             
            formAcademic = formAcademicRepo.save(entity);
            
            return formAcademic;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(formAcademicRepo.existsById(id)){
                
                formAcademicRepo.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Transactional
    public List<FormacionAcademica> buscarFormAcademicas(Long id) throws Exception{
        
        try{
            
            List<FormacionAcademica> lista = formAcademicRepo.searchFormAcademicas(id);
            
            return lista;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
