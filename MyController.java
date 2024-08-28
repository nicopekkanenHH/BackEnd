package syksy24.backend.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MyController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contact() {
        return "This is the contact page";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    
    }
}
