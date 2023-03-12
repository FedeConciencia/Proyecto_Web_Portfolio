
package com.proyecto.portfolio.controllers;

import com.proyecto.portfolio.services.ExperienciaLaboralService;
import com.proyecto.portfolio.entities.ExperienciaLaboral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/expLaboral")
public class ExperienciaLaboralController {
    
    @Autowired
    private ExperienciaLaboralService expLabService;
    
    @GetMapping("/")
    public ResponseEntity<?> getAll(){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(expLabService.listRecurso());
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
         
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(expLabService.readRecurso(id));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
    }
    
    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody ExperienciaLaboral entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(expLabService.createRecurso(entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
                
        }
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody ExperienciaLaboral entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(expLabService.updateRecurso(id, entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
    }
    
    
    public ResponseEntity<?> delete(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(expLabService.deleteRecurso(id));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
        
    }
    
}
