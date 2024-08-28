package syksy24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellouController {

    @GetMapping("/hellou")
    public String hello(@RequestParam(name = "name", defaultValue = "Vieras") String name,
                        @RequestParam(name = "age", defaultValue = "0") int age,
                        Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hellou";
    }
}