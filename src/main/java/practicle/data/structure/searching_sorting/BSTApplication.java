package practicle.data.structure.searching_sorting;

public class BSTApplication {
    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(30,"fifteen");
        tree.insert(10,"Ten");
        tree.insert(20,"twenty");
        tree.insert(15,"fifteen");
        tree.insert(25,"fifteen");
        tree.insert(35,"fifteen");
        tree.insert(40,"fifteen");
        tree.insert(45,"fifteen");

        tree.displayTreeMyImplementation();
        tree.displayTree();

        /*System.out.println(tree.findMin().key);

        System.out.println(tree.findMax().key);

        System.out.println(tree.remove(10)); //print true
        System.out.println(tree.findMin().key); // 15*/

    }
}
