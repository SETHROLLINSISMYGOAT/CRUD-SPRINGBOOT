package in.strikes.crudSpringBootDemo.service;

import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository repository;
    public StudentService(StudentRepository repository){
        this.repository = repository;
    }
    public Student createStudent(Student studentReq){
        Student studentrep=repository.saveStudent(studentReq);
        return studentrep;
    }

}