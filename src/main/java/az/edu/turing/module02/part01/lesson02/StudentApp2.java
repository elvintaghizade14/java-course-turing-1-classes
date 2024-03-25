package az.edu.turing.module02.part01.lesson02;

public class StudentApp2 {

    public static void main(String[] args) {
        Student osman = new Student("Osman", 24);
        System.out.println(osman.name);
        System.out.println(osman.age);
        System.out.println(osman.grade);

        osman.grade = 78;
        System.out.println(osman.grade);
    }

}
