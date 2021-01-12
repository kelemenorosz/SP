package ro.euvt.springtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.euvt.springtest.difexample.ClientComponent;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "Hello World!";
    }

}
