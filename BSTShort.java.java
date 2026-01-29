class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int d) { data = d; }
}

class BST {
    TreeNode root;

    TreeNode insert(TreeNode node, int key) {
        if (node == null) return new TreeNode(key);
        if (key < node.data) node.left = insert(node.left, key);
        else if (key > node.data) node.right = insert(node.right, key);
        return node;
    }

    TreeNode delete(TreeNode node, int key) {
        if (node == null) return null;
        if (key < node.data) node.left = delete(node.left, key);
        else if (key > node.data) node.right = delete(node.right, key);
        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    int minValue(TreeNode node) {
        while (node.left != null) node = node.left;
        return node.data;
    }

    boolean search(TreeNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return key < node.data ? search(node.left, key) : search(node.right, key);
    }

    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}

public class BSTShort {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        System.out.print("Inorder: "); bst.inorder(bst.root); System.out.println();
        System.out.println("Search 40: " + bst.search(bst.root, 40));
        System.out.println("Search 90: " + bst.search(bst.root, 90));

        bst.root = bst.delete(bst.root, 20);
        bst.root = bst.delete(bst.root, 30);
        bst.root = bst.delete(bst.root, 50);

        System.out.print("Inorder after deletion: "); bst.inorder(bst.root);
    }
}
