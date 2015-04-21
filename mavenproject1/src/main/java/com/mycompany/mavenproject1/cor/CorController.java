
package com.mycompany.mavenproject1.cor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cor")
public class CorController {
    
    @Autowired
    CorService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cor> getCores(){
        return service.getCores();
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void edit(@RequestBody Cor c){
        service.edit(c);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Cor c){
        service.save(c);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cor getCor(@PathVariable Long id){
        return service.getCor(id);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
