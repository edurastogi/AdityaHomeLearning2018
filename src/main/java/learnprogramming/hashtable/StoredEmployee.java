package learnprogramming.hashtable;

import learnprogramming.lists.Employee;

import java.util.ArrayList;
import java.util.List;

public class StoredEmployee {
    public String key;
    public Employee employee;
    List<String> myList = new ArrayList<>();


    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
