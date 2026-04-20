package fr.springBoot.HelloWorld.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Hello implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Hello World!");
    }

}