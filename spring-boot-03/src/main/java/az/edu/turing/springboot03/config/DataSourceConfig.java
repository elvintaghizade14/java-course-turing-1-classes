package az.edu.turing.springboot03.config;

import az.edu.turing.springboot03.domain.repository.InMemoryStudentRepository;
import az.edu.turing.springboot03.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {

//    @Bean
//    @Primary
//    public StudentRepository studentRepository() {
//        return new InMemoryStudentRepository();
//    }
//
//    @Bean
//    @Qualifier("h2")
//    public StudentRepository studentRepositoryH2() {
//        return new InMemoryStudentRepository();
//    }
}
