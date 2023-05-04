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
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String habilidad;
    public Habilidades(){
    }
    public Habilidades(Long id, String habilidad){
        this.id = id;
        this.habilidad = habilidad;
    }
}
