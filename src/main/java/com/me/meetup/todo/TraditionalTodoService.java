package com.me.meetup.todo;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TraditionalTodoService {

    private final RestClient restClient;

    public TraditionalTodoService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public List<Todo> getAllTodos() {
        return restClient
                .get()
                .uri("/todos")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
        });
    }
}
