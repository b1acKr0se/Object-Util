package com.github.kakavip.util;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ObjectUtilTest {

    @Test
    public void test_equals_differentReference() throws Exception {
        assertTrue(ObjectUtil.equals(new String("Test"), new String("Test")));
    }

    @Test
    public void test_equals_sameReference() throws Exception {
        String a = "Test";
        String b = "Test";
        assertTrue(ObjectUtil.equals(a, b));
    }
}
