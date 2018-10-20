package com.brickgit.kata.java.linkedlist;

/** Created by Daniel Lin on 2018/8/21. */
public class LinkedListNode {

  public Integer mNumber;
  public LinkedListNode mNext;

  public LinkedListNode(Integer number) {
    mNumber = number;
  }

  public LinkedListNode(Integer number, LinkedListNode next) {
    mNumber = number;
    mNext = next;
  }
}
