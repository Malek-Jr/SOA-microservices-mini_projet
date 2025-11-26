package com.malek.moto.service;


import com.malek.moto.dto.APIResponseDto;
import com.malek.moto.dto.BrandDto;
import com.malek.moto.dto.MotoDto;
import com.malek.moto.dto.MotoDto;
import com.malek.moto.entities.Moto;
import com.malek.moto.repos.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class MotoServiceImpl implements MotoService{

    private MotoRepository motoRepository;
    private WebClient webClient;
    private APIClient apiClient;

    @Override
    public APIResponseDto getMotoById(Long id) {
        String dname;
        Moto student = motoRepository.findById(id).get();

//        SectionDto sectionDto = webClient.get()
//                .uri("http://localhost:8080/api/sections/" +
//                        student.getSecCode())
//                .retrieve()
//                .bodyToMono(SectionDto.class)
//                .block();
        BrandDto brandDto = apiClient.getBrandByCode(student.getBrandCode());
        if (brandDto == null)
            dname = "Undefined";
        else
            dname = brandDto.getBrandName();
        MotoDto studentDto =  new MotoDto(
                student.getId(),
                student.getMotoName(),
                student.getMotoPrice(),
                student.getBrandCode(),
                dname
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setMotoDto(studentDto);
        apiResponseDto.setBrandDto(brandDto);

        return apiResponseDto;
    }
}
