package com.ar.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for RotateArray implementation.
 */
public class PalindromeDetectionTest {

  @Test
  public void testPalindromeDetection() {
    assertTrue(PalindromeDetection.isPalindrome("Level"));
    assertTrue(PalindromeDetection.isPalindrome("anna"));
    assertFalse(PalindromeDetection.isPalindrome("Some"));
  }

}
