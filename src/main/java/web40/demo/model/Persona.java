/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web40.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mrgee
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String email;
    private String contraseña;    
    public Persona(){
    }
    public Persona(Long id, String email, String contraseña){
        this.id = id;
        this.email = email;
        this.contraseña = contraseña;
    }

}
