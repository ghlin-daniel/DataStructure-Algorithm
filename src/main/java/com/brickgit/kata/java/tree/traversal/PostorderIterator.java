package com.brickgit.kata.java.tree.traversal;

import com.brickgit.kata.java.tree.BinaryTree;
import com.brickgit.kata.java.tree.BinaryTreeNode;

import java.util.Stack;

/** Created by Daniel Lin on 2018/8/18. */
public class PostorderIterator {

  private BinaryTree mTree;

  private Stack<BinaryTreeNode> mStack = new Stack<>();

  public PostorderIterator(BinaryTree tree) {
    mTree = tree;
    if (mTree == null || mTree.mRoot == null) return;

    Stack<BinaryTreeNode> stackIn = new Stack<>();
    stackIn.push(mTree.mRoot);
    while (!stackIn.isEmpty()) {
      BinaryTreeNode node = stackIn.pop();
      if (node.mLeftNode != null) stackIn.push(node.mLeftNode);
      if (node.mRightNode != null) stackIn.push(node.mRightNode);
      mStack.push(node);
    }
  }

  public boolean hasNext() {
    return !mStack.isEmpty();
  }

  public BinaryTreeNode next() {
    return mStack.pop();
  }
}
