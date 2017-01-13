package com.ar.algorithms;

/**
 * Task:
 * Rotate array by given steps. Example :
 * Array : [1,2,3,4,5,6,7,8] , Steps : 3 , Answer: [6,7,8,1,2,3,4,5]
 *
 * Solution:
 *
 * This is "bubble" approach. It means that each last element will me moved one by one into
 * first element. And this operation will be repeated for "Steps" number.
 */
public final class RotateArray {
  public static void rotate(int[] array, int steps) {
    for(int i = 0; i<steps; i++) {
      for (int j = array.length - 1; j > 0; j--) {
        array[j] += array[j - 1];
        array[j - 1] = array[j] - array[j - 1];
        array[j] -= array[j - 1];
      }
    }
  }
}
