package web40.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import web40.demo.model.AboutDesc;
import web40.demo.service.AboutDescService;


@RestController
@CrossOrigin(origins ="https://jay-portfolio-316f2.web.app") 
public class AboutDescController {
    @Autowired
    private AboutDescService aboutDescService;

    @GetMapping("/about/ver")
    public AboutDesc getAboutDesc() {
        return aboutDescService.getAboutDesc();
    }
     @PutMapping("/about/guardar")
    public ResponseEntity<AboutDesc> saveAboutrDesc(@RequestBody AboutDesc aboutDesc) {
        AboutDesc nuevoAboutDesc = aboutDescService.saveAboutDesc(aboutDesc);
        return new ResponseEntity<>(nuevoAboutDesc, HttpStatus.CREATED);
    }
    @PutMapping("/about")
    public void updateAboutDesc(@RequestBody AboutDesc aboutDesc) {
        aboutDescService.updateAboutDesc(aboutDesc);
    }
}