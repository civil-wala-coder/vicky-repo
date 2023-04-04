package demo.awsdeploy11.repository;

import demo.awsdeploy11.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Student, Integer> {
}
