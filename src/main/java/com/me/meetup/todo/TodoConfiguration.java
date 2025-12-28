package com.me.meetup.todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class TodoConfiguration {

    // read HttpClientConfiguration
//    @Bean
//    public TodoService todoService(RestClient.Builder restClientBuilder) {
//        RestClient client = restClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
//        RestClientAdapter adapter = RestClientAdapter.create(client);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//        return factory.createClient(TodoService.class);
//    }
}
