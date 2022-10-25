package kodlama.io.rentACar.wepApi.controlles;

import kodlama.io.rentACar.business.abstracts.BrandServise;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation anotasyon,bilgilendirme
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandServise brandServise;
    @Autowired
    public BrandsController(BrandServise brandServise) {
        this.brandServise = brandServise;
    }
    @GetMapping("/getall")
    public List<Brand> getAll() {
        return brandServise.getAll();
    }
}

