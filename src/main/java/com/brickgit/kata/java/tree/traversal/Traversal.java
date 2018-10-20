package com.brickgit.kata.java.tree.traversal;

import com.brickgit.kata.java.tree.BinaryTree;
import com.brickgit.kata.java.tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/** Created by Daniel Lin on 2018/8/17. */
public class Traversal {

  public static String inorder(BinaryTree tree) {
    return inorder(new StringBuilder(), tree.mRoot).toString().trim();
  }

  public static String preorder(BinaryTree tree) {
    return preorder(new StringBuilder(), tree.mRoot).toString().trim();
  }

  public static String postorder(BinaryTree tree) {
    return postorder(new StringBuilder(), tree.mRoot).toString().trim();
  }

  public static String levelorder(BinaryTree tree) {
    StringBuilder stringBuilder = new StringBuilder();
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.offer(tree.mRoot);

    while (!queue.isEmpty()) {
      BinaryTreeNode node = queue.poll();
      if (node != null) {
        stringBuilder.append(node.mNumber).append(" ");
        queue.offer(node.mLeftNode);
        queue.offer(node.mRightNode);
      }
    }

    return stringBuilder.toString().trim();
  }

  private static StringBuilder inorder(StringBuilder stringBuilder, BinaryTreeNode node) {
    if (node != null) {
      inorder(stringBuilder, node.mLeftNode);
      stringBuilder.append(node.mNumber).append(" ");
      inorder(stringBuilder, node.mRightNode);
    }

    return stringBuilder;
  }

  private static StringBuilder preorder(StringBuilder stringBuilder, BinaryTreeNode node) {
    if (node != null) {
      stringBuilder.append(node.mNumber).append(" ");
      preorder(stringBuilder, node.mLeftNode);
      preorder(stringBuilder, node.mRightNode);
    }

    return stringBuilder;
  }

  private static StringBuilder postorder(StringBuilder stringBuilder, BinaryTreeNode node) {
    if (node != null) {
      postorder(stringBuilder, node.mLeftNode);
      postorder(stringBuilder, node.mRightNode);
      stringBuilder.append(node.mNumber).append(" ");
    }

    return stringBuilder;
  }
}
