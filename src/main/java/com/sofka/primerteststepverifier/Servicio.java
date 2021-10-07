package com.sofka.primerteststepverifier;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public final class Servicio {


        public Mono<String> buscarUno() {
            return Mono.just("Pedro");
        }
        public Flux<String> buscarTodos() {
            return Flux.just("Pedro", "Maria", "Jesus", "Carmen");
        }
        public Flux<String> buscarTodosLento() {
            return Flux.just("Pedro", "Maria", "Jesus", "Carmen").delaySequence(Duration.ofSeconds(20));
        }


    public Flux<String> buscarTodosFiltro() {
        Flux<String> source = Flux.just("John", "Monica", "Mark", "Cloe", "Frank", "Casper", "Olivia", "Emily", "Cate")
                .filter(name -> name.length() == 4)
                .map(String::toUpperCase);

        return source;
    }
    public Flux<Long> buscarNumerosTiempo() {
        Flux<Long> source = Flux.just(0L,1L);

        return source;
    }
}
