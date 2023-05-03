 package web40.demo.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class AboutDesc {
    @Id
    private Long aboutId = 1L;

    private String description;

    public AboutDesc() {}

    public AboutDesc(String description) {
        this.description = description;
    }

    public Long getAboutId() {
        return aboutId;
    }

    public void setAboutId(Long aboutId) {
        this.aboutId = aboutId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
