package com.tarkandev.blink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tarkandev.blink.HelloController;

@SpringBootApplication
public class BlinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlinkApplication.class, args);
        HelloController temp = new HelloController();
        temp.hello();
    }
}
