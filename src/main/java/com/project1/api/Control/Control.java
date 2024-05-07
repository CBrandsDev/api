package com.project1.api.Control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    
    @GetMapping("")
    public String testing() {
        return "Hi fellas";
    }

}
