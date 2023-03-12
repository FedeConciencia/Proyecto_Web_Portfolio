
package com.proyecto.portfolio.services;

import java.util.List;


public interface BaseService<E> {
    
    public List<E> listRecurso() throws Exception;
    public E readRecurso(Long id) throws Exception;
    public E createRecurso(E entity) throws Exception;
    public E updateRecurso(Long id, E entity) throws Exception;
    public boolean deleteRecurso(Long id) throws Exception;
    
}
