
package web40.demo.Controller;
import web40.demo.model.Experiencias;
import web40.demo.service.IExperienciasService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web40.demo.service.IExperienciasService;

@RestController
@CrossOrigin(origins ="https://jay-portfolio-316f2.web.app")
public class ExperienciasController { 

@Autowired
private IExperienciasService habServ;

@PostMapping ("/experiencia/nueva")
public void agregarExperiencias (@RequestBody Experiencias hab) {
    habServ.crearExperiencias(hab);
}
     
@GetMapping ("/experiencia/ver")
@ResponseBody
public List<Experiencias> verExperiencias (){
    return habServ.verExperiencias();
}
@DeleteMapping("experiencia/borrar/{id}")
public void borrarExperiencias (@PathVariable Long id){
    habServ.borrarExperiencias(id);
}

@PutMapping("/experiencia/modificar/{id}")
public Experiencias actualizarExperiencias (@PathVariable Long id, 
        @RequestBody Experiencias experienciaActualizada){

    Experiencias hab = habServ.buscarExperiencias(id);
    hab.setTab(experienciaActualizada.getTab());
    hab.setTitulo(experienciaActualizada.getTitulo());
    hab.setFecha(experienciaActualizada.getFecha());
    hab.setDescription(experienciaActualizada.getDescription());
  
    habServ.crearExperiencias(hab);
    return hab;
}
}