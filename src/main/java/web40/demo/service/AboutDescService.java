
package web40.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web40.demo.model.AboutDesc;
import web40.demo.repository.AboutDescRepository;

@Service
public class AboutDescService {
    @Autowired
    private AboutDescRepository aboutRepository;

    public AboutDesc getAboutDesc() {
        return aboutRepository.findById(1L).orElse(null);
    }

    public AboutDesc saveAboutDesc(AboutDesc aboutDesc) {
        return aboutRepository.save(aboutDesc);
    }

    public void updateAboutDesc(AboutDesc aboutDesc) {
        AboutDesc currentAboutDesc = getAboutDesc();
        if (currentAboutDesc == null) {
            aboutDesc.setAboutId(1L);
            aboutRepository.save(aboutDesc);
        } else {
            currentAboutDesc.setDescription(aboutDesc.getDescription());
            aboutRepository.save(currentAboutDesc);
        }
    }
}