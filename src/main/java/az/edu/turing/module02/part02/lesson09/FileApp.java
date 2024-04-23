package az.edu.turing.module02.part02.lesson09;

import java.io.*;

public class FileApp {
    private static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module02/part02/lesson09/resource/";

    public static void main(String[] args) {
        final File file1 = new File(RESOURCE_FOLDER + "hello.txt");

        try {
            FileWriter fw = new FileWriter(file1);
            fw.write("Hello, World!1");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file1);
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not be able to read file!");
            e.printStackTrace();
        }
    }
}
