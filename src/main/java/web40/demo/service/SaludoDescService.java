
package web40.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web40.demo.model.SaludoDesc;
import web40.demo.repository.SaludoDescRepository;

@Service
public class SaludoDescService {
    @Autowired
    private SaludoDescRepository saludoRepository;

    public SaludoDesc getSaludoDesc() {
        return saludoRepository.findById(1L).orElse(null);
    }

    public SaludoDesc saveSaludoDesc(SaludoDesc saludoDesc) {
        return saludoRepository.save(saludoDesc);
    }

    public void updateSaludoDesc(SaludoDesc saludoDesc) {
        SaludoDesc currentSaludoDesc = getSaludoDesc();
        if (currentSaludoDesc == null) {
            saludoDesc.setSaludoId(1L);
            saludoRepository.save(saludoDesc);
        } else {
            currentSaludoDesc.setDescription(saludoDesc.getDescription());
            saludoRepository.save(currentSaludoDesc);
        }
    }
}
