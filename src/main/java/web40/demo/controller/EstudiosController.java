
package web40.demo.Controller;
import web40.demo.model.Estudios;
import web40.demo.service.IEstudiosService;
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
import web40.demo.service.IEstudiosService;

@RestController
@CrossOrigin(origins ="https://jay-portfolio-316f2.web.app")
public class EstudiosController { 

@Autowired
private IEstudiosService habServ;

@PostMapping ("/estudio/nueva")
public void agregarEstudios (@RequestBody Estudios hab) {
    habServ.crearEstudios(hab);
}
     
@GetMapping ("/estudio/ver")
@ResponseBody
public List<Estudios> verEstudios (){
    return habServ.verEstudios();
}
@DeleteMapping("estudio/borrar/{id}")
public void borrarEstudios (@PathVariable Long id){
    habServ.borrarEstudios(id);
}

@PutMapping("/estudio/modificar/{id}")
public Estudios actualizarEstudios (@PathVariable Long id, 
        @RequestBody Estudios estudioActualizada){

    Estudios hab = habServ.buscarEstudios(id);
    hab.setEstudio(estudioActualizada.getEstudio());
  
    habServ.crearEstudios(hab);
    return hab;
}
}
