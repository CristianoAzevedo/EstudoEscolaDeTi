
package com.mycompany.mavenproject1.cor;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class CorService {
    @Autowired
    CorRepository repo;
    
    public List<Cor> getCores(){
        return repo.findAll();
    }
    
    public Cor getCor(Long id){
        return repo.findOne(id);
    }
    
    public void delete(Long id){
        repo.delete(id);
    }
    
    public void save(Cor c){
        repo.save(c);
    }
    
    public void edit(Cor c){
        repo.save(c);
    }
}
