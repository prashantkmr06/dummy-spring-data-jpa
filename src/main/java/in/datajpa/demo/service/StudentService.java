package in.datajpa.demo.service;

import in.datajpa.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    StudentDao studentDao;

    public void saveStudent() {
      studentDao.saveStudent();
    }
}
