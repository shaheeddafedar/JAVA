package classesandobjects.Challenge;

public class Course {
    static int maxCapacity;

    String courseName;
    int enrollement;

    static {
        maxCapacity = 5;
    }

    String[] enrolledStudent = new String[maxCapacity];

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

            System.out.println("The unenrolled student is " + studentName);

            for (int i = 0; i < enrollement; i++) {
                if (studentName.equals(enrolledStudent[i])) {

                    for (int j = i; j < enrollement - 1; j++) {
                        enrolledStudent[j] = enrolledStudent[j + 1];
                    }

                    enrolledStudent[enrollement - 1] = null;
                    enrollement--;

                    System.out.println(studentName + " unenrolled successfully.");
                    return;
                }
            }

            System.out.println(studentName + " not found.");
        } else {
            System.out.println("No students are enrolled.");
        }
    }

    void TotalStudentname() {
        if (enrollement > 0) {
            for (int i = 0; i < enrollement; i++) {
                System.out.println(enrolledStudent[i]);
            }
        }
    }

    public static void main(String[] args) {
        Course Neet = new Course("Neet2026");
        Course jee = new Course("jee2026");

        Neet.enrollStudent("sami");
        Neet.enrollStudent("SRK");
        Neet.enrollStudent("SALMAN");
        Neet.enrollStudent("VIRAT");
        Neet.enrollStudent("ROHIT");
        Neet.unenrollStudent("SRK");
        Neet.TotalStudentname();

    }
}
