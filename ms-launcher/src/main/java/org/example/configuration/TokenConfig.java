package org.example.configuration;

import org.example.adapters.TokenJpaAdapter;
import org.exemple.ports.api.TokenServicePort;
import org.exemple.ports.spi.TokenPersistencePort;
import org.exemple.service.TokenServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenConfig {

    @Bean
    public TokenPersistencePort tokenPersistence(){
        return new TokenJpaAdapter();
    }

    @Bean
    public TokenServicePort tokenService(){
        return new TokenServiceImpl(tokenPersistence());
    }
}