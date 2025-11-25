package com.malek.moto.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MotoDto {

    private Long id;
    private String motoName;
    private Double motoPrice;

    private String brandCode;
    private String brandName;
}
