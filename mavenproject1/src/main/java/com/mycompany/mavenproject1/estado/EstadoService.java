package com.mycompany.mavenproject1.estado;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class EstadoService {
    
    @Autowired
    EstadoRepository repo;
    
    public void save(Estado e){
        repo.save(e);
    }
    
    public void edit(Estado e){
        repo.save(e);
    }
    
    public List<Estado> getEstados(){
        return repo.findAll();
    }
    
    public Estado getEstado(Long id){
        return repo.findOne(id);
    }
    
    public void delete(Long id){
        repo.delete(id);
    }
}
