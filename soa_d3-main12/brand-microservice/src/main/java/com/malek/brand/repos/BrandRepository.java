package com.malek.brand.repos;

import com.malek.brand.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,
        Long> {
    Brand findByBrandCode(String code);
}
