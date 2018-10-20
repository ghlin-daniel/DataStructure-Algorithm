package com.brickgit.kata.java.tree;

/** Created by Daniel Lin on 2018/8/13. */
public class BinaryTree {

  public BinaryTreeNode mRoot;

  public BinaryTree(BinaryTreeNode root) {
    mRoot = root;
  }

  public BinaryTree(Integer[] array) {
    if (array == null) return;

    mRoot = buildFromArray(0, array);
  }

  private BinaryTreeNode buildFromArray(int index, Integer[] array) {
    if (index >= array.length) return null;

    Integer n = array[index];
    if (n == null) return null;

    BinaryTreeNode node = new BinaryTreeNode(n);
    node.mLeftNode = buildFromArray(index * 2 + 1, array);
    node.mRightNode = buildFromArray(index * 2 + 2, array);

    return node;
  }

  @Override
  public String toString() {
    return printTree(new StringBuilder(), mRoot).toString().trim();
  }

  private StringBuilder printTree(StringBuilder stringBuilder, BinaryTreeNode node) {
    if (node != null) {
      stringBuilder.append(node.mNumber).append(" ");
      printTree(stringBuilder, node.mLeftNode);
      printTree(stringBuilder, node.mRightNode);
    }

    return stringBuilder;
  }
}
