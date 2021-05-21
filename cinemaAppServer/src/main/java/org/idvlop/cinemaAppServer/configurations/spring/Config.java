package org.idvlop.cinemaAppServer.configurations.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
@EnableSpringHttpSession
public class Config {

    @Bean
    public MapSessionRepository mapSessionRepository() {
        return new MapSessionRepository(new ConcurrentHashMap<>());
    }
}
