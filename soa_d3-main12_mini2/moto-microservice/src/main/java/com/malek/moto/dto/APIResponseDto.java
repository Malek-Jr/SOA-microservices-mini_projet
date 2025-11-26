package com.malek.moto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private MotoDto motoDto;
    private BrandDto brandDto;
}
