package com.brickgit.kata.java.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringTest {

  @Test
  public void zigZag() {
    assertEquals("PAYPALISHIRING", Substring.zigZag("PAYPALISHIRING", 1));
    assertEquals("PYAIHRNAPLSIIG", Substring.zigZag("PAYPALISHIRING", 2));
    assertEquals("PAHNAPLSIIGYIR", Substring.zigZag("PAYPALISHIRING", 3));
    assertEquals("PINALSIGYAHRPI", Substring.zigZag("PAYPALISHIRING", 4));
    assertEquals("PHASIYIRPLIGAN", Substring.zigZag("PAYPALISHIRING", 5));
  }

  @Test
  public void longestPalindromicSubstring() {
    assertEquals("ddd", Substring.longestPalindromicSubstring("abcdddba"));
    assertEquals("a", Substring.longestPalindromicSubstring("abcdba"));
  }
}
