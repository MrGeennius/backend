package web40.demo.service;
import java.util.List;
import web40.demo.model.Experiencias;


public interface IExperienciasService {
    public List<Experiencias> verExperiencias();
    
    public void crearExperiencias (Experiencias hab);
    
    public void borrarExperiencias (Long id);
    
    public Experiencias buscarExperiencias (Long id);

}