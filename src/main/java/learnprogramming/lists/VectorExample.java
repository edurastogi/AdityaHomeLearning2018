package learnprogramming.lists;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mery", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}
