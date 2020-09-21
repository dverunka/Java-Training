package cz.verunka.training;

/**
 * Created by Veronika on 04.07.2016.
 */

// tree with right and left children, calc values of children at each level

public class BinaryTree {

    private Node root;

    private static class Node {

        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int quantity(Node node) {

        if (node == null) {
            return 0;
        } else {
            return quantity(node.left) + 1 + quantity(node.right);
        }
    }

    public static int value(Node node) {

        if (node == null) {
            return 0;
        } else {
            return value(node.left) + node.data + value(node.right);
        }
    }
}