package com.bnta.task_01.controllers;


import com.bnta.task_01.models.Celebration;
import com.bnta.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "Welcome!") String timeOfDay) {
        return new Greeting("Bob", timeOfDay);
    }

    @GetMapping("/greeting/christmas")
    public Celebration celebration() {
        return new Celebration("Merry Christmas!");
    }
}
