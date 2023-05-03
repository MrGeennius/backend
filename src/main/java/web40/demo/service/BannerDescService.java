
package web40.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web40.demo.model.BannerDesc;
import web40.demo.repository.BannerDescRepository;

@Service
public class BannerDescService {
    @Autowired
    private BannerDescRepository bannerRepository;

    public BannerDesc getBannerDesc() {
        return bannerRepository.findById(1L).orElse(null);
    }

    public BannerDesc saveBannerDesc(BannerDesc bannerDesc) {
        return bannerRepository.save(bannerDesc);
    }

    public void updateBannerDesc(BannerDesc bannerDesc) {
        BannerDesc currentBannerDesc = getBannerDesc();
        if (currentBannerDesc == null) {
            bannerDesc.setBannerId(1L);
            bannerRepository.save(bannerDesc);
        } else {
            currentBannerDesc.setDescription(bannerDesc.getDescription());
            bannerRepository.save(currentBannerDesc);
        }
    }
}
