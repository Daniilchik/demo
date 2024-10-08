package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo.*")
@EnableSwagger2
public class App {
    // todo: DTO, Docker, Tests, AWS
    public static void main(String[] args) {
        System.out.println(System.getenv());
        SpringApplication.run(App.class, args);
    }

}
