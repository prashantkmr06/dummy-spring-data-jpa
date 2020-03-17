package in.datajpa.demo;

import in.datajpa.demo.dao.StudentDao;
import in.datajpa.demo.entity.Address;
import in.datajpa.demo.entity.Student;
import in.datajpa.demo.repository.StudentRepository;
import in.datajpa.demo.service.StudentService;
import in.datajpa.demo.vo.StudentVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {

    @InjectMocks
    StudentService studentService;

    @Mock
    StudentRepository studentRepository;

    @Mock
    StudentDao studentDao;


    @Test
    public void testSaveStudent(){
      studentService.saveStudent();
      verify(studentDao,times(1)).saveStudent();
    }
}
