
package web40.demo.controller;
import web40.demo.model.Persona;
import web40.demo.service.IPersonaService;
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


@RestController
@CrossOrigin(origins ="https://jay-portfolio-316f2.web.app")
public class Controller { 

@Autowired
private IPersonaService persoServ;

@PostMapping ("/new/persona")
public void agregarPersona (@RequestBody Persona pers) {
    persoServ.crearPersona(pers);
}
     
@GetMapping ("/ver/personas")
@ResponseBody
public List<Persona> verPersonas (){
    return persoServ.verPersonas();
}
@DeleteMapping("/delete/{id}")
public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
}

@PutMapping("/modificar/{id}")
public Persona actualizarPersona (@PathVariable Long id, 
        @RequestBody Persona personaActualizada){

    Persona pers = persoServ.buscarPersona(id);
    pers.setNombre(personaActualizada.getNombre());
    pers.setApellido(personaActualizada.getApellido());
    pers.setDescripcion(personaActualizada.getDescripcion());
  
    persoServ.crearPersona(pers);
    return pers;
}
}