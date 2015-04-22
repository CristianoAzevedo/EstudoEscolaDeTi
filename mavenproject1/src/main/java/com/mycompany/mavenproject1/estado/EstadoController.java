package com.mycompany.mavenproject1.estado;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    EstadoService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Estado> getEstados() {
        return service.getEstados();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void edit(@RequestBody Estado e) {
        service.edit(e);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Estado e) {
        service.save(e);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Estado getEstado(@PathVariable Long id) {
        return service.getEstado(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
