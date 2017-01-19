package com.ar.algorithms;

/**
 * Task:
 * Detect if given strings are Isomorphic.
 *
 * Explanation:
 * Isomorphic is a things that have same (equal) form (shape). For example "122" is isomorphism for "455"
 * and "foo" is isomorphism for "add". But "123" is not isomorphism for "122" and "dad" is not for "bag"
 *
 * Solution :
 * Use two dimension array to create mapping between characters from string A to string B. Iterating via
 * A & B characters and if relation between them are not present on array then add them and go into next
 * pair. If character from A or B string was found on their positions but relation are not true (relation
 * is true only if characters from A & B strings are the same, but not if only one) then strings are not
 * isomorphic, otherwise move into next pair.
 *
 * When we check all character painr from A & B strings and all validation is TRUE then strings are
 * isomorphic.
 */
public final class IsomorphicDetection {

  public static boolean isIsomorphic(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }

    char[][] mappingArray = new char[a.length()][2];

    for (int i = 0; i < a.length(); i++) {
      char aChar = a.charAt(i);
      char bChar = b.charAt(i);
      //If elements wasn't putted or mapping is not correct then strings are not isomorphic
      if (!putIfAbsentOrCheckIfEqual(mappingArray, aChar, bChar)) {
        return false;
      }
    }
    return true;
  }

  private static boolean putIfAbsentOrCheckIfEqual(char[][] mappingArray, char aChar, char bChar) {
    for(int i = 0; i < mappingArray.length; i++){
      if (mappingArray[i][0] == aChar) {
        // Check if aChar mapped to bChar
        return mappingArray[i][1] == bChar;
      } else if (mappingArray[i][1] == bChar){
        // If aChar doesn't found yet but bChar already found then it is not Isomorphism
        return false;
      } else if (mappingArray[i][0] == '\u0000') {
        // If aChar & bChar not found yet but empty char found then put new mapping into array.
        mappingArray[i][0] = aChar;
        mappingArray[i][1] = bChar;
        return true;
      }
    }
    return false;
  }
}
