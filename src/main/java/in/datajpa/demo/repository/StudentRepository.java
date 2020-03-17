package in.datajpa.demo.repository;
import in.datajpa.demo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
