package com.malek.gatewayserver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserverApplication.class, args);
    }

    @Bean
    public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/api/brands/**")
                        .uri("lb://BRAND-MICROSERVICE"))
                .route(p -> p
                        .path("/api/motos/**")
                        .filters( f -> f.circuitBreaker(config ->
                        config.setName("motoCircuitBreaker")
                                .setFallbackUri("forward:/contactAdmin")))

                        .uri("lb://MOTO"))
                .build();
    }
}
