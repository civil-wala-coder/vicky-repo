package demo.awsdeploy11.controller;

import demo.awsdeploy11.model.Student;
import demo.awsdeploy11.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {


    @Autowired
    private HomeService service;

    @GetMapping("/")
    public String getHello(){
        return "Hello aws !!!!";
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createSt(@RequestBody Student student){
        return new ResponseEntity<>(this.service.createStudent(student), HttpStatus.CREATED);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllRes(){
        return new ResponseEntity<>(this.service.getAllStudents(), HttpStatus.OK);
    }
}
