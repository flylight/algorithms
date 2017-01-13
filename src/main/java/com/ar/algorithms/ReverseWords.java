package com.ar.algorithms;

/**
 * Task:
 * Reverse words in sentence.
 *
 * Example:
 * Given: "Hello my dear friend", Result: "friend dear my Hello"
 *
 * Solution:
 * Reverse character order inside each word. All words except last will be reversed in FOR cycle.
 * Then we reverse char order in last word and then reverse all character in received sentence.
 *
 * As result of all this operations we will receive reversed words in sentence.
 */
public final class ReverseWords {
  public static String reverse(String sentence) {
    char[] sentenceChars = sentence.toCharArray();

    int wordStartIndex = 0;
    for(int i = 0; i < sentenceChars.length; i++){
      if (sentenceChars[i] == ' ') {
        reverse(sentenceChars, wordStartIndex, i);
        wordStartIndex = i + 1;
      }
    }

    reverse(sentenceChars, wordStartIndex, sentenceChars.length);
    reverse(sentenceChars, 0, sentenceChars.length);

    return String.copyValueOf(sentenceChars);
  }

  private static void reverse(char[] data, int start, int end){
    for(int i = 0; i < (end - start) / 2 ; i++){
      char temp = data[start + i];
      data[start + i] = data[end - i - 1];
      data[end - i - 1] = temp;
    }
  }
}
