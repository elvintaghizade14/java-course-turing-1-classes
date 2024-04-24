package az.edu.turing.module02.part02.lesson10;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class ObjectMappingApp {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new XmlMapper();
        try {
            Student student = new Student(25, "Elvin", 76);
            String elvin = objectMapper.writeValueAsString(student);
            System.out.println(elvin);
            System.out.println(student);

            Student studentRead = objectMapper.readValue(elvin, Student.class);
            System.out.println(studentRead);

            System.out.println("---");
            byte[] bytes = objectMapper.writeValueAsBytes(student);
            System.out.println(objectMapper.readValue(bytes, Student.class));

            String s = objectMapper.writeValueAsString(elvin);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
