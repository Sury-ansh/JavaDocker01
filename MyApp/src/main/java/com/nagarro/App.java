package com.nagarro;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Main application class
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // REST Controller class
    @RestController
    @RequestMapping("/api")
    public static class HelloController {
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, Techies!";
        }
    }
}
