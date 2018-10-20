package com.brickgit.kata.java;

import com.brickgit.kata.java.array.Substring;
import com.brickgit.kata.java.linkedlist.LinkedList;
import com.brickgit.kata.java.queue.StackQueue;
import com.brickgit.kata.java.tree.BinaryTree;
import com.brickgit.kata.java.tree.traversal.PostorderIterator;
import com.brickgit.kata.java.tree.traversal.Traversal;

/** Created by Daniel Lin on 2018/8/11. */
public class Main {

  public static void main(String args[]) {}

  private static void testLinkedList() {
    Integer[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};

    LinkedList list = new LinkedList(array);

    System.out.println("\n----- Linked List -----");
    System.out.println("Middle = " + list.middle().mNumber);
    System.out.println("Before reverse() = " + list.toString());
    list.reverse();
    System.out.println("After reverse()  = " + list.toString());
  }

  private static void testStackQueue() {
    StackQueue stackQueue = new StackQueue();
    stackQueue.add(1);
    stackQueue.add(2);
    stackQueue.add(3);
    stackQueue.add(4);
    stackQueue.add(5);

    StringBuilder stringBuilder = new StringBuilder();
    while (stackQueue.size() > 0) {
      stringBuilder.append(stackQueue.remove()).append(" ");
    }

    System.out.println("\n----- StackQueue -----");
    System.out.println(stringBuilder.toString().trim());
  }

  private static void testBinaryTree() {
    Integer[] array = {0, 1, 2, null, 4, 5, 6, null, null, 9, 10, null, null, null, 14};

    BinaryTree tree = new BinaryTree(array);

    System.out.println("\n----- BinaryTree Traversal -----");
    System.out.println("toString   = " + tree.toString());
    System.out.println("Preorder   = " + Traversal.preorder(tree));
    System.out.println("Inorder    = " + Traversal.inorder(tree));
    System.out.println("Postorder  = " + Traversal.postorder(tree));
    System.out.println("Levelorder = " + Traversal.levelorder(tree));

    PostorderIterator iterator = new PostorderIterator(tree);
    StringBuilder stringBuilder = new StringBuilder();
    while (iterator.hasNext()) {
      stringBuilder.append(iterator.next().mNumber).append(" ");
    }
    System.out.println("Postorder Iterator = " + stringBuilder.toString().trim());
  }
}
