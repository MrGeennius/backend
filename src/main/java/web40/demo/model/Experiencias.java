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
public class Experiencias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tab;
    private String titulo;
    private String fecha;
    private String description;
    public Experiencias(){
    }
    public Experiencias(Long id, String tab, String titulo,String fecha, String description){
        this.id = id;
        this.tab = tab;
        this.titulo = titulo;
        this.fecha = fecha;
        this.description = description;
    }
}
