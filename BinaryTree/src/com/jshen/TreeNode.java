package com.jshen;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode () {

    }

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}

//height
//1) The maximum number of nodes at level ‘l’ of a binary tree is 2^l. ex: For root, l = 0, number of nodes = 2^0 = 1
//2) Maximum number of nodes in a binary tree of height ‘h’ is 2^h – 1.
//3) In a Binary Tree with N nodes, minimum possible height or minimum number of levels is Log2(N+1)
//4) A Binary Tree with L leaves has at least Log2L + 1 levels


//Type
//1) Full Binary Tree A Binary Tree is a full binary tree if every node has 0 or 2 children
//2) Complete Binary Tree: A Binary Tree is a complete Binary Tree if all the levels are completely filled except possibly the last level and the last level has all keys as left as possible
//3) Perfect Binary Tree A Binary tree is a Perfect Binary Tree in which all the internal nodes have two children and all leaf nodes are at the same level.

//Travel
//Breadth First Traversal (Or Level Order Traversal)
//Depth First Traversals
//  Inorder Traversal (Left-Root-Right)
//  Preorder Traversal (Root-Left-Right)
//  Postorder Traversal (Left-Right-Root)