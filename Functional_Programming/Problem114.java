// 114.Create a list of employees with name and salary fields. 
// Write a comparator that sorts the employees by salary. 
// Then, use this comparator to sort your list using the sort 
// stream operation.

package Functional_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem114 {
    public int salary;
    public String name;

public Problem114(int salary, String name) {
    this.salary = salary;
    this.name = name;
 }
 
 @Override
 public String toString() {
    return "Problem114 [salary=" + salary + ", name=" + name + "]";
 }
 public static void main(String[] args) {
    List<Problem114> employees = new ArrayList<>();
    employees.add(new Problem114(25000, "kavin"));
    employees.add(new Problem114(55000, "roman"));
    employees.add(new Problem114(5000, "seth"));
    employees.add(new Problem114(45000, "Brock"));

    Comparator<Problem114> salarysort = new Comparator<Problem114>() {
        public int compare( Problem114 p1 ,Problem114 p2){
        return Integer.compare(p1.salary, p2.salary);
        }
    };

    Collections.sort(employees,salarysort);
    System.out.println("Sorted using Salary : "+ employees);
 }


 
}

