package com.test;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubstringFinderTest {

    @Test
    public void testFindLastSubstringEntry1() {
        String str = "abcabc11";
        String substr = "abc";

        assertEquals(3, SubstringFinder.findLastSubstringEntry(str.toCharArray(), substr.toCharArray()));
    }

    @Test
    public void testFindLastSubstringEntry2() {
        String str = "abcabc11";
        String substr = "b";

        assertEquals(4, SubstringFinder.findLastSubstringEntry(str.toCharArray(), substr.toCharArray()));
    }

    @Test
    public void testFindLastSubstringEntry3() {
        String str = "abcabc11";
        String substr = "abcabc11";

        assertEquals(0, SubstringFinder.findLastSubstringEntry(str.toCharArray(), substr.toCharArray()));
    }

    @Test
    public void testFindLastSubstringEntry4() {
        String str = "abcabc11";
        String substr = "abcabc112";

        assertEquals(-1, SubstringFinder.findLastSubstringEntry(str.toCharArray(), substr.toCharArray()));
    }

    @Test
    public void testFindLastSubstringEntry5() {
        String str = "abcabc11";
        String substr = "";

        assertEquals(-1, SubstringFinder.findLastSubstringEntry(str.toCharArray(), substr.toCharArray()));
    }
}
