
package web40.demo.Controller;
import web40.demo.model.Habilidades;
import web40.demo.service.IHabilidadesService;
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
import web40.demo.service.IHabilidadesService;

@RestController
@CrossOrigin(origins ="https://jay-portfolio-316f2.web.app")
public class HabilidadesController { 

@Autowired
private IHabilidadesService habServ;

@PostMapping ("/habilidad/nueva")
public void agregarHabilidades (@RequestBody Habilidades hab) {
    habServ.crearHabilidades(hab);
}
     
@GetMapping ("/habilidad/ver")
@ResponseBody
public List<Habilidades> verHabilidades (){
    return habServ.verHabilidades();
}
@DeleteMapping("habilidad/borrar/{id}")
public void borrarHabilidades (@PathVariable Long id){
    habServ.borrarHabilidades(id);
}

@PutMapping("/habilidad/modificar/{id}")
public Habilidades actualizarHabilidades (@PathVariable Long id, 
        @RequestBody Habilidades habilidadActualizada){

    Habilidades hab = habServ.buscarHabilidades(id);
    hab.setHabilidad(habilidadActualizada.getHabilidad());
  
    habServ.crearHabilidades(hab);
    return hab;
}
}
