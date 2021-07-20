package com.example.consullearning.qualifiertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    @Bean
    @MyAnnotation
    public Student student1(){
        return new Student();
    }

    @Bean
    public Student student2(){
        return new Student();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        System.out.println(run.getBean(ServiceImpl.class));
    }
}
