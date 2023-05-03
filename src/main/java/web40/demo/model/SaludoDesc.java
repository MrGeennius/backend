 package web40.demo.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class SaludoDesc {
    @Id
    private Long saludoId = 1L;

    private String description;

    public SaludoDesc() {}

    public SaludoDesc(String description) {
        this.description = description;
    }

    public Long getSaludoId() {
        return saludoId;
    }

    public void setSaludoId(Long saludoId) {
        this.saludoId = saludoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
