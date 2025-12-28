package com.me.meetup.todo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration(proxyBeanMethods = false)
@ImportHttpServices(TodoService.class)
public class HttpClientConfiguration {
}
