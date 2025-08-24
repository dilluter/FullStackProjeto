package io.github.dilluter;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Development
public class AppConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Executando configuração de desenvolvedores");
        };
    }
}
