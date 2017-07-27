package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {


    @RequestMapping("/greeting")
    public String index(){
        return "Spring boot działa";
    }
}
