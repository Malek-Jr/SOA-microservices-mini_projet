package com.malek.moto.restControllers;


import com.malek.moto.config.Configuration;
import com.malek.moto.dto.APIResponseDto;
import com.malek.moto.service.MotoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/motos")
@AllArgsConstructor
public class MotoController {
    private MotoService MotoService;

    @Autowired
    Configuration configuration;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getMotoById(@PathVariable("id")
                                                     Long id )
    {
        return  new ResponseEntity<APIResponseDto>(
                MotoService.getMotoById(id), HttpStatus.OK);
    }

    @GetMapping("/author")
    public  ResponseEntity<String> retrieveAuthorInfo() {
        return
                ResponseEntity.status(HttpStatus.OK)
                        .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
