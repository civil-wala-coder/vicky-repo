package demo.awsdeploy11.service;

import demo.awsdeploy11.model.Student;
import demo.awsdeploy11.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {


    @Autowired
    private HomeRepository repository;

    public Student createStudent(Student student){
        return this.repository.save(student);
    }

    public List<Student> getAllStudents(){
        return this.repository.findAll();
    }

}
