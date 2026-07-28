package Casting;

public class Employee {
    public void work(){
    System.out.println("Every Working employee is importnt");
    }
    public static void main(String[] args) {
        Employee e = new Developer();
        e.work();
    }
}
