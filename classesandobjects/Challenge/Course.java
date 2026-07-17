package classesandobjects.Challenge;

public class Course {
  static  int maxCapacity;

  String courseName;
  String enrolledStudents;

  static {
    maxCapacity=0;
  }
  {
    maxCapacity++;
  }

    public Course() {
    }

    public Course(String courseName, String enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }
    void  enrolledStudent(){
        System.out.println("The Enrolled Student is "+ enrolledStudents);
    }
    
   
}
