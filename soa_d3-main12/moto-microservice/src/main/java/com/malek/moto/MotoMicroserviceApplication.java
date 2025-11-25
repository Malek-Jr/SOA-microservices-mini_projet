package com.malek.moto;

import com.malek.moto.entities.Moto;
import com.malek.moto.repos.MotoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class MotoMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotoMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MotoRepository motoRepository) {
        return args -> {
            motoRepository.save(Moto.builder()
                    .motoName("z1000")
                    .motoPrice(65.0)
                    .brandCode("KWZ")
                    .build());

        };
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
