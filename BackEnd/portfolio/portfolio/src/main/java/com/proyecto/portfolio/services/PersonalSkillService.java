
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.PersonalSkill;
import com.proyecto.portfolio.entities.Usuario;
import com.proyecto.portfolio.repositories.PersonalSkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalSkillService implements BaseService<PersonalSkill> {
    
    @Autowired
    private PersonalSkillRepository personalSkillRepository;
    
    @Override
    @Transactional
    public List<PersonalSkill> listRecurso() throws Exception {
        
        try{
            
            return personalSkillRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public PersonalSkill readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<PersonalSkill> entityOptional = personalSkillRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public PersonalSkill createRecurso(PersonalSkill entity) throws Exception{
        
        try{
            
            PersonalSkill personalSkill =  personalSkillRepository.save(entity);
            
            return personalSkill;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public PersonalSkill updateRecurso(Long id, PersonalSkill entity) throws Exception{
        
        try{
            
            Optional<PersonalSkill> entityOptional = personalSkillRepository.findById(id);
            
            PersonalSkill personalSkill = entityOptional.get();
             
            personalSkill = personalSkillRepository.save(entity);
            
            return personalSkill;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(personalSkillRepository.existsById(id)){
                
                personalSkillRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
