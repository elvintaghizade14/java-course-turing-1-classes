package az.edu.turing.module02.part02.lesson10;

import az.edu.turing.module02.part02.lesson09.StudentApp;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileStreamsApp {
    private static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module02/part02/lesson10/resource/";
    public static final String HELLO_FILE = RESOURCE_FOLDER + "hello.txt";
    public static final String HELLO_STREAM_FILE = RESOURCE_FOLDER + "hello-with-stream.bin";
    public static final String HELLO_STREAM_FILE_SER = RESOURCE_FOLDER + "hello-with-stream.ser";
    public static final String I_LOVE_TURING_ACADEMY = "Hello, Turing!...<3";

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HELLO_FILE));
             BufferedReader br = new BufferedReader(new FileReader(HELLO_FILE))) {
            bw.write(I_LOVE_TURING_ACADEMY);
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream(HELLO_STREAM_FILE);
            FileInputStream fis = new FileInputStream(HELLO_STREAM_FILE)) {
            fos.write(I_LOVE_TURING_ACADEMY.getBytes(StandardCharsets.UTF_8));
            fos.close();
            System.out.println(new String(fis.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HELLO_STREAM_FILE_SER));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HELLO_STREAM_FILE_SER))) {
//            oos.writeObject(new Student(19, "Ali", 55));
            oos.close();
            Object object = ois.readObject();
            if (object instanceof Student) {
                System.out.println(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
