 package web40.demo.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class BannerDesc {
    @Id
    private Long bannerId = 1L;

    private String description;

    public BannerDesc() {}

    public BannerDesc(String description) {
        this.description = description;
    }

    public Long getBannerId() {
        return bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
