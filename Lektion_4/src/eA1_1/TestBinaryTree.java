package eA1_1;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<>();
        tree.insert("C");
        tree.insert("A");
        tree.insert("F");
        tree.insert("B");
        tree.insert("D");
        
        System.out.println("Inorder-Ausgabe: ");
        tree.inorder();
    }
}
