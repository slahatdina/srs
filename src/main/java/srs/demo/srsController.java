package srs.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class srsController {
    @RequestMapping("/srs")
    public String index() {
        System.out.println("controller");
        return "Hello Dina";
    }
}
