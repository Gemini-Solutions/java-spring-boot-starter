package com.gemini.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
    title = "Java Spring Boot Starter",
    version = "0.1.0",
    description = "This Project serves as a starting point for spring boot application. It provides a standardized "
            + "structure and pre-configured settings to help developers quickly set up and build Java applications.",
    contact = @Contact(
            name = "App Service Team",
            email = "appservices@geminisolutions.com"
    )),
    servers = {@Server(
            url = "http://localhost:8080/",
            description = "Current Environment"
    )}
)
public class OpenApiConfig {

}
