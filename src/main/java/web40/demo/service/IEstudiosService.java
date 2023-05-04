package web40.demo.service;
import java.util.List;
import web40.demo.model.Estudios;


public interface IEstudiosService {
    public List<Estudios> verEstudios();
    
    public void crearEstudios (Estudios hab);
    
    public void borrarEstudios (Long id);
    
    public Estudios buscarEstudios (Long id);

}
