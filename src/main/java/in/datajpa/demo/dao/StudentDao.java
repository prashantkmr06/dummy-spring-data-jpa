package in.datajpa.demo.dao;

import in.datajpa.demo.entity.Address;
import in.datajpa.demo.entity.Student;
import in.datajpa.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(){
        Student student= new Student();
        Address address= new Address();
        address.setStreet("Downtown");
        student.setAddress(address);
        student.setName("Prashant");
        studentRepository.save(student);
    }
}
