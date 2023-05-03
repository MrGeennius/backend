
package web40.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web40.demo.model.SaludoDesc;
import web40.demo.service.SaludoDescService;

@RestController
public class SaludoDescController {
    @Autowired
    private SaludoDescService saludoDescService;

    @GetMapping("/saludo/ver")
    public SaludoDesc getSaludoDesc() {
        return saludoDescService.getSaludoDesc();
    }
     @PutMapping("/saludo/guardar")
    public ResponseEntity<SaludoDesc> saveSaludoDesc(@RequestBody SaludoDesc saludoDesc) {
        SaludoDesc nuevoSaludoDesc = saludoDescService.saveSaludoDesc(saludoDesc);
        return new ResponseEntity<>(nuevoSaludoDesc, HttpStatus.CREATED);
    }
    @PutMapping("/saludo")
    public void updateSaludoDesc(@RequestBody SaludoDesc saludoDesc) {
        saludoDescService.updateSaludoDesc(saludoDesc);
    }
}