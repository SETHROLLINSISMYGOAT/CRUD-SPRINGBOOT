package in.strikes.crudSpringBootDemo.controller;

import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService service;
    public StudentController(StudentService service){
        this.service=service;

    }
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student createdStudent=service.createStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED).body(createdStudent);

    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentRep= service.getStudent(id);
        if(studentRep==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity
                .ok(studentRep);
    }
    @DeleteMapping(("/delete/{id}"))
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        Boolean isDeleted=service.deleteStudent(id);
        if(!isDeleted){
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok("Deleted");


    }
}