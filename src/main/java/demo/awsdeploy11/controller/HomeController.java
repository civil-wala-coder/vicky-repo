package demo.awsdeploy11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {



    @GetMapping("/")
    public String getHello(){
        return "Hello aws  testing dgiosahfg !!!!";
    }


}
