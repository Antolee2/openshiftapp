package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Csecontroller {

    // Show input page
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    // Handle form submission
    @PostMapping("/greet")
    public String getTable(@RequestParam("name") String name, Model model) {

        List<String> table = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            table.add(name);
        }

        model.addAttribute("table", table);
        model.addAttribute("name", name);

        return "result";
    }
}