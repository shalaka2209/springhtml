package com.example.NewSpringbootproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewFileController {

    @GetMapping("/newfile")
    public String showNewFile() {
        return "NewFile";  
    }
}
