package io.github.dilluter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {
    @Bean(name = "cachorro")
    public Animal cachorro() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("AU AAU!");
            }
        };
    }
    @Bean(name = "gato")
    public Animal gato() {
        return new Animal() {
            @Override
            public void sound() {
                System.out.println("MIAAU!");
            }
        };
    }
}


