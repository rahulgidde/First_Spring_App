package com.myfirstapp.controller;

import com.myfirstapp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World!!";
    }

    @GetMapping("/param/(name)")
    public String sayHelloParam(@PathVariable(value = "name") String name) {
        return "Hello" + name + "!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return " Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
