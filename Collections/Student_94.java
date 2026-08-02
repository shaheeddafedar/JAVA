package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student_94 {
    String name;
    int grade;

    public Student_94(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }

    public static void main(String[] args) {

        PriorityQueue<Student_94> student = new PriorityQueue<>(
                new Comparator<Student_94>() {
                    @Override
                    public int compare(Student_94 s1, Student_94 s2) {
                        return Integer.compare(s1.grade, s2.grade);
                    }
                });

        student.add(new Student_94("Shah", 90));
        student.add(new Student_94("Amit", 75));
        student.add(new Student_94("Riya", 85));
        student.add(new Student_94("Neha", 95));

        while (!student.isEmpty()) {
            System.out.println(student.poll());
        }
    }
}