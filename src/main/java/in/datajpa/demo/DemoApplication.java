package in.datajpa.demo;

import in.datajpa.demo.service.StudentService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
@Bean
    public ApplicationRunner runner(StudentService studentService){
    return args->studentService.saveStudent();
}
}
