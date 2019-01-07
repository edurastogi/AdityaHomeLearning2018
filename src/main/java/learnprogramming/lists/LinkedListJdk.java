package learnprogramming.lists;

import java.util.LinkedList;

public class LinkedListJdk {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mery", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        /*Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }*/

        printList(list);

        Employee billEnd = new Employee("Bill","End",78);

        list.addLast(billEnd); // add method adds items at the tail
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);

        list.remove(); //remove first element
        printList(list);

        //circular linked list : Last element of the list point to head node

    }

    public static void printList(LinkedList<Employee> list) {
        System.out.print("HEAD -> ");
        for(Employee employee:list){
            System.out.print(employee);
            System.out.print("<=>");
        }
        System.out.println("null");
        System.out.println(list.size());
    }

}
