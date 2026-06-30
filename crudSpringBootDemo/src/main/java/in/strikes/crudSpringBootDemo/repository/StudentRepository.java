package in.strikes.crudSpringBootDemo.repository;


import in.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student stuentReq){
        Student s1=new Student();
        s1.setName("Pathakji");
        s1.setAge(22);
        s1.setEmail("siddhant12@gmail.com");
        s1.setRollno(43);
        s1.setSubject("Spring");
        return s1;

    }
}