package practicle.data.structure.linkedlist;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            this.last = newNode; //if empty, last will refer to the new Node being created
        } else {
            this.first.previous = newNode;
        }

        newNode.next = this.first; // the new node's next field will point to first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            this.first = newNode;
        } else {
            this.last.next = newNode; // assigning old last to new node
            newNode.previous = this.last; // the old last will be the new node previous
        }

        this.last = newNode; // the linked list last field should point to new node
    }

    //assume non-empty list
    public Node deleteFist() {
        Node temp = first;
        if (first.next == null) { // there is only one item in list
            last = null;
        } else {
            this.first.next.previous = null; // this list's first node will point to null
        }
        this.first = first.next;
        return temp; // return the deleted old first node
    }

    //assume non-empty list
    public Node deleteLast() {
        Node temp = this.last;
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    //assume non-empty list
    public boolean insertAfter(int key, int data){
        Node current = first;
        while(current.data !=key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        } else{
            newNode.next = current.next; // new node's next field should point to the node ahead of the current
            current.next.previous = newNode;
        }
        newNode.previous= current;
        current.next = newNode;

        return true;
    }

    //assume non-empty list
    public Node deleteKey(int key){
        Node current = first;
        while(current.data !=key){
            current = current.next;
            if(current == null){
                return null;
            }
        }
        if(current == first){
            first = current.next; //make the first field point to the node following current since current will be deleted
        }else{
            current.previous.next = current.next;
        }
        if(current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward(){
        System.out.println("List (first --> last): ");
        Node current = first;
        while(current !=null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("Complete print list");
    }

    public void displayBackword(){
        System.out.println("List (last --> first): ");
        Node current = last;
        while(current !=null){
            current.displayNode();
            current = current.previous;
        }
        System.out.print("Complete print list");
    }


}
