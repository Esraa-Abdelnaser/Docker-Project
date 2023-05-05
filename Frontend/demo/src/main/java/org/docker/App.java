package org.docker;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!" + Arrays.toString(args));
        System.out.println("get() = " + get());
    }

    public static Cat get() {
        String serverPort = System.getenv("SERVER_PORT");
        String serverHost = System.getenv("SERVER_HOST");
        WebClient webClient = WebClient.builder()
                .baseUrl("http://" + serverHost + ":" + serverPort)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        Mono<Cat> catMono = webClient.get()
                .uri("/cat")
                .retrieve()
                .bodyToMono(Cat.class);
        return catMono.block();
    }
}
