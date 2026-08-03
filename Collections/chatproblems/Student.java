// Create a custom class `Student` with:

// * `name`
// * `marks`

// Create a `PriorityQueue<Student>` and use a **Comparator** to arrange students in **ascending order of marks**.
package Collections.chatproblems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

    public static void main(String[] args) {
        PriorityQueue<Student> stu = new PriorityQueue<>(
                new Comparator<Student>() {
                    public int compare(Student s1, Student s2) {
                        return Double.compare(s1.marks, s2.marks);

                    }
                });
        stu.add(new Student("Shah", 90));
        stu.add(new Student("Amit", 75));
        stu.add(new Student("Riya", 85));
        stu.add(new Student("Neha", 95));

        while (!stu.isEmpty()) {
            System.out.println(stu.poll());
        }
    }
}
