
package web40.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web40.demo.model.BannerDesc;
import web40.demo.service.BannerDescService;

@RestController
public class BannerDescController {
    @Autowired
    private BannerDescService bannerDescService;

    @GetMapping("/banner/ver")
    public BannerDesc getBannerDesc() {
        return bannerDescService.getBannerDesc();
    }
     @PutMapping("/banner/guardar")
    public ResponseEntity<BannerDesc> saveBannerDesc(@RequestBody BannerDesc bannerDesc) {
        BannerDesc nuevoBannerDesc = bannerDescService.saveBannerDesc(bannerDesc);
        return new ResponseEntity<>(nuevoBannerDesc, HttpStatus.CREATED);
    }
    @PutMapping("/banner")
    public void updateBannerDesc(@RequestBody BannerDesc bannerDesc) {
        bannerDescService.updateBannerDesc(bannerDesc);
    }
}