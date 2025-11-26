package com.malek.moto.service;
import com.malek.moto.dto.BrandDto;
import org.springframework.stereotype.Component;
@Component
public class DeptFallback implements APIClient {
        @Override
        public BrandDto getBrandByCode(String brandCode) {
            return null;
        }
    }


