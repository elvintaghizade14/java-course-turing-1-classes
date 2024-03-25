package az.edu.turing.module02.part01.lesson02;

public class TeacherApp {

    public static void main(String[] args) {
        Teacher obj = new Teacher("Vusal", 10_000_000.00, 10);
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        System.out.println(obj.getExperience());
        obj.setGender(true);
        System.out.println(obj.getGender());
    }

}
