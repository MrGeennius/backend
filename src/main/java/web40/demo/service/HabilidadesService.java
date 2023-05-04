package web40.demo.service;
import web40.demo.model.Habilidades;
import web40.demo.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{

    @Autowired
    public HabilidadesRepository habilidadRepo;
    
    @Override
    public List<Habilidades> verHabilidades() {
        return habilidadRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades hab) {
        habilidadRepo.save(hab);
    }

    @Override
    public void borrarHabilidades(Long id) {
        habilidadRepo.deleteById(id);
    }
    
    @Override
    public Habilidades buscarHabilidades(Long id) {
       return habilidadRepo.findById(id).orElse(null);
    }
    
}
