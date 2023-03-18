
package com.proyecto.portfolio.services;

import com.proyecto.portfolio.entities.ProSkill;
import com.proyecto.portfolio.repositories.ProSkillRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProSkillService implements BaseService<ProSkill> {
    
    @Autowired
    private ProSkillRepository proSkillRepository;
    
    @Override
    @Transactional
    public List<ProSkill> listRecurso() throws Exception {
        
        try{
            
            return proSkillRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public ProSkill readRecurso(Long id) throws Exception{
        
        try{
            
            Optional<ProSkill> entityOptional = proSkillRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public ProSkill createRecurso(ProSkill entity) throws Exception{
        
        try{
            
            ProSkill proSkill = proSkillRepository.save(entity);
            
            return proSkill;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public ProSkill updateRecurso(Long id, ProSkill entity) throws Exception{
        
        try{
            
            Optional<ProSkill> entityOptional = proSkillRepository.findById(id);
            
            ProSkill proSkill = entityOptional.get();
             
            proSkill = proSkillRepository.save(entity);
            
            return proSkill;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteRecurso(Long id) throws Exception{
        
        try{
            
            if(proSkillRepository.existsById(id)){
                
                proSkillRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Transactional
    public List<ProSkill> buscarProSkills(Long id) throws Exception{
        
        try{
            
            List<ProSkill> lista = proSkillRepository.searchProSkill(id);
            
            return lista;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}
