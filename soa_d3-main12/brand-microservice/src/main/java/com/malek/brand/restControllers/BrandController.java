package com.malek.brand.restControllers;


import com.malek.brand.config.Configuration;
import com.malek.brand.dto.BrandDto;
import com.malek.brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

//    @Autowired
//    Configuration configuration;
//    @Value("${build.version}")
//    private String buildVersion;

    public BrandController(BrandService brandService){
        this.brandService = brandService;
    }

    private BrandService brandService;

    @GetMapping("{code}")
    public ResponseEntity<BrandDto> getBrandByCode(@PathVariable("code")
                                                      String code )
    {
        return  new ResponseEntity<BrandDto>(
                brandService.getBrandByCode(code),
                HttpStatus.OK);
    }

//    @GetMapping("/version")
//    public ResponseEntity<String> version()
//    {
//        return
//                ResponseEntity.status(HttpStatus.OK).body(buildVersion);
//    }
//
//    @GetMapping("/author")
//    public  ResponseEntity<String> retrieveAuthorInfo() {
//        return
//                ResponseEntity.status(HttpStatus.OK)
//                        .body(configuration.getName()+" "+configuration.getEmail() );
//    }
}
