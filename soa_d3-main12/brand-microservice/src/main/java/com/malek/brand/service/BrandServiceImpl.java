package com.malek.brand.service;


import com.malek.brand.dto.BrandDto;
import com.malek.brand.entities.Brand;
import com.malek.brand.repos.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandServiceImpl  implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public BrandDto getBrandByCode(String code) {
        Brand sec = brandRepository.findByBrandCode(code);
        BrandDto brandDto = new BrandDto(
                sec.getId(),
                sec.getBrandName(),
                sec.getBrandCode()
        );
        return brandDto;
    }
}
