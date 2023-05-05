package web40.demo.repository;

import web40.demo.model.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciasRepository extends JpaRepository <Experiencias, Long>{
    
}
