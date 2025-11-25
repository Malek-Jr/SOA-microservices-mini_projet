package com.malek.brand.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto {

    private Long id;
    private String BrandName;
    private String BrandCode;
}
