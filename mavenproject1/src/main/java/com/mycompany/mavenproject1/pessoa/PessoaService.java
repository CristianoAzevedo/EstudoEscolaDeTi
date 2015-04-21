
package com.mycompany.mavenproject1.pessoa;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class PessoaService {
    
    @Autowired
    PessoaRepository repo;
    
    public void save(Pessoa p){
        repo.save(p);
    }
    
    public void edit(Pessoa p){
        repo.save(p);
    }
    
    public List<Pessoa> getPessoas(){
        return repo.findAll();
    }
    
    public Pessoa getPessoa(Long id){
        return repo.findOne(id);
    }
    
    public void delete(Long id){
        repo.delete(id);
    }
}
