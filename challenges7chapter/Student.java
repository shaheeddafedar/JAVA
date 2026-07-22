// 70. Define a Student class with fields like name and age, and use 
// toString to print student details.

package challenges7chapter;

public class Student {
    String name;
    int age;

    Student(String name, int age){
     this.name = name;
     this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDetails [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Student s1 = new Student("shah", 10);
        System.out.println(s1);
    }
}
