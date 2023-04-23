package web40.demo.repository;

import web40.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

    public void save(Long id);
    
}
