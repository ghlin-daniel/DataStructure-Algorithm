package com.brickgit.kata.java.tree;

/** Created by Daniel Lin on 2018/8/12. */
public class BinaryTreeNode {

  public Integer mNumber;
  public BinaryTreeNode mLeftNode;
  public BinaryTreeNode mRightNode;

  public BinaryTreeNode(Integer number) {
    mNumber = number;
  }

  public BinaryTreeNode(Integer number, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
    mNumber = number;
    mLeftNode = leftNode;
    mRightNode = rightNode;
  }
}
