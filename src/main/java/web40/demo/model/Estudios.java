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
public class Estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String estudio;
    public Estudios(){
    }
    public Estudios(Long id, String estudio){
        this.id = id;
        this.estudio = estudio;
    }
}