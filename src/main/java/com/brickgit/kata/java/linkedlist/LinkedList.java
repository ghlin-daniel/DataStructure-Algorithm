package com.brickgit.kata.java.linkedlist;

/** Created by Daniel Lin on 2018/8/21. */
public class LinkedList {

  public LinkedListNode mHead;

  public LinkedList(LinkedListNode head) {
    mHead = head;
  }

  public LinkedList(Integer[] array) {
    if (array == null || array.length == 0 || array[0] == null) return;

    mHead = new LinkedListNode(array[0]);
    LinkedListNode pointer = mHead;
    for (int i = 1, len = array.length; i < len; i++) {
      Integer n = array[i];
      if (n == null) return;

      pointer.mNext = new LinkedListNode(n);
      pointer = pointer.mNext;
    }
  }

  public void reverse() {
    LinkedListNode tail = mHead;

    while (tail.mNext != null) {
      LinkedListNode pointer = tail.mNext;
      tail.mNext = pointer.mNext;
      pointer.mNext = mHead;
      mHead = pointer;
    }
  }

  public LinkedListNode middle() {
    LinkedListNode slow = mHead;
    LinkedListNode fast = mHead;

    while (fast != null && fast.mNext != null) {
      slow = slow.mNext;
      fast = fast.mNext.mNext;
    }

    return slow;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    LinkedListNode pointer = mHead;
    while (pointer != null) {
      stringBuilder.append(pointer.mNumber).append(" ");
      pointer = pointer.mNext;
    }

    return stringBuilder.toString().trim();
  }
}
