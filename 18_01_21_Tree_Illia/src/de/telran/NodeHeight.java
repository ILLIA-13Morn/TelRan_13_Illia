package de.telran;

public class NodeHeight {

    public int getHeight(Node node) {
        if (node == null)
            return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight,rightHeight);

    }
}
