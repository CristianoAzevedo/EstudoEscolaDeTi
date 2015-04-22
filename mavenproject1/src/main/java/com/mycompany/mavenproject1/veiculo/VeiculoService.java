package com.mycompany.mavenproject1.veiculo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class VeiculoService {
    
    @Autowired
    VeiculoRepository repo;
    
    public void save(Veiculo v){
        repo.save(v);
    }
    
    public void edit(Veiculo v){
        repo.save(v);
    }
    
    public Veiculo getVeiculo(Long id){
        return repo.findOne(id);
    }
    
    public List<Veiculo> getVeiculos(){
        return repo.findAll();
    }
    
    public void delete(Long id){
        repo.delete(id);
    }
}
