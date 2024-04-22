package az.edu.turing.module02.part02.lesson09;

import java.io.*;

public class BufferedFileApp {

    private static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module02/part02/lesson09/resource/";

    public static void mainV1(String[] args) {
        final File file2 = new File(RESOURCE_FOLDER + "hello2.txt");

        try {
            FileWriter fw = new FileWriter(file2, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World!2\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not be able to read file!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final File file2 = new File(RESOURCE_FOLDER + "hello2.txt");

        try {
            FileWriter fw = new FileWriter(file2, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World!2\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try-with-finally
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file2, true);
            bw = new BufferedWriter(fw);
            bw.write("Hello, World!2\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //try-with-resources
        try (FileWriter fw2 = new FileWriter(file2, true);
             BufferedWriter bw2 = new BufferedWriter(fw);) {
            bw2.write("Hello, World!2\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not be able to read file!");
            e.printStackTrace();
        }
    }

}
