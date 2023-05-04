package web40.demo.service;

import web40.demo.model.Persona;
import java.util.List;
import web40.demo.model.Habilidades;


public interface IHabilidadesService {
    public List<Habilidades> verHabilidades();
    
    public void crearHabilidades (Habilidades hab);
    
    public void borrarHabilidades (Long id);
    
    public Habilidades buscarHabilidades (Long id);

}
