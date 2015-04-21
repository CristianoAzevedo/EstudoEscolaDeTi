
package com.mycompany.mavenproject1.pessoa;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Cristiano
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
