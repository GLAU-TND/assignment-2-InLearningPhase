/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data, problem1.node.TreeNode left, problem1.node.TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public problem1.node.TreeNode getLeft() {
        return left;
    }

    public void setLeft(problem1.node.TreeNode left) {
        this.left = left;
    }

    public problem1.node.TreeNode getRight() {
        return right;
    }

    public void setRight(problem1.node.TreeNode right) {
        this.right = right;
    }
}
