package ea2_3;

public class BinaryTree {
    private BinaryNode root;

    
    public BinaryTree(int value) { 
        root = new BinaryNode(value);
    }
  
    public BinaryTree() {
        root = null;        
   }

    public boolean contains(int value) { 
        return containsRecursive(root, value);
    }
    
    //Private helper method for recursive searching
    private boolean containsRecursive(BinaryNode binNod, int value) {
        if (binNod == null) {
            return false; 
        }
        if (value ==binNod.value) {
            return true;
        } else if (value < binNod.value) {
            return containsRecursive(binNod.leftSon, value);
        } else {
            return containsRecursive(binNod.rightSon, value);     
    }
    }

    public void insert(int value) { 
        if  (!contains(value)) {
            root = insertRecursive(root, value);
        }
    }
    
    
    private BinaryNode insertRecursive(BinaryNode binNod, int value) {
        if (binNod == null) {
            return new BinaryNode(value);
        }
        if (value < binNod.value) {
            binNod.leftSon = insertRecursive(binNod.leftSon, value);
        } else {
            binNod.rightSon = insertRecursive(binNod.rightSon, value);
        }
        return binNod; //return the current node after updating the tree
    }

    public void inorder() {
        inorderPrint(root);
        System.out.println("Die Wurzel ist: " + root.value);
        System.out.println();
    }
    
    private void inorderPrint(BinaryNode binNod) {
        //Prints the values of the nodes from left to right
        if (binNod != null) {
             inorderPrint(binNod.leftSon);
             System.out.print(binNod.value + " -> ");
             inorderPrint(binNod.rightSon);
        }
    }

    private static class BinaryNode {
        private BinaryNode leftSon, rightSon;

        private int value;

        public BinaryNode(int value) {
            this.value = value;
        }
    }
}
