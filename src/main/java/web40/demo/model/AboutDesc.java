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
    
    private String img_url;

    public AboutDesc() {}

    public AboutDesc(String description, String img_url) {
        this.description = description;
        this.img_url = img_url;
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
