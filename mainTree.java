class Tree {
    private int data;
    private Tree left, right;

    // Constructor to create a new binary tree node.
    public Tree(int data) {
        this.data = data;
        left = right = null;
    }

    // Insertion
    public Tree insert(int data, Tree head) {
        if (head == null) { // Create a new node if head is null
            return new Tree(data);
        }
        if (data < head.data) {
            head.left = insert(data, head.left);
        } else if (data > head.data) {
            head.right = insert(data, head.right);
        }
        return head;
    }

    // Delete a node from the binary search tree
    public Tree delete(int data, Tree head) {
        if (head == null) {
            return null; // If the tree is empty or the node is not found
        }

        if (data < head.data) {
            head.left = delete(data, head.left);
        } else if (data > head.data) {
            head.right = delete(data, head.right);
        } else {
            // Node to be deleted found
            if (head.left == null) { // Node with only right child or no child
                return head.right;
            } else if (head.right == null) { // Node with only left child
                return head.left;
            }

            // Node with two children: Get the in-order successor (smallest in the right subtree)
            Tree successor = getMinValueNode(head.right);

            // Copy the in-order successor's data to this node
            head.data = successor.data;

            // Delete the in-order successor
            head.right = delete(successor.data, head.right);
        }

        return head;
    }

    // Helper function to find the smallest node in a subtree
    private Tree getMinValueNode(Tree node) {
        Tree current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // In-order traversal --> Left Node Right
    public void in_order(Tree root) {
        if (root != null) {
            in_order(root.left);
            System.out.print(root.data + " ");
            in_order(root.right);
        }
    }
}

// main class...
public class mainTree {
    public static void main(String[] args) {
        Tree root = new Tree(5); // Root node
        root = root.insert(3, root);
        root = root.insert(7, root);
        root = root.insert(2, root);
        root = root.insert(4, root);
        root = root.insert(6, root);
        root = root.insert(9, root);

        System.out.println("In-order traversal before deletion:");
        root.in_order(root);

        root = root.delete(7, root); // Deleting node with value 7

        System.out.println("\nIn-order traversal after deletion:");
        root.in_order(root);
    }
}
