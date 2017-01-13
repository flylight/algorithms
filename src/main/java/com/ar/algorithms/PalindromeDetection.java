package com.ar.algorithms;

/**
 * Task:
 * Detect if the given word is Palindrome or no.
 *
 * Example :
 * Given : "Anna" , answer : TRUE
 * Given : "World", answer : FALSE
 * Given : "Level", answer : TRUE
 *
 * Solution :
 * Compare pair of symbols and return FALSE immediately if they are different. Repeat this
 * operation for each symbols pair until we reach middle of the word.
 */
public final class PalindromeDetection {
  public static boolean isPalindrome(String word){
    word = word.toLowerCase();
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
