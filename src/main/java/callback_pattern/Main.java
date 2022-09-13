package callback_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Student> filtStudent(List<Student> students, IPredictor predictor) {
        List<Student> results = new ArrayList<>();

        for (Student student : students) {
            if (predictor.test(student)) {
                results.add(student);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 3.8, 2.8));
        students.add(new Student("Tom", 3.9, 2.9));
        students.add(new Student("Tom", 2.9, 3.5));
        students.add(new Student("Tom", 3.6, 3.1));
        System.out.println("The number of students who have GPA greater than 3.5 are: " + Main.filtStudent(students, new GPAPredictor(3.5)).size());


//        using lambda
        System.out.println("The number of students who have GPA greater than 3.5 are: "
                + Main.filtStudent(students, (Student student) -> student.getGpa() >= 3.5).size());
        System.out.println("The number of students who have writing score greater than 3.0 are: "
                + Main.filtStudent(students, (Student student) -> student.getWritingScore() >= 3.0).size());
    }
}
