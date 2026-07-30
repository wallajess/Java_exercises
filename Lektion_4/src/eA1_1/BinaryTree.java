package eA1_1;

public class BinaryTree <T extends Comparable<T>> {
    private BinaryNode<T> root;


    public BinaryTree(T value) {
        root = new BinaryNode<T>(value);
        }

    public BinaryTree() {
        }

    public boolean contains(T value) {
        if (root == null) return false;
        return root.contains(value);
    }

    public void insert(T value) {
        if (root == null) {
            root = new BinaryNode<T>(value);
            } else {
                root.insert(value);
            }
        }


    public void inorder() {
        if (root == null) return;
        root.inorder();
        }


    private static class BinaryNode <T extends Comparable<T>>{

        private BinaryNode<T> leftSon, rightSon;

        private T value;


        public BinaryNode(T value) {

            this.value = value;
            }    

        public boolean contains(T v) {
            if (v.compareTo(value) == 0) return true;
            if (v.compareTo(value) < 0) {
                if (leftSon == null) return false;
                return leftSon.contains(v);
            } else {
                if (rightSon == null) return false;
                return rightSon.contains(v);
            }
        }

        public void insert(T v) {
            if (v.compareTo(value) == 0) return; // Knoten schon im Baum
            if (v.compareTo(value) < 0) {
                if (leftSon == null) {
                    leftSon = new BinaryNode<T>(v);
                } else {
                    leftSon.insert(v);
                }
            } else {
                if (rightSon == null) {
                    rightSon = new BinaryNode<T>(v);
                } else {
                    rightSon.insert(v);
                }
            }
        }

        public void inorder() {
            if (leftSon != null) {
                leftSon.inorder();
            }
            System.out.println(value);
            if (rightSon != null) {
                rightSon.inorder();
            }
        }
    }
}
