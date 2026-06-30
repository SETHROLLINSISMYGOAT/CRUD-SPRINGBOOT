
package in.strikes.crudSpringBootDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student  {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String subject;
	private String name;
    private int age;
    private String email;
    private int rollno;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge(){
        return age;
    }

}