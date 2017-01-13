package com.ar.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for RotateArray implementation.
 */
public class RotateArrayTest {

  @Test
  public void testRotateArray() {

    int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    RotateArray.rotate(testArray, 3);

    assertTrue(Arrays.equals(new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6}, testArray));

  }

}
