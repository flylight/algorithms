package com.ar.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for RotateArray implementation.
 */
public class ReverseWordsTest {

  @Test
  public void testReverseWords() {
    assertEquals("life my in thing best The", ReverseWords.reverse("The best thing in my life"));
  }

}
