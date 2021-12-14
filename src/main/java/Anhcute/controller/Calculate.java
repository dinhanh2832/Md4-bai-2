package Anhcute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculate {
    @PostMapping("/")
    public String greeting(Model model, @RequestParam double money) {
        model.addAttribute("result",Math.round(money/23000));
        return "index";
    }
    @GetMapping("/")
    public String show() {
        return "index";
    }
}
