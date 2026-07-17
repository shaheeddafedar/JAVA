package classesandobjects.Challenge;

public class Course {
    static int maxCapacity;

    String courseName;
    int enrollement;

    static {
        maxCapacity = 50;
    }

    String [] enrolledStudent = new String[maxCapacity];

  static int setMaxCapacity(int capacity) {
        maxCapacity = capacity;
        return capacity;
    }


    public Course(String courseName) {
        this.courseName = courseName;
        this.enrollement = 0;
    }

    void enrollStudent(String studentName) {

        if (enrollement < maxCapacity) {
            enrolledStudent[enrollement] = studentName;
            enrollement++;
            System.out.println(studentName + " enrolled successfully.");
        } else {
            System.out.println("Course is full.");
        }

    }

    void unenrollStudent(String studentName) {
        if (enrollement > 0) {
            enrollement--;
            System.out.println("The unenrollStudent Student is " + studentName);

        }

    }

   
    public static void main(String[] args) {
        Course Neet = new Course("Neet2026");
        Course jee = new Course("jee2026");

        Neet.enrollStudent("sami");
        Neet.unenrollStudent("sami");

    }
}
