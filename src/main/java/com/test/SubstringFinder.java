package com.test;

public class SubstringFinder {

    public static int findLastSubstringEntry(char[] str, char[] substr) {
        if (substr.length == 0 || substr.length > str.length) return  -1;
        int result = -1;
        for (int i = str.length - 1; i >= substr.length - 1 ; i--) {
            if (checkSubsequence(str, substr, i)) return i - substr.length + 1;
        }
        return result;
    }

    private static boolean checkSubsequence(char[] str, char[] substr, int i) {
        for (int j = 0; j < substr.length; j++) {
            int strIndex = i - j;
            int substrIndex = substr.length - 1 - j;
            if (str[strIndex] != substr[substrIndex]) return false;
        }
        return true;
    }
}
