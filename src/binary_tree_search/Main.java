package binary_tree_search;

public class Main {
    public  static  void main(String[] a){

        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

//        System.out.println("Tree Traversal PreOder");
//       tree.traversePreOrder();
//
//        System.out.println("Tree Traversal InOder");
//        tree.traverseInOrder();
//
//        System.out.println("Tree Traversal PostOder");
//        tree.traversePostOrder();

        System.out.println(tree.equals(null));
    }
}
