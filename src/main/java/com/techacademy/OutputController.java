package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @GetMapping("/output")
    public String getOutput(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);
        return "output";
    }
}
