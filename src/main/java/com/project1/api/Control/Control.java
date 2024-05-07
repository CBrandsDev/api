package com.project1.api.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Control {

    @GetMapping("")
    public String ok() {
        return "save friends";
    }
    
    @GetMapping("/welcome")
    public String testing() {
        return "Hi fellas";
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome " + name;
    }
    

}
