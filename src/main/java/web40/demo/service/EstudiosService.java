package web40.demo.service;
import web40.demo.model.Estudios;
import web40.demo.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService{

    @Autowired
    public EstudiosRepository estudioRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void crearEstudios(Estudios hab) {
        estudioRepo.save(hab);
    }

    @Override
    public void borrarEstudios(Long id) {
        estudioRepo.deleteById(id);
    }
    
    @Override
    public Estudios buscarEstudios(Long id) {
       return estudioRepo.findById(id).orElse(null);
    }
    
}