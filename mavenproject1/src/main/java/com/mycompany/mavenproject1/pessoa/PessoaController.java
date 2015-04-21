
package com.mycompany.mavenproject1.pessoa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
    @Autowired
    PessoaService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Pessoa> getPessoas(){
        return service.getPessoas();
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void edit(@RequestBody Pessoa p){
        service.edit(p);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pessoa getPessoa(@RequestParam Long id){
        return service.getPessoa(id);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Pessoa p){
        service.save(p);
    }
}
