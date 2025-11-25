package com.malek.moto.service;

import com.malek.moto.dto.BrandDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(url = "http://localhost:8080", value = "BRAND")
//@FeignClient(name = "BRAND-MICROSERVICE",fallback = DeptFallback.class)
@FeignClient(name = "BRAND-MICROSERVICE")
public interface APIClient {
        @GetMapping("api/brands/{brand-code}")
        BrandDto getBrandByCode(@PathVariable("brand-code") String brandCode
        );
}
