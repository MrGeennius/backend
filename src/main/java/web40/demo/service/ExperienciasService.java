package web40.demo.service;
import web40.demo.model.Experiencias;
import web40.demo.repository.ExperienciasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciasService implements IExperienciasService{

    @Autowired
    public ExperienciasRepository experienciaRepo;
    
    @Override
    public List<Experiencias> verExperiencias() {
        return experienciaRepo.findAll();
    }

    @Override
    public void crearExperiencias(Experiencias hab) {
        experienciaRepo.save(hab);
    }

    @Override
    public void borrarExperiencias(Long id) {
        experienciaRepo.deleteById(id);
    }
    
    @Override
    public Experiencias buscarExperiencias(Long id) {
       return experienciaRepo.findById(id).orElse(null);
    }
    
}