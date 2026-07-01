package in.strikes.crudSpringBootDemo.service;

import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository repository;
    public StudentService(StudentRepository repository){
        this.repository = repository;
    }
    public Student createStudent(Student studentReq){
        Student studentrep=repository.save(studentReq);
        return studentrep;
    }
    public Student getStudent(Long id){
        Optional<Student> studentResp=repository.findById(id);
        if(studentResp.isPresent()){
            return studentResp.get();
        }
        return null;

    }
    public Boolean deleteStudent(Long id){
        Optional<Student> studentResp=repository.findById(id);
        if(studentResp.isPresent()){
            repository.deleteById(id);
        }
        if(!studentResp.isPresent()){
            return false;
        }
        return true;
    }

}