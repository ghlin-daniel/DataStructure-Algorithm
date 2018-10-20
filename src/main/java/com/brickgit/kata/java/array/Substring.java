package com.brickgit.kata.java.array;

public class Substring {

  public static String zigZag(String s, int n) {
    if (n <= 1) return s;

    StringBuilder sb = new StringBuilder();

    int offset = 2 * n - 2;
    for (int i = 0; i < n; i++) {
      for (int idx = i; idx < s.length(); ) {
        sb.append(s.charAt(idx));
        idx += offset;
        if (i != 0 && i != n - 1) {
          int stepBackIdx = idx - 2 * i;
          if (stepBackIdx >= 0 && stepBackIdx < s.length()) {
            sb.append(s.charAt(stepBackIdx));
          }
        }
      }
    }

    return sb.toString();
  }

  public static String longestPalindromicSubstring(String s) {
    if (s == null || s.isEmpty()) return "";
    if (s.length() == 1) return s;

    int maxStart = 0, maxLen = 1;

    for (int i = 0; i < s.length(); ) {
      if (s.length() - i <= maxLen / 2) {
        break;
      }

      int head = i, tail = i;
      while (tail < s.length() - 1 && s.charAt(tail) == s.charAt(tail + 1)) {
        tail++;
      }
      i = tail + 1;

      while (head > 0 && tail < s.length() - 1 && s.charAt(head - 1) == s.charAt(tail + 1)) {
        head--;
        tail++;
      }

      int newLen = tail - head + 1;
      if (newLen > maxLen) {
        maxStart = head;
        maxLen = newLen;
      }
    }

    return s.substring(maxStart, maxStart + maxLen);
  }
}
