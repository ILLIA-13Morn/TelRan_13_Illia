package de.telran;

public class NumberOfPeaks {

    Node root;

    public int size() {
        return reSize(root);
    }

    private int reSize(Node node) {
        if (node.left == null && node.right == null)
            return 1;
        if (node.left == null)
            return 1 + reSize(node.right);
        if (node.right == null)
            return 1 + reSize(node.left);

        return 1+ reSize(node.left) + reSize(node.right);

    }
}
