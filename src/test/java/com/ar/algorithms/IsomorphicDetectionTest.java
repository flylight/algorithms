package com.ar.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for RotateArray implementation.
 */
public class IsomorphicDetectionTest {

  @Test
  public void testIsomorphicStrings() {
    assertTrue(IsomorphicDetection.isIsomorphic("foo", "add"));
    assertTrue(IsomorphicDetection.isIsomorphic("223", "667"));
    assertFalse(IsomorphicDetection.isIsomorphic("122", "123"));
    assertFalse(IsomorphicDetection.isIsomorphic("123", "122"));
  }

}
