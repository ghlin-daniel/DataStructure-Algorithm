package com.brickgit.kata.java.queue;

import java.util.Stack;

/**
 * Created by Daniel Lin on 2018/8/11.
 *
 * <p>Queue implementation using stacks
 */
public class StackQueue {
  Stack<Integer> stackIn = new Stack<>();
  Stack<Integer> stackSwap = new Stack<>();

  public void add(Integer n) {
    while (!stackIn.isEmpty()) {
      stackSwap.push(stackIn.pop());
    }
    stackIn.push(n);
    while (!stackSwap.isEmpty()) {
      stackIn.push(stackSwap.pop());
    }
  }

  public Integer remove() {
    return stackIn.isEmpty() ? null : stackIn.pop();
  }

  public int size() {
    return stackIn.size();
  }
}
