package com.nicolas.petshopsystem.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Mapeie todos os endpoints da sua API
                .allowedOrigins("*") // Permita solicitações de todos os origens
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permita os métodos HTTP específicos
                .allowedHeaders("*"); // Permita todos os cabeçalhos HTTP
    }
}
